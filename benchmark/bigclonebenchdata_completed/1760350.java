
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1760350 {

    public static int deleteOrder(String likePatten) {
        Connection conn = null;
        PreparedStatement psmt = null;
        StringBuffer SQL = new StringBuffer(200);
        int deleted = 0;
        SQL.append(" DELETE FROM JHF_ALIVE_ORDER ").append(" WHERE   ORDER_ID LIKE  ? ");
        try {
            MyHelperClass JdbcConnectionPool = new MyHelperClass();
            conn =(Connection)(Object) JdbcConnectionPool.mainConnection();
            conn.setAutoCommit(false);
            conn.setReadOnly(false);
            psmt =(PreparedStatement)(Object) conn.prepareStatement(SQL.toString());
            psmt.setString(1, "%" + likePatten + "%");
            deleted =(int)(Object) psmt.executeUpdate();
            conn.commit();
        } catch (UncheckedIOException e) {
            if (null != conn) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException e1) {
                    System.out.println(" error when roll back !");
                }
            }
        } finally {
            try {
                if (null != psmt) {
                    psmt.close();
                    psmt = null;
                }
                if (null != conn) {
                    conn.close();
                    conn = null;
                }
            } catch (UncheckedIOException e) {
                System.out.println(" error  when psmt close or conn close .");
            }
        }
        return deleted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mainConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setReadOnly(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
