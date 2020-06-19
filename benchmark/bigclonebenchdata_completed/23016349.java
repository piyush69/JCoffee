import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23016349 {
public MyHelperClass DB;

    public boolean updateLOB(String sql, int displayType, Object value) throws Throwable, RemoteException {
        if (sql == null || value == null) {
            MyHelperClass log = new MyHelperClass();
            log.fine("No sql or data");
            return false;
        }
        MyHelperClass log = new MyHelperClass();
        log.fine(sql);
        MyHelperClass m_updateLOBCount = new MyHelperClass();
        m_updateLOBCount++;
        boolean success = true;
        MyHelperClass Connection = new MyHelperClass();
        Connection con =(Connection)(Object) DB.createConnection(false, Connection.TRANSACTION_READ_COMMITTED);
        PreparedStatement pstmt = null;
        try {
            pstmt =(PreparedStatement)(Object) con.prepareStatement(sql);
            MyHelperClass DisplayType = new MyHelperClass();
            if (displayType == (int)(Object)DisplayType.TextLong) pstmt.setString(1, (String) value); else pstmt.setBytes(1, (byte[]) value);
            int no =(int)(Object) pstmt.executeUpdate();
            pstmt.close();
            pstmt = null;
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.FINE, sql, e);
            success = false;
        }
        try {
            if (pstmt != null) pstmt.close();
            pstmt = null;
        } catch (Exception e) {
            pstmt = null;
        }
        if (success) {
            try {
                con.commit();
                con.close();
                con = null;
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.SEVERE, "commit", e);
                success = false;
            }
        }
        if (!success) {
//            MyHelperClass log = new MyHelperClass();
            log.severe("rollback");
            try {
                con.rollback();
                con.close();
                con = null;
            } catch (Exception ee) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.SEVERE, "rollback", ee);
            }
        }
        try {
            if (con != null) con.close();
            con = null;
        } catch (Exception e) {
            con = null;
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int m_updateLOBCount;
	public MyHelperClass SEVERE;
	public MyHelperClass TextLong;
	public MyHelperClass FINE;
	public MyHelperClass TRANSACTION_READ_COMMITTED;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass createConnection(boolean o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}
