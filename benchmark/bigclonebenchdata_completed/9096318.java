
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9096318 {
public MyHelperClass openOutageExists(Connection o0, long o1, String o2){ return null; }
public MyHelperClass EventConstants;
	public MyHelperClass convertEventTimeIntoTimestamp(String o0){ return null; }

    private void handleInterfaceUp(long eventID, long nodeID, String ipAddr, String eventTime) {
        MyHelperClass ThreadCategory = new MyHelperClass();
        Category log =(Category)(Object) ThreadCategory.getInstance(OutageWriter.class);
        if (eventID == -1 || nodeID == -1 || ipAddr == null) {
            MyHelperClass EventConstants = new MyHelperClass();
            log.warn(EventConstants.INTERFACE_UP_EVENT_UEI + " ignored - info incomplete - eventid/nodeid/ipAddr: " + eventID + "/" + nodeID + "/" + ipAddr);
            return;
        }
        Connection dbConn = null;
        try {
            MyHelperClass DatabaseConnectionFactory = new MyHelperClass();
            dbConn =(Connection)(Object) DatabaseConnectionFactory.getInstance().getConnection();
            if ((boolean)(Object)openOutageExists(dbConn, nodeID, ipAddr)) {
                try {
                    dbConn.setAutoCommit(false);
                } catch (UncheckedIOException sqle) {
                    log.error("Unable to change database AutoCommit to FALSE",(SQLException)(Object) sqle);
                    return;
                }
                MyHelperClass OutageConstants = new MyHelperClass();
                PreparedStatement outageUpdater =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_UPDATE_OUTAGES_FOR_INTERFACE);
                outageUpdater.setLong(1, eventID);
                outageUpdater.setTimestamp(2, convertEventTimeIntoTimestamp(eventTime));
                outageUpdater.setLong(3, nodeID);
                outageUpdater.setString(4, ipAddr);
                int count =(int)(Object) outageUpdater.executeUpdate();
                outageUpdater.close();
                try {
                    dbConn.commit();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("handleInterfaceUp: interfaceUp closed " + count + " outages for nodeid/ip " + nodeID + "/" + ipAddr + " in DB");
                } catch (UncheckedIOException se) {
                    log.warn("Rolling back transaction, interfaceUp could not be recorded for nodeId/ipaddr: " + nodeID + "/" + ipAddr,(SQLException)(Object) se);
                    try {
                        dbConn.rollback();
                    } catch (UncheckedIOException sqle) {
                        log.warn("SQL exception during rollback, reason: ",(SQLException)(Object) sqle);
                    }
                }
            } else {
                log.warn("\'" + EventConstants.INTERFACE_UP_EVENT_UEI + "\' for " + nodeID + "/" + ipAddr + " ignored.");
            }
        } catch (UncheckedIOException se) {
            log.warn("SQL exception while handling \'interfaceUp\'",(SQLException)(Object) se);
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
public MyHelperClass DB_UPDATE_OUTAGES_FOR_INTERFACE;
	public MyHelperClass INTERFACE_UP_EVENT_UEI;
public MyHelperClass getInstance(Class<OutageWriter> o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

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
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}
