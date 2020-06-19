
import java.io.UncheckedIOException;


class c20068372 {
public MyHelperClass messages;
	public MyHelperClass AuditTrailManager;
	public MyHelperClass RecordIdTracker;
	public MyHelperClass GWT;
	public MyHelperClass LogUtility;
	public MyHelperClass TermUpdater;
	public MyHelperClass TopicRetrievalServiceImpl;
	public MyHelperClass Level;
	public MyHelperClass TopicUpdateServiceImpl;
	public MyHelperClass DatabaseConnector;
	public MyHelperClass AuditableEvent;
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass initSignedOnUser(String o0){ return null; }
	public MyHelperClass validateUserIsSignedOn(String o0){ return null; }
	public MyHelperClass getSignedOnUser(String o0){ return null; }

//    @Override
    public DataUpdateResult updateRecord(String authToken, Record record, Filter filter, Field sourceField, InputModel inputmodel) throws DataOperationException {
        validateUserIsSignedOn(authToken);
        DataUpdateResult recordUpdateResult = new DataUpdateResult();
        HttpSession session =(HttpSession)(Object) getSession();
        if (record != null) {
            Connection connection = null;
            boolean updated = false;
            try {
                connection =(Connection)(Object) DatabaseConnector.getConnection();
                connection.setAutoCommit(false);
                recordUpdateResult.setMessage(messages.server_record_update_success(""));
                recordUpdateResult.setSuccessful(true);
                long userId =(long)(Object) getSignedOnUser(authToken).getUserId();
                AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(record, userId, AuditableEvent.EVENTYPE_UPDATE), authToken, session);
                if ((boolean)(Object)record.isTopicsChanged()) {
                    ArrayList currentTopics =(ArrayList)(Object) TopicRetrievalServiceImpl.getTopics(record.getRecordid(), getSession(), authToken);
                    TopicUpdateServiceImpl.removeRecordTopics(connection, currentTopics, record.getRecordid());
                    TopicUpdateServiceImpl.insertRecordTopics(connection, record.getTopics(), record.getRecordid());
                }
                ArrayList recordAttributes =(ArrayList)(Object) record.getRecordattributes();
                if (recordAttributes != null &&(int)(Object) recordAttributes.size() > 0) {
                    Iterator rItr =(Iterator)(Object) recordAttributes.iterator();
                    while ((boolean)(Object)rItr.hasNext()) {
                        RecordAttribute r =(RecordAttribute)(Object) rItr.next();
                        if ((int)(Object)r.getRecordattributeid() > 0) {
                            if (r.getArchivedtimestamp() == null) {
                                String rAtSql = "update tms.recordattributes set chardata = ? " + "where recordattributeid = ?";
                                PreparedStatement updateRecordAttribute =(PreparedStatement)(Object) connection.prepareStatement(rAtSql);
                                updateRecordAttribute.setString(1, r.getChardata());
                                updateRecordAttribute.setLong(2, r.getRecordattributeid());
                                updateRecordAttribute.executeUpdate();
                                AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(r, userId, AuditableEvent.EVENTYPE_UPDATE), authToken, session);
                            } else {
                                String rAtSql = "update tms.recordattributes set archivedtimestamp = now() where  recordattributeid = ?";
                                PreparedStatement updateRecordAttribute =(PreparedStatement)(Object) connection.prepareStatement(rAtSql);
                                updateRecordAttribute.setLong(1, r.getRecordattributeid());
                                updateRecordAttribute.executeUpdate();
                                AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(r, userId, AuditableEvent.EVENTYPE_DELETE), authToken, session);
                            }
                        } else {
                            String rAtSql = "insert into tms.recordattributes " + "(inputmodelfieldid, chardata, recordid) " + "values (?, ?, ?) returning recordattributeid";
                            PreparedStatement insertRecordAttribute =(PreparedStatement)(Object) connection.prepareStatement(rAtSql);
                            insertRecordAttribute.setLong(1, r.getInputmodelfieldid());
                            insertRecordAttribute.setString(2, r.getChardata());
                            insertRecordAttribute.setLong(3, record.getRecordid());
                            ResultSet result =(ResultSet)(Object) insertRecordAttribute.executeQuery();
                            if ((boolean)(Object)result.next()) {
                                long recordattributeid =(long)(Object) result.getLong("recordattributeid");
                                r.setRecordattributeid(recordattributeid);
                                AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(r, userId, AuditableEvent.EVENTYPE_CREATE), authToken, session);
                            }
                        }
                    }
                }
                ArrayList terms =(ArrayList)(Object) record.getTerms();
                Iterator termsItr =(Iterator)(Object) terms.iterator();
                while ((boolean)(Object)termsItr.hasNext()) {
                    Term term =(Term)(Object) termsItr.next();
                    if ((int)(Object)term.getTermid() != -1) TermUpdater.updateTerm(connection, term, userId, authToken, getSession()); else {
                        TermAdditionServiceImpl termAdder = new TermAdditionServiceImpl();
                        termAdder.addTerm(connection, term, userId, authToken, session);
                    }
                }
                connection.commit();
                updated = true;
                if (filter != null) RecordIdTracker.refreshRecordIdsInSessionByFilter(session, connection, true, filter, sourceField, authToken); else RecordIdTracker.refreshRecordIdsInSession(session, connection, false, authToken);
                RecordRetrievalServiceImpl retriever = new RecordRetrievalServiceImpl();
                Record updatedRecord =(Record)(Object) retriever.retrieveRecordByRecordId(initSignedOnUser(authToken), record.getRecordid(), session, false, inputmodel, authToken);
                recordUpdateResult.setResult(updatedRecord);
            } catch (Exception e) {
                if (!updated && connection != null) {
                    try {
                        connection.rollback();
                    } catch (UncheckedIOException e1) {
                        LogUtility.log(Level.SEVERE, session, messages.log_db_rollback(""), e1, authToken);
                        e1.printStackTrace();
                    }
                }
                recordUpdateResult.setFailed(true);
                if (updated) {
                    recordUpdateResult.setMessage(messages.server_record_update_retrieve(""));
                    recordUpdateResult.setException(e);
                    LogUtility.log(Level.SEVERE, session, messages.server_record_update_retrieve(""), e, authToken);
                } else {
                    recordUpdateResult.setMessage(messages.server_record_update_fail(""));
                    recordUpdateResult.setException(new PersistenceException((String)(Object)e));
                    LogUtility.log(Level.SEVERE, session, messages.server_record_update_fail(""), e, authToken);
                }
                GWT.log(recordUpdateResult.getMessage(), e);
            } finally {
                try {
                    if (connection != null) {
                        connection.setAutoCommit(true);
                        connection.close();
                    }
                } catch (Exception e) {
                    LogUtility.log(Level.SEVERE, session, messages.log_db_close(""), e, authToken);
                }
            }
        }
        return recordUpdateResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass EVENTYPE_UPDATE;
	public MyHelperClass EVENTYPE_CREATE;
	public MyHelperClass EVENTYPE_DELETE;
public MyHelperClass log_db_close(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, HttpSession o1, MyHelperClass o2, SQLException o3, String o4){ return null; }
	public MyHelperClass getTopics(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass server_record_update_fail(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass insertRecordTopics(Connection o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Exception o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, HttpSession o1, MyHelperClass o2, Exception o3, String o4){ return null; }
	public MyHelperClass updateTerm(Connection o0, Term o1, long o2, String o3, MyHelperClass o4){ return null; }
	public MyHelperClass log_db_rollback(String o0){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass createAuditTrailEvent(Record o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass server_record_update_retrieve(String o0){ return null; }
	public MyHelperClass updateAuditTrail(Connection o0, MyHelperClass o1, String o2, HttpSession o3){ return null; }
	public MyHelperClass refreshRecordIdsInSession(HttpSession o0, Connection o1, boolean o2, String o3){ return null; }
	public MyHelperClass server_record_update_success(String o0){ return null; }
	public MyHelperClass refreshRecordIdsInSessionByFilter(HttpSession o0, Connection o1, boolean o2, Filter o3, Field o4, String o5){ return null; }
	public MyHelperClass createAuditTrailEvent(RecordAttribute o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass removeRecordTopics(Connection o0, ArrayList o1, MyHelperClass o2){ return null; }}

class Record {

public MyHelperClass getTerms(){ return null; }
	public MyHelperClass getRecordattributes(){ return null; }
	public MyHelperClass getRecordid(){ return null; }
	public MyHelperClass getTopics(){ return null; }
	public MyHelperClass isTopicsChanged(){ return null; }}

class Filter {

}

class Field {

}

class InputModel {

}

class DataUpdateResult {

public MyHelperClass setResult(Record o0){ return null; }
	public MyHelperClass setSuccessful(boolean o0){ return null; }
	public MyHelperClass setException(Exception o0){ return null; }
	public MyHelperClass setMessage(MyHelperClass o0){ return null; }
	public MyHelperClass setFailed(boolean o0){ return null; }
	public MyHelperClass getMessage(){ return null; }
	public MyHelperClass setException(PersistenceException o0){ return null; }}

class DataOperationException extends Exception{
	public DataOperationException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class ArrayList {

public MyHelperClass size(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Topic {

}

class RecordAttribute {

public MyHelperClass getRecordattributeid(){ return null; }
	public MyHelperClass setRecordattributeid(long o0){ return null; }
	public MyHelperClass getArchivedtimestamp(){ return null; }
	public MyHelperClass getChardata(){ return null; }
	public MyHelperClass getInputmodelfieldid(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getLong(String o0){ return null; }}

class Term {

public MyHelperClass getTermid(){ return null; }}

class TermAdditionServiceImpl {

public MyHelperClass addTerm(Connection o0, Term o1, long o2, String o3, HttpSession o4){ return null; }}

class RecordRetrievalServiceImpl {

public MyHelperClass retrieveRecordByRecordId(MyHelperClass o0, MyHelperClass o1, HttpSession o2, boolean o3, InputModel o4, String o5){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}
