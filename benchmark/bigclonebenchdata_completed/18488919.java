import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18488919 {
public MyHelperClass CHANGED_IFINDEX;
	public MyHelperClass m_serviceId;
	public MyHelperClass m_changed;
	public MyHelperClass CHANGED_SOURCE;
	public MyHelperClass m_ifIndex;
	public MyHelperClass m_status;
	public MyHelperClass m_ipAddr;
	public MyHelperClass CHANGED_LASTFAIL;
	public MyHelperClass CHANGED_STATUS;
	public MyHelperClass CHANGED_NOTIFY;
	public MyHelperClass m_notify;
	public MyHelperClass CHANGED_LASTGOOD;
	public MyHelperClass m_lastGood;
	public MyHelperClass m_qualifier;
	public MyHelperClass CHANGED_QUALIFIER;
	public MyHelperClass m_lastFail;
	public MyHelperClass m_nodeId;
	public MyHelperClass m_source;
	public MyHelperClass m_fromDb;
	public MyHelperClass log(){ return null; }

    private void insert(Connection c) throws Throwable, SQLException {
        MyHelperClass m_fromDb = new MyHelperClass();
        if ((boolean)(Object)m_fromDb) throw new IllegalStateException("The record already exists in the database");
        StringBuffer names = new StringBuffer("INSERT INTO ifServices (nodeID,ipAddr,serviceID");
        StringBuffer values = new StringBuffer("?,?,?");
        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_IFINDEX) == CHANGED_IFINDEX) {
            values.append(",?");
            names.append(",ifIndex");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_STATUS) == CHANGED_STATUS) {
            values.append(",?");
            names.append(",status");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_LASTGOOD) == CHANGED_LASTGOOD) {
            values.append(",?");
            names.append(",lastGood");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_LASTFAIL) == CHANGED_LASTFAIL) {
            values.append(",?");
            names.append(",lastFail");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_SOURCE) == CHANGED_SOURCE) {
            values.append(",?");
            names.append(",source");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_NOTIFY) == CHANGED_NOTIFY) {
            values.append(",?");
            names.append(",notify");
        }
//        MyHelperClass m_changed = new MyHelperClass();
        if ((m_changed & (int)(Object)CHANGED_QUALIFIER) == CHANGED_QUALIFIER) {
            values.append(",?");
            names.append(",qualifier");
        }
        names.append(") VALUES (").append(values).append(')');
        if (log().isDebugEnabled()) log().debug("DbIfServiceEntry.insert: SQL insert statment = " + names.toString());
        PreparedStatement stmt = null;
        PreparedStatement delStmt = null;
        final DBUtils d = new DBUtils(getClass());
        try {
            stmt = c.prepareStatement(names.toString());
            d.watch(stmt);
            names = null;
            int ndx = 1;
            stmt.setInt(ndx++, m_nodeId);
            stmt.setString(ndx++, m_ipAddr.getHostAddress());
            stmt.setInt(ndx++, m_serviceId);
            if ((m_changed & (int)(Object)CHANGED_IFINDEX) == CHANGED_IFINDEX) stmt.setInt(ndx++, m_ifIndex);
            if ((m_changed & (int)(Object)CHANGED_STATUS) == CHANGED_STATUS) stmt.setString(ndx++, new String(new char[] { m_status }));
            if ((m_changed & (int)(Object)CHANGED_LASTGOOD) == CHANGED_LASTGOOD) {
                stmt.setTimestamp(ndx++, m_lastGood);
            }
            if ((m_changed & (int)(Object)CHANGED_LASTFAIL) == CHANGED_LASTFAIL) {
                stmt.setTimestamp(ndx++, m_lastFail);
            }
            if ((m_changed & (int)(Object)CHANGED_SOURCE) == CHANGED_SOURCE) stmt.setString(ndx++, new String(new char[] { m_source }));
            if ((m_changed & (int)(Object)CHANGED_NOTIFY) == CHANGED_NOTIFY) stmt.setString(ndx++, new String(new char[] { m_notify }));
            if ((m_changed & (int)(Object)CHANGED_QUALIFIER) == CHANGED_QUALIFIER) stmt.setString(ndx++, m_qualifier);
            int rc;
            try {
                rc = stmt.executeUpdate();
            } catch (SQLException e) {
                log().warn("ifServices DB insert got exception; will retry after " + "deletion of any existing records for this ifService " + "that are marked for deletion.", e);
                c.rollback();
                String delCmd = "DELETE FROM ifServices WHERE status = 'D' " + "AND nodeid = ? AND ipAddr = ? AND serviceID = ?";
                delStmt = c.prepareStatement(delCmd);
                d.watch(delStmt);
                delStmt.setInt(1, m_nodeId);
                delStmt.setString(2, m_ipAddr.getHostAddress());
                delStmt.setInt(3, m_serviceId);
                rc = delStmt.executeUpdate();
                rc = stmt.executeUpdate();
            }
            log().debug("insert(): SQL update result = " + rc);
        } finally {
            d.cleanUp();
        }
        m_fromDb =(MyHelperClass)(Object) true;
        m_changed =(MyHelperClass)(Object) 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass getHostAddress(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }}

class DBUtils {

DBUtils(Class<CAP#1> o0){}
	DBUtils(){}
	public MyHelperClass watch(PreparedStatement o0){ return null; }
	public MyHelperClass cleanUp(){ return null; }}
