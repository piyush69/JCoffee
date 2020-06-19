
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9096315 {
public MyHelperClass openOutageExists(Connection o0, long o1, String o2, long o3){ return null; }
public MyHelperClass convertEventTimeIntoTimestamp(String o0){ return null; }

    private void handleInterfaceDown(long eventID, long nodeID, String ipAddr, String eventTime) {
        MyHelperClass ThreadCategory = new MyHelperClass();
        Category log =(Category)(Object) ThreadCategory.getInstance(OutageWriter.class);
        if (eventID == -1 || nodeID == -1 || ipAddr == null) {
            MyHelperClass EventConstants = new MyHelperClass();
            log.warn(EventConstants.INTERFACE_DOWN_EVENT_UEI + " ignored - info incomplete - eventid/nodeid/ip: " + eventID + "/" + nodeID + "/" + ipAddr);
            return;
        }
        Connection dbConn = null;
        try {
            MyHelperClass DatabaseConnectionFactory = new MyHelperClass();
            dbConn =(Connection)(Object) DatabaseConnectionFactory.getInstance().getConnection();
            try {
                dbConn.setAutoCommit(false);
            } catch (UncheckedIOException sqle) {
                log.error("Unable to change database AutoCommit to FALSE",(SQLException)(Object) sqle);
                return;
            }
            MyHelperClass OutageConstants = new MyHelperClass();
            PreparedStatement activeSvcsStmt =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_GET_ACTIVE_SERVICES_FOR_INTERFACE);
//            MyHelperClass OutageConstants = new MyHelperClass();
            PreparedStatement openStmt =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_OPEN_RECORD);
//            MyHelperClass OutageConstants = new MyHelperClass();
            PreparedStatement newOutageWriter =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_INS_NEW_OUTAGE);
            MyHelperClass OutageManagerConfigFactory = new MyHelperClass();
            PreparedStatement getNextOutageIdStmt =(PreparedStatement)(Object) dbConn.prepareStatement(OutageManagerConfigFactory.getInstance().getGetNextOutageID());
//            MyHelperClass OutageConstants = new MyHelperClass();
            newOutageWriter =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_INS_NEW_OUTAGE);
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("handleInterfaceDown: creating new outage entries...");
            activeSvcsStmt.setLong(1, nodeID);
            activeSvcsStmt.setString(2, ipAddr);
            ResultSet activeSvcsRS =(ResultSet)(Object) activeSvcsStmt.executeQuery();
            while ((boolean)(Object)activeSvcsRS.next()) {
                long serviceID =(long)(Object) activeSvcsRS.getLong(1);
                if ((boolean)(Object)openOutageExists(dbConn, nodeID, ipAddr, serviceID)) {
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("handleInterfaceDown: " + nodeID + "/" + ipAddr + "/" + serviceID + " already down");
                } else {
                    long outageID = -1;
                    ResultSet seqRS =(ResultSet)(Object) getNextOutageIdStmt.executeQuery();
                    if ((boolean)(Object)seqRS.next()) {
                        outageID =(long)(Object) seqRS.getLong(1);
                    }
                    seqRS.close();
                    newOutageWriter.setLong(1, outageID);
                    newOutageWriter.setLong(2, eventID);
                    newOutageWriter.setLong(3, nodeID);
                    newOutageWriter.setString(4, ipAddr);
                    newOutageWriter.setLong(5, serviceID);
                    newOutageWriter.setTimestamp(6, convertEventTimeIntoTimestamp(eventTime));
                    newOutageWriter.executeUpdate();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("handleInterfaceDown: Recording new outage for " + nodeID + "/" + ipAddr + "/" + serviceID);
                }
            }
            activeSvcsRS.close();
            try {
                dbConn.commit();
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("Outage recorded for all active services for " + nodeID + "/" + ipAddr);
            } catch (UncheckedIOException se) {
                log.warn("Rolling back transaction, interfaceDown could not be recorded  for nodeid/ipAddr: " + nodeID + "/" + ipAddr,(SQLException)(Object) se);
                try {
                    dbConn.rollback();
                } catch (UncheckedIOException sqle) {
                    log.warn("SQL exception during rollback, reason",(SQLException)(Object) sqle);
                }
            }
            activeSvcsStmt.close();
            openStmt.close();
            newOutageWriter.close();
        } catch (UncheckedIOException sqle) {
            log.warn("SQL exception while handling \'interfaceDown\'",(SQLException)(Object) sqle);
        } finally {
            try {
                if (dbConn != null) dbConn.close();
            } catch (UncheckedIOException e) {
                log.warn("Exception closing JDBC connection",(SQLException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DB_OPEN_RECORD;
	public MyHelperClass DB_GET_ACTIVE_SERVICES_FOR_INTERFACE;
	public MyHelperClass INTERFACE_DOWN_EVENT_UEI;
	public MyHelperClass DB_INS_NEW_OUTAGE;
public MyHelperClass getInstance(Class<OutageWriter> o0){ return null; }
	public MyHelperClass getGetNextOutageID(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Category {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class OutageWriter {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
