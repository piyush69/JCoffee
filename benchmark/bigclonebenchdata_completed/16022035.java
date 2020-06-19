import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16022035 {
public MyHelperClass setPsParams(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass closeConnectWithTransaction(Connection o0){ return null; }
public MyHelperClass SqlUtil;
	public MyHelperClass ConnectUtil;
	public MyHelperClass result;
	public MyHelperClass getCls(){ return null; }

    public boolean save(Object obj)  throws Throwable {
        boolean bool = false;
        this.result = null;
        if (obj == null) return bool;
        Connection conn = null;
        try {
            conn =(Connection)(Object) ConnectUtil.getConnect();
            conn.setAutoCommit(false);
            String sql =(String)(Object) SqlUtil.getInsertSql(this.getCls());
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            setPsParams(ps, obj);
            ps.executeUpdate();
            ps.close();
            conn.commit();
            bool = true;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (ArithmeticException e1) {
            }
            this.result =(MyHelperClass)(Object) e.getMessage();
        } finally {
            this.closeConnectWithTransaction(conn);
        }
        return bool;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInsertSql(MyHelperClass o0){ return null; }
	public MyHelperClass getConnect(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
