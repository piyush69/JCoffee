
import java.io.UncheckedIOException;


class c2362300 {

    static void test() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            MyHelperClass JdbcUtils = new MyHelperClass();
            conn =(Connection)(Object) JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            st =(Statement)(Object) conn.createStatement();
            String sql = "update user set money=money-10 where id=15";
            st.executeUpdate(sql);
            sql = "select money from user where id=13";
            rs =(ResultSet)(Object) st.executeQuery(sql);
            float money = 0.0f;
            while ((boolean)(Object)rs.next()) {
                money =(float)(Object) rs.getFloat("money");
            }
            if (money > 1000) throw new RuntimeException("�Ѿ��������ֵ��");
            sql = "update user set money=money+10 where id=13";
            st.executeUpdate(sql);
            conn.commit();
        } catch (UncheckedIOException e) {
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

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getFloat(String o0){ return null; }}
