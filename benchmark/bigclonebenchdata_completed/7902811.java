import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7902811 {
public MyHelperClass NULL;
public MyHelperClass keycol;
	public MyHelperClass table;
	public MyHelperClass valcol;

    protected long incrementInDatabase(Object type)  throws Throwable {
        long current_value;
        long new_value;
        String entry;
        MyHelperClass global_entry = new MyHelperClass();
        if (global_entry != null) entry =(String)(Object) global_entry; else throw new UnsupportedOperationException("Named key generators are not yet supported.");
        MyHelperClass properties = new MyHelperClass();
        String lkw = (String)(String)(Object) properties.get("net.ontopia.topicmaps.impl.rdbms.HighLowKeyGenerator.SelectSuffix");
        String sql_select;
        MyHelperClass database = new MyHelperClass();
        if (lkw == null && (database.equals("sqlserver"))) {
            MyHelperClass valcol = new MyHelperClass();
            sql_select = "select " + valcol + " from " + table + " with (XLOCK) where " + keycol + " = ?";
        } else {
            if (lkw == null) {
//                MyHelperClass database = new MyHelperClass();
                if (database.equals("sapdb")) lkw = "with lock"; else lkw = "for update";
            }
            MyHelperClass valcol = new MyHelperClass();
            sql_select = "select " + valcol + " from " + table + " where " + keycol + " = ? " + lkw;
        }
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("KeyGenerator: retrieving: " + sql_select);
        Connection conn = null;
        try {
            MyHelperClass connfactory = new MyHelperClass();
            conn =(Connection)(Object) connfactory.requestConnection();
            PreparedStatement stm1 =(PreparedStatement)(Object) conn.prepareStatement(sql_select);
            try {
                stm1.setString(1, entry);
                ResultSet rs =(ResultSet)(Object) stm1.executeQuery();
                MyHelperClass table = new MyHelperClass();
                if (!(Boolean)(Object)rs.next()) throw new OntopiaRuntimeException("HIGH/LOW key generator table '" + table + "' not initialized (no rows).");
                current_value =(long)(Object) rs.getLong(1);
                rs.close();
            } finally {
                stm1.close();
            }
            MyHelperClass grabsize = new MyHelperClass();
            new_value = current_value + (long)(Object)grabsize;
            MyHelperClass table = new MyHelperClass();
            String sql_update = "update " + table + " set " + valcol + " = ? where " + keycol + " = ?";
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("KeyGenerator: incrementing: " + sql_update);
            PreparedStatement stm2 =(PreparedStatement)(Object) conn.prepareStatement(sql_update);
            try {
                stm2.setLong(1, new_value);
                stm2.setString(2, entry);
                stm2.executeUpdate();
            } finally {
                stm2.close();
            }
            conn.commit();
        } catch (UncheckedIOException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (UncheckedIOException e2) {
            }
            throw new OntopiaRuntimeException((String)(Object)e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    throw new OntopiaRuntimeException((String)(Object)e);
                }
            }
        }
        long value =(long)(Object) NULL; //new long();
        value = current_value + 1;
        long max_value =(long)(Object) NULL; //new long();
        max_value = new_value;
//        MyHelperClass value = new MyHelperClass();
        return(long)(Object) value;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass requestConnection(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class OntopiaRuntimeException extends Exception{
	public OntopiaRuntimeException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
