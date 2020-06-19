
import java.io.UncheckedIOException;


class c479674 {

    public static synchronized String getSequenceNumber(String SequenceName) {
        String result = "0";
        Connection conn = null;
        Statement ps = null;
        ResultSet rs = null;
        try {
            MyHelperClass TPCW_Database = new MyHelperClass();
            conn =(Connection)(Object) TPCW_Database.getConnection();
            conn.setAutoCommit(false);
            String sql = "select num from sequence where name='" + SequenceName + "'";
            MyHelperClass ResultSet = new MyHelperClass();
            ps =(Statement)(Object) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs =(ResultSet)(Object) ps.executeQuery(sql);
            long num = 0;
            while ((boolean)(Object)rs.next()) {
                num =(long)(Object) rs.getLong(1);
                result = new Long(num).toString();
            }
            num++;
            sql = "update sequence set num=" + num + " where name='" + SequenceName + "'";
            int res =(int)(Object) ps.executeUpdate(sql);
            if (res == 1) {
                conn.commit();
            } else conn.rollback();
        } catch (Exception e) {
            System.out.println("Error Happens when trying to obtain the senquence number");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (UncheckedIOException se) {
                se.printStackTrace();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_SCROLL_INSENSITIVE;
	public MyHelperClass CONCUR_UPDATABLE;
public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
