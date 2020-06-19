import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18413512 {
public MyHelperClass m_tableName;
	public MyHelperClass log;
	public MyHelperClass m_columnName;
	public MyHelperClass DisplayType;
	public MyHelperClass SecurityToken;

    public boolean save(String trxName)  throws Throwable {
        MyHelperClass m_value = new MyHelperClass();
        if (m_value == null || (!((String)(Object)m_value instanceof String ||(byte[])(Object) m_value instanceof byte[])) || ((String)(Object)m_value instanceof String && m_value.toString().length() == 0) || ((byte[])(Object)m_value instanceof byte[] && ((byte[])(byte[])(Object) m_value).length == 0)) {
            MyHelperClass m_whereClause = new MyHelperClass();
            StringBuffer sql = new StringBuffer("UPDATE ").append(m_tableName).append(" SET ").append(m_columnName).append("=null WHERE ").append(m_whereClause);
            MyHelperClass DB = new MyHelperClass();
            int no =(int)(Object) DB.executeUpdate(sql.toString(), trxName);
//            MyHelperClass m_value = new MyHelperClass();
            log.fine("save [" + trxName + "] #" + no + " - no data - set to null - " + m_value);
            MyHelperClass log = new MyHelperClass();
            if (no == 0) log.warning("[" + trxName + "] - not updated - " + sql);
            return true;
        }
        MyHelperClass m_whereClause = new MyHelperClass();
        StringBuffer sql = new StringBuffer("UPDATE ").append(m_tableName).append(" SET ").append(m_columnName).append("=? WHERE ").append(m_whereClause);
        boolean success = true;
        MyHelperClass DB = new MyHelperClass();
        if ((boolean)(Object)DB.isRemoteObjects()) {
//            MyHelperClass m_value = new MyHelperClass();
            log.fine("[" + trxName + "] - Remote - " + m_value);
            MyHelperClass CConnection = new MyHelperClass();
            Server server =(Server)(Object) CConnection.get().getServer();
            try {
                if (server != null) {
                    MyHelperClass m_displayType = new MyHelperClass();
                    success =(boolean)(Object) server.updateLOB(sql.toString(), m_displayType, m_value, trxName, SecurityToken.getInstance());
                    MyHelperClass CLogMgt = new MyHelperClass();
                    if ((boolean)(Object)CLogMgt.isLevelFinest()) log.fine("server.updateLOB => " + success);
                    return success;
                }
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.SEVERE, "AppsServer not found");
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                log.log(Level.SEVERE, "AppsServer error", ex);
            }
            return false;
        }
//        MyHelperClass m_value = new MyHelperClass();
        log.fine("[" + trxName + "] - Local - " + m_value);
        Trx trx = null;
        MyHelperClass Trx = new MyHelperClass();
        if (trxName != null) trx =(Trx)(Object) Trx.get(trxName, false);
        Connection con = null;
        if (trx != null) con =(Connection)(Object) trx.getConnection();
        MyHelperClass Connection = new MyHelperClass();
        if (con == null) con =(Connection)(Object) DB.createConnection(false, Connection.TRANSACTION_READ_COMMITTED);
        if (con == null) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "Could not get Connection");
            return false;
        }
        PreparedStatement pstmt = null;
        success = true;
        try {
            pstmt =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
            MyHelperClass m_displayType = new MyHelperClass();
            if (m_displayType == DisplayType.TextLong) pstmt.setString(1, (String)(String)(Object) m_value); else pstmt.setBytes(1, (byte[])(byte[])(Object) m_value);
            int no =(int)(Object) pstmt.executeUpdate();
            if (no != 1) {
                MyHelperClass log = new MyHelperClass();
                log.warning("[" + trxName + "] - Not updated #" + no + " - " + sql);
                success = false;
            }
        } catch (Throwable e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "[" + trxName + "] - " + sql, e);
            success = false;
        } finally {
//            MyHelperClass DB = new MyHelperClass();
            DB.close(pstmt);
            pstmt = null;
        }
        if (success) {
            if (trx != null) {
                trx = null;
                con = null;
            } else {
                try {
                    con.commit();
                } catch (Exception e) {
                    MyHelperClass Level = new MyHelperClass();
                    log.log(Level.SEVERE, "[" + trxName + "] - commit ", e);
                    success = false;
                } finally {
                    try {
                        con.close();
                    } catch (UncheckedIOException e) {
                    }
                    con = null;
                }
            }
        }
        if (!success) {
            MyHelperClass log = new MyHelperClass();
            log.severe("[" + trxName + "] - rollback");
            if (trx != null) {
                trx.rollback();
                trx = null;
                con = null;
            } else {
                try {
                    con.rollback();
                } catch (Exception ee) {
                    MyHelperClass Level = new MyHelperClass();
                    log.log(Level.SEVERE, "[" + trxName + "] - rollback", ee);
                } finally {
                    try {
                        con.close();
                    } catch (UncheckedIOException e) {
                    }
                    con = null;
                }
            }
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TextLong;
	public MyHelperClass SEVERE;
	public MyHelperClass TRANSACTION_READ_COMMITTED;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass createConnection(boolean o0, MyHelperClass o1){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0, String o1){ return null; }
	public MyHelperClass getServer(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass isLevelFinest(){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass get(String o0, boolean o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass isRemoteObjects(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, RemoteException o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }}

class Server {

public MyHelperClass updateLOB(String o0, MyHelperClass o1, MyHelperClass o2, String o3, MyHelperClass o4){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class Trx {

public MyHelperClass getConnection(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBytes(int o0, byte[] o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
