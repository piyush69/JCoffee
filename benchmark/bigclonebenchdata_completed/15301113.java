import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15301113 {
public MyHelperClass THLEvent;
	public MyHelperClass buildCommaSeparatedList(ArrayList<THLEventStatus o0){ return null; }

    public void updateSuccessStatus(ArrayList<THLEventStatus> succeededEvents, ArrayList<THLEventStatus> skippedEvents) throws Throwable, THLException {
        Statement stmt = null;
        PreparedStatement pstmt = null;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(false);
            if (succeededEvents != null && succeededEvents.size() > 0) {
//                MyHelperClass conn = new MyHelperClass();
                stmt = conn.createStatement();
                String seqnoList = buildCommaSeparatedList(succeededEvents);
                MyHelperClass history = new MyHelperClass();
                stmt.executeUpdate("UPDATE " + history + " SET status = " + THLEvent.COMPLETED + ", processed_tstamp = " + conn.getNowFunction() + " WHERE seqno in " + seqnoList);
            }
            if (skippedEvents != null && skippedEvents.size() > 0) {
                MyHelperClass history = new MyHelperClass();
                pstmt = conn.prepareStatement("UPDATE " + history + " SET status = ?, comments = ?," + " processed_tstamp = ? WHERE seqno = ?");
                Timestamp now = new Timestamp(System.currentTimeMillis());
                for (THLEventStatus event : skippedEvents) {
                    MyHelperClass THLEvent = new MyHelperClass();
                    pstmt.setShort(1, THLEvent.SKIPPED);
                    MyHelperClass commentLength = new MyHelperClass();
                    pstmt.setString(2, truncate(event.getException() != null ? event.getException().getMessage() : "Unknown event failure", commentLength));
                    pstmt.setTimestamp(3, now);
                    pstmt.setLong(4, event.getSeqno());
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
                pstmt.close();
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (SQLException e) {
            THLException exception = new THLException("Failed to update events status");
            exception.initCause(e);
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (SQLException e1) {
                THLException exception2 = new THLException("Failed to rollback after failure while updating events status");
                e1.initCause(exception);
                exception2.initCause(e1);
                exception = exception2;
            }
            throw exception;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignore) {
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException ignore) {
                }
            }
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.setAutoCommit(true);
            } catch (SQLException ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SKIPPED;
public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getNowFunction(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class THLEventStatus {

public MyHelperClass getSeqno(){ return null; }
	public MyHelperClass getException(){ return null; }}

class THLException extends Exception{
	public THLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
