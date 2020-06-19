import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7419810 {

    static void test() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Savepoint sp = null;
        try {
            MyHelperClass JdbcUtils = new MyHelperClass();
            conn =(Connection)(Object) JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            st =(Statement)(Object) conn.createStatement();
            String sql = "update user set money=money-10 where id=1";
            st.executeUpdate(sql);
            sp =(Savepoint)(Object) conn.setSavepoint();
            sql = "update user set money=money-10 where id=3";
            st.executeUpdate(sql);
            sql = "select money from user where id=2";
            rs =(ResultSet)(Object) st.executeQuery(sql);
            float money = 0.0f;
            if ((boolean)(Object)rs.next()) {
                money =(float)(Object) rs.getFloat("money");
            }
            if (money > 300) throw new RuntimeException("�Ѿ��������ֵ��");
            sql = "update user set money=money+10 where id=2";
            st.executeUpdate(sql);
            conn.commit();
        } catch (RuntimeException e) {
            if (conn != null && sp != null) {
                conn.rollback(sp);
                conn.commit();
            }
            throw e;
        } catch (IllegalStateException e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            MyHelperClass JdbcUtils = new MyHelperClass();
            JdbcUtils.free(rs, st, conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass free(ResultSet o0, Statement o1, Connection o2){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass rollback(Savepoint o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ResultSet {

public MyHelperClass getFloat(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Savepoint {

}
