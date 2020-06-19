import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15301114 {
public MyHelperClass buildCommaSeparatedList(ArrayList<THLEventStatus o0){ return null; }

    public void updateFailedStatus(THLEventStatus failedEvent, ArrayList<THLEventStatus> events) throws Throwable, THLException {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Statement stmt = null;
        PreparedStatement pstmt = null;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(false);
            if (events != null && events.size() > 0) {
                String seqnoList = buildCommaSeparatedList(events);
//                MyHelperClass conn = new MyHelperClass();
                stmt = conn.createStatement();
                MyHelperClass THLEvent = new MyHelperClass();
                stmt.executeUpdate("UPDATE history SET status = " + THLEvent.FAILED + ", comments = 'Event was rollbacked due to failure while processing event#" + failedEvent.getSeqno() + "'" + ", processed_tstamp = " + conn.getNowFunction() + " WHERE seqno in " + seqnoList);
            }
//            MyHelperClass conn = new MyHelperClass();
            pstmt = conn.prepareStatement("UPDATE history SET status = ?" + ", comments = ?" + ", processed_tstamp = ?" + " WHERE seqno = ?");
            MyHelperClass THLEvent = new MyHelperClass();
            pstmt.setShort(1, THLEvent.FAILED);
            MyHelperClass commentLength = new MyHelperClass();
            pstmt.setString(2, truncate(failedEvent.getException() != null ? failedEvent.getException().getMessage() : "Unknown failure", commentLength));
            pstmt.setTimestamp(3, now);
            pstmt.setLong(4, failedEvent.getSeqno());
            pstmt.executeUpdate();
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
public MyHelperClass FAILED;
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

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class Statement {

public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
