import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16022022 {
public MyHelperClass findById(Connection o0, String o1){ return null; }
public MyHelperClass[] ids;
	public MyHelperClass closeConnectWithTransaction(Connection o0){ return null; }
	public MyHelperClass setPsParams(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass assembleObjToList(PreparedStatement o0){ return null; }
public MyHelperClass id;
	public MyHelperClass SqlUtil;
	public MyHelperClass ConnectUtil;
//	public MyHelperClass ids;
	public MyHelperClass PojoParser;
	public MyHelperClass cls;
	public MyHelperClass orgList;
	public MyHelperClass result;
	public MyHelperClass getCls(){ return null; }

    public boolean copy(Class<?> subCls, String subCol, long id)  throws Throwable {
        boolean bool = false;
        this.result = null;
        Connection conn = null;
        Object vo = null;
        try {
            conn =(Connection)(Object) ConnectUtil.getConnect();
            conn.setAutoCommit(false);
            PojoParser parser =(PojoParser)(Object) PojoParser.getInstances();
            String sql =(String)(Object) SqlUtil.getInsertSql(this.getCls());
            vo = this.findById(conn, "select * from " + parser.getTableName(cls) + " where " + parser.getPriamryKey(cls) + "=" + id);
            String pk =(String)(Object) parser.getPriamryKey(cls);
            this.getCls().getMethod("set" + SqlUtil.getFieldName(pk), new Class[] { long.class }).invoke(vo, new Object[] { 0 });
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            setPsParams(ps, vo);
            ps.executeUpdate();
            ps.close();
            long key =(long)(Object) this.id;
            parser =(PojoParser)(Object) PojoParser.getInstances();
            sql =(String)(Object) SqlUtil.getInsertSql(subCls);
            Class<?> clses =(Class<?>)(Object) this.cls;
            this.cls =(MyHelperClass)(Object) subCls;
            ps =(PreparedStatement)(Object) conn.prepareStatement("select * from " + parser.getTableName(subCls) + " where " + subCol + "=" + id);
            this.assembleObjToList(ps);
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ids =(MyHelperClass[])(Object)(MyHelperClass)(Object) new long[(int)(Object)orgList.size()];
            Method m =(Method)(Object) subCls.getMethod("set" + SqlUtil.getFieldName(subCol), new Class[] { long.class });
            for (int i = 0; i < (int)(Object)orgList.size(); ++i) {
                Object obj = orgList.get(i);
                subCls.getMethod("set" + SqlUtil.getFieldName((String)(Object)parser.getPriamryKey(subCls)), new Class[] { long.class }).invoke(obj, new Object[] { 0 });
                m.invoke(obj, new Object[] { key });
                setPsParams(ps, obj);
                ps.addBatch();
                if ((i % 100) == 0) ps.executeBatch();
                ids[i] = this.id;
            }
            ps.executeBatch();
            ps.close();
            conn.commit();
            this.cls =(MyHelperClass)(Object) clses;
            this.id =(MyHelperClass)(Object) key;
            bool = true;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
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

public MyHelperClass size(){ return null; }
	public MyHelperClass getInstances(){ return null; }
	public MyHelperClass invoke(Object o0, Object[] o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getFieldName(String o0){ return null; }
	public MyHelperClass getMethod(String o0, Class[] o1){ return null; }
	public MyHelperClass getInsertSql(Class o0){ return null; }
	public MyHelperClass getInsertSql(MyHelperClass o0){ return null; }
	public MyHelperClass getConnect(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PojoParser {

public MyHelperClass getTableName(Class o0){ return null; }
	public MyHelperClass getTableName(MyHelperClass o0){ return null; }
	public MyHelperClass getPriamryKey(MyHelperClass o0){ return null; }
	public MyHelperClass getPriamryKey(Class o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass close(){ return null; }}

class Method {

public MyHelperClass invoke(Object o0, Object[] o1){ return null; }}
