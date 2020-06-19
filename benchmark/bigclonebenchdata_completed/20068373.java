
import java.io.UncheckedIOException;


class c20068373 {
public MyHelperClass messages;
	public MyHelperClass AuditTrailManager;
	public MyHelperClass RecordIdTracker;
	public MyHelperClass GWT;
	public MyHelperClass TermUpdater;
	public MyHelperClass LogUtility;
	public MyHelperClass Level;
	public MyHelperClass TopicUpdateServiceImpl;
	public MyHelperClass DatabaseConnector;
	public MyHelperClass AuditableEvent;
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass validateUserHasAdminRights(String o0){ return null; }
	public MyHelperClass initSignedOnUser(String o0){ return null; }
	public MyHelperClass validateUserIsSignedOn(String o0){ return null; }
	public MyHelperClass getThreadLocalRequest(){ return null; }
	public MyHelperClass getSignedOnUser(String o0){ return null; }

//    @Override
    public DataUpdateResult archiveRecord(String authToken, Record record, Filter filter, Field sourceField, InputModel inputmodel) throws DataOperationException {
        validateUserIsSignedOn(authToken);
        validateUserHasAdminRights(authToken);
        DataUpdateResult recordUpdateResult = new DataUpdateResult();
        if (record != null) {
            Connection connection = null;
            boolean archived = false;
            try {
                long userId =(long)(Object) getSignedOnUser(authToken).getUserId();
                connection =(Connection)(Object) DatabaseConnector.getConnection();
                connection.setAutoCommit(false);
                recordUpdateResult.setMessage(messages.server_record_delete_success(""));
                recordUpdateResult.setSuccessful(true);
                String sql = "update tms.records set archivedtimestamp = now() where recordid = ?";
                PreparedStatement updateRecord =(PreparedStatement)(Object) connection.prepareStatement(sql);
                updateRecord.setLong(1, record.getRecordid());
                int recordArchived = 0;
                recordArchived =(int)(Object) updateRecord.executeUpdate();
                if (recordArchived > 0) AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(record, userId, AuditableEvent.EVENTYPE_DELETE), authToken, getSession());
                TopicUpdateServiceImpl.archiveRecordTopics(connection, record.getTopics(), record.getRecordid());
                ArrayList recordAttributes =(ArrayList)(Object) record.getRecordattributes();
                if (recordAttributes != null &&(int)(Object) recordAttributes.size() > 0) {
                    Iterator rItr =(Iterator)(Object) recordAttributes.iterator();
                    while ((boolean)(Object)rItr.hasNext()) {
                        RecordAttribute r =(RecordAttribute)(Object) rItr.next();
                        String rAtSql = "update tms.recordattributes set archivedtimestamp = now() where recordattributeid = ?";
                        PreparedStatement updateRecordAttribute =(PreparedStatement)(Object) connection.prepareStatement(rAtSql);
                        updateRecordAttribute.setLong(1, r.getRecordattributeid());
                        int recordAttribArchived = 0;
                        recordAttribArchived =(int)(Object) updateRecordAttribute.executeUpdate();
                        if (recordAttribArchived > 0) AuditTrailManager.updateAuditTrail(connection, AuditTrailManager.createAuditTrailEvent(r, userId, AuditableEvent.EVENTYPE_DELETE), authToken, getSession());
                    }
                }
                ArrayList terms =(ArrayList)(Object) record.getTerms();
                Iterator termsItr =(Iterator)(Object) terms.iterator();
                while ((boolean)(Object)termsItr.hasNext()) {
                    Term term =(Term)(Object) termsItr.next();
                    TermUpdater.archiveTerm(connection, term, userId, authToken, getSession());
                }
                connection.commit();
                archived = true;
                if (filter != null) RecordIdTracker.refreshRecordIdsInSessionByFilter(this.getThreadLocalRequest().getSession(), connection, true, filter, sourceField, authToken); else RecordIdTracker.refreshRecordIdsInSession(this.getThreadLocalRequest().getSession(), connection, false, authToken);
                RecordRetrievalServiceImpl retriever = new RecordRetrievalServiceImpl();
                RecordIdTracker.refreshRecordIdsInSession(this.getThreadLocalRequest().getSession(), connection, false, authToken);
                Record updatedRecord =(Record)(Object) retriever.retrieveRecordByRecordId(initSignedOnUser(authToken), record.getRecordid(), this.getThreadLocalRequest().getSession(), false, inputmodel, authToken);
                recordUpdateResult.setResult(updatedRecord);
            } catch (Exception e) {
                if (!archived && connection != null) {
                    try {
                        connection.rollback();
                    } catch (UncheckedIOException e1) {
                        LogUtility.log(Level.SEVERE, getSession(), messages.log_db_rollback(""), e1, authToken);
                        e1.printStackTrace();
                    }
                }
                recordUpdateResult.setFailed(true);
                if (archived) {
                    recordUpdateResult.setMessage(messages.server_record_delete_retrieve(""));
                    recordUpdateResult.setException(e);
                    LogUtility.log(Level.SEVERE, getSession(), messages.server_record_delete_retrieve(""), e, authToken);
                } else {
                    recordUpdateResult.setMessage(messages.server_record_delete_fail(""));
                    recordUpdateResult.setException(new PersistenceException((String)(Object)e));
                    LogUtility.log(Level.SEVERE, getSession(), messages.server_record_delete_fail(""), e, authToken);
                }
                GWT.log(recordUpdateResult.getMessage(), e);
            } finally {
                try {
                    if (connection != null) {
                        connection.setAutoCommit(true);
                        connection.close();
                    }
                } catch (Exception e) {
                    LogUtility.log(Level.SEVERE, getSession(), messages.log_db_close(""), e, authToken);
                }
            }
        }
        return recordUpdateResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass EVENTYPE_DELETE;
public MyHelperClass log_db_close(String o0){ return null; }
	public MyHelperClass server_record_delete_success(String o0){ return null; }
	public MyHelperClass archiveRecordTopics(Connection o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, SQLException o3, String o4){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Exception o1){ return null; }
	public MyHelperClass log_db_rollback(String o0){ return null; }
	public MyHelperClass refreshRecordIdsInSession(MyHelperClass o0, Connection o1, boolean o2, String o3){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass createAuditTrailEvent(Record o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass refreshRecordIdsInSessionByFilter(MyHelperClass o0, Connection o1, boolean o2, Filter o3, Field o4, String o5){ return null; }
	public MyHelperClass updateAuditTrail(Connection o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, Exception o3, String o4){ return null; }
	public MyHelperClass archiveTerm(Connection o0, Term o1, long o2, String o3, MyHelperClass o4){ return null; }
	public MyHelperClass createAuditTrailEvent(RecordAttribute o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass server_record_delete_fail(String o0){ return null; }
	public MyHelperClass server_record_delete_retrieve(String o0){ return null; }}

class Record {

public MyHelperClass getTopics(){ return null; }
	public MyHelperClass getRecordattributes(){ return null; }
	public MyHelperClass getRecordid(){ return null; }
	public MyHelperClass getTerms(){ return null; }}

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

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ArrayList {

public MyHelperClass size(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class RecordAttribute {

public MyHelperClass getRecordattributeid(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class Term {

}

class RecordRetrievalServiceImpl {

public MyHelperClass retrieveRecordByRecordId(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, boolean o3, InputModel o4, String o5){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
}
