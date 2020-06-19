
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9096320 {

    private void handleInterfaceReparented(String ipAddr, Parms eventParms) {
        MyHelperClass ThreadCategory = new MyHelperClass();
        Category log =(Category)(Object) ThreadCategory.getInstance(OutageWriter.class);
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("interfaceReparented event received...");
        if (ipAddr == null || eventParms == null) {
            MyHelperClass EventConstants = new MyHelperClass();
            log.warn(EventConstants.INTERFACE_REPARENTED_EVENT_UEI + " ignored - info incomplete - ip/parms: " + ipAddr + "/" + eventParms);
            return;
        }
        long oldNodeId = -1;
        long newNodeId = -1;
        String parmName = null;
        Value parmValue = null;
        String parmContent = null;
        Enumeration parmEnum =(Enumeration)(Object) eventParms.enumerateParm();
        while ((boolean)(Object)parmEnum.hasMoreElements()) {
            Parm parm = (Parm)(Parm)(Object) parmEnum.nextElement();
            parmName =(String)(Object) parm.getParmName();
            parmValue =(Value)(Object) parm.getValue();
            if (parmValue == null) continue; else parmContent =(String)(Object) parmValue.getContent();
            MyHelperClass EventConstants = new MyHelperClass();
            if (parmName.equals(EventConstants.PARM_OLD_NODEID)) {
                try {
                    oldNodeId = Integer.valueOf(parmContent).intValue();
                } catch (NumberFormatException nfe) {
//                    MyHelperClass EventConstants = new MyHelperClass();
                    log.warn("Parameter " + EventConstants.PARM_OLD_NODEID + " cannot be non-numeric");
                    oldNodeId = -1;
                }
//            MyHelperClass EventConstants = new MyHelperClass();
            } else if (parmName.equals(EventConstants.PARM_NEW_NODEID)) {
                try {
                    newNodeId = Integer.valueOf(parmContent).intValue();
                } catch (NumberFormatException nfe) {
//                    MyHelperClass EventConstants = new MyHelperClass();
                    log.warn("Parameter " + EventConstants.PARM_NEW_NODEID + " cannot be non-numeric");
                    newNodeId = -1;
                }
            }
        }
        if (newNodeId == -1 || oldNodeId == -1) {
            log.warn("Unable to process 'interfaceReparented' event, invalid event parm.");
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
            PreparedStatement reparentOutagesStmt =(PreparedStatement)(Object) dbConn.prepareStatement(OutageConstants.DB_REPARENT_OUTAGES);
            reparentOutagesStmt.setLong(1, newNodeId);
            reparentOutagesStmt.setLong(2, oldNodeId);
            reparentOutagesStmt.setString(3, ipAddr);
            int count =(int)(Object) reparentOutagesStmt.executeUpdate();
            try {
                dbConn.commit();
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("Reparented " + count + " outages - ip: " + ipAddr + " reparented from " + oldNodeId + " to " + newNodeId);
            } catch (UncheckedIOException se) {
                log.warn("Rolling back transaction, reparent outages failed for newNodeId/ipAddr: " + newNodeId + "/" + ipAddr);
                try {
                    dbConn.rollback();
                } catch (UncheckedIOException sqle) {
                    log.warn("SQL exception during rollback, reason",(SQLException)(Object) sqle);
                }
            }
            reparentOutagesStmt.close();
        } catch (UncheckedIOException se) {
            log.warn("SQL exception while handling \'interfaceReparented\'",(SQLException)(Object) se);
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
public MyHelperClass INTERFACE_REPARENTED_EVENT_UEI;
	public MyHelperClass PARM_NEW_NODEID;
	public MyHelperClass PARM_OLD_NODEID;
	public MyHelperClass DB_REPARENT_OUTAGES;
public MyHelperClass getInstance(Class<OutageWriter> o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Parms {

public MyHelperClass enumerateParm(){ return null; }}

class Category {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class OutageWriter {

}

class Value {

public MyHelperClass getContent(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class Parm {

public MyHelperClass getParmName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

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

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
