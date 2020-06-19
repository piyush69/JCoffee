import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16022021 {
public MyHelperClass findById(Connection o0, String o1){ return null; }
public MyHelperClass setPsParams(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass closeConnectWithTransaction(Connection o0){ return null; }
public MyHelperClass SqlUtil;
	public MyHelperClass ConnectUtil;
	public MyHelperClass PojoParser;
	public MyHelperClass cls;
	public MyHelperClass result;
	public MyHelperClass getCls(){ return null; }

    public boolean copy(long id)  throws Throwable {
        boolean bool = false;
        this.result = null;
        Connection conn = null;
        Object vo = null;
        try {
            PojoParser parser =(PojoParser)(Object) PojoParser.getInstances();
            conn =(Connection)(Object) ConnectUtil.getConnect();
            conn.setAutoCommit(false);
            String sql =(String)(Object) SqlUtil.getInsertSql(this.getCls());
            vo = this.findById(conn, "select * from " + parser.getTableName(cls) + " where " + parser.getPriamryKey(cls) + "=" + id);
            String pk =(String)(Object) parser.getPriamryKey(cls);
            this.getClass().getMethod("set" + SqlUtil.getFieldName(pk), new Class[] { long.class }).invoke(vo, new Object[] { 0 });
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            setPsParams(ps, vo);
            ps.executeUpdate();
            ps.close();
            conn.commit();
            bool = true;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
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
	public MyHelperClass getInstances(){ return null; }
	public MyHelperClass getFieldName(String o0){ return null; }
	public MyHelperClass getConnect(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PojoParser {

public MyHelperClass getTableName(MyHelperClass o0){ return null; }
	public MyHelperClass getPriamryKey(MyHelperClass o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}
