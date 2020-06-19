import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19463255 {
public MyHelperClass DB;
	public MyHelperClass validateSecurityToken(SecurityToken o0){ return null; }

    public boolean updateLOB(String sql, int displayType, Object value, String trxName, SecurityToken token)  throws Throwable {
        validateSecurityToken(token);
        if (sql == null || value == null) {
            MyHelperClass log = new MyHelperClass();
            log.fine("No sql or data");
            return false;
        }
        MyHelperClass log = new MyHelperClass();
        log.fine(sql);
        Trx trx = null;
        if (trxName != null && trxName.trim().length() > 0) {
            MyHelperClass Trx = new MyHelperClass();
            trx =(Trx)(Object) Trx.get(trxName, false);
            if (trx == null) throw new RuntimeException("Transaction lost - " + trxName);
        }
        MyHelperClass m_updateLOBCount = new MyHelperClass();
        m_updateLOBCount++;
        boolean success = true;
        MyHelperClass Connection = new MyHelperClass();
        Connection con = trx != null ? trx.getConnection() : DB.createConnection(false, Connection.TRANSACTION_READ_COMMITTED);
        PreparedStatement pstmt = null;
        try {
            pstmt =(PreparedStatement)(Object) con.prepareStatement(sql);
            MyHelperClass DisplayType = new MyHelperClass();
            if (displayType == (int)(Object)DisplayType.TextLong) pstmt.setString(1, (String) value); else pstmt.setBytes(1, (byte[]) value);
            int no =(int)(Object) pstmt.executeUpdate();
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.FINE, sql, e);
            success = false;
        } finally {
            MyHelperClass DB = new MyHelperClass();
            DB.close(pstmt);
            pstmt = null;
        }
        if (success && trx == null) {
            try {
                con.commit();
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.SEVERE, "commit", e);
                success = false;
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                }
                con = null;
            }
        }
        if (!success) {
//            MyHelperClass log = new MyHelperClass();
            log.severe("rollback");
            if (trx == null) {
                try {
                    con.rollback();
                } catch (Exception ee) {
                    MyHelperClass Level = new MyHelperClass();
                    log.log(Level.SEVERE, "rollback", ee);
                } finally {
                    try {
                        con.close();
                    } catch (SQLException e) {
                    }
                    con = null;
                }
            } else {
                trx.rollback();
            }
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
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass get(String o0, boolean o1){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }}

class SecurityToken {

}

class Trx {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
