
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9096314 {
public MyHelperClass openOutageExists(Connection o0, long o1, String o2, long o3){ return null; }
public MyHelperClass convertEventTimeIntoTimestamp(String o0){ return null; }

    private void handleNodeLostService(long eventID, long nodeID, String ipAddr, long serviceID, String eventTime) {
        MyHelperClass ThreadCategory = new MyHelperClass();
        Category log =(Category)(Object) ThreadCategory.getInstance(OutageWriter.class);
        if (eventID == -1 || nodeID == -1 || ipAddr == null || serviceID == -1) {
            MyHelperClass EventConstants = new MyHelperClass();
            log.warn(EventConstants.NODE_REGAINED_SERVICE_EVENT_UEI + " ignored - info incomplete - eventid/nodeid/ip/svc: " + eventID + "/" + nodeID + "/" + ipAddr + "/" + serviceID);
            return;
        }
        Connection dbConn = null;
        try {
            MyHelperClass DatabaseConnectionFactory = new MyHelperClass();
            dbConn =(Connection)(Object) DatabaseConnectionFactory.getInstance().getConnection();
            if ((boolean)(Object)openOutageExists(dbConn, nodeID, ipAddr, serviceID)) {
                MyHelperClass EventConstants = new MyHelperClass();
                log.warn("\'" + EventConstants.NODE_LOST_SERVICE_EVENT_UEI + "\' for " + nodeID + "/" + ipAddr + "/" + serviceID + " ignored - table already  has an open record ");
            } else {
                MyHelperClass OutageManagerConfigFactory = new MyHelperClass();
                PreparedStatement getNextOutageIdStmt =(PreparedStatement)(Object) dbConn.prepareStatement(OutageManagerConfigFactory.getInstance().getGetNextOutageID());
                long outageID = -1;
                ResultSet seqRS =(ResultSet)(Object) getNextOutageIdStmt.executeQuery();
                if ((boolean)(Object)seqRS.next()) {
                    outageID =(long)(Object) seqRS.getLong(1);
                }
                seqRS.close();
                try {
                    dbConn.setAutoCommit(false);
                } catch (UncheckedIOException sqle) {
                    log.error("Unable to change database AutoCommit to FALSE",(SQLException)(Object) sqle);
                    return;
                }
                PreparedStatement newOutageWriter = null;
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("handleNodeLostService: creating new outage entry...");
                MyHelperClass OutageConstants = new MyHelperClass();
                newOutageWriter =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_INS_NEW_OUTAGE);
                newOutageWriter.setLong(1, outageID);
                newOutageWriter.setLong(2, eventID);
                newOutageWriter.setLong(3, nodeID);
                newOutageWriter.setString(4, ipAddr);
                newOutageWriter.setLong(5, serviceID);
                newOutageWriter.setTimestamp(6, convertEventTimeIntoTimestamp(eventTime));
                newOutageWriter.executeUpdate();
                newOutageWriter.close();
                try {
                    dbConn.commit();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("nodeLostService : " + nodeID + "/" + ipAddr + "/" + serviceID + " recorded in DB");
                } catch (UncheckedIOException se) {
                    log.warn("Rolling back transaction, nodeLostService could not be recorded  for nodeid/ipAddr/service: " + nodeID + "/" + ipAddr + "/" + serviceID,(SQLException)(Object) se);
                    try {
                        dbConn.rollback();
                    } catch (UncheckedIOException sqle) {
                        log.warn("SQL exception during rollback, reason",(SQLException)(Object) sqle);
                    }
                }
            }
        } catch (UncheckedIOException sqle) {
            log.warn("SQL exception while handling \'nodeLostService\'",(SQLException)(Object) sqle);
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
public MyHelperClass NODE_LOST_SERVICE_EVENT_UEI;
	public MyHelperClass NODE_REGAINED_SERVICE_EVENT_UEI;
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

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
