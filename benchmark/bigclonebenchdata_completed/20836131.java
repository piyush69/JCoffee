
import java.io.UncheckedIOException;


class c20836131 {

    public void modify(String strName, String strNewPass) {
        String str = "update jb_user set V_PASSWORD =? where V_USERNAME =?";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            MyHelperClass DbForumFactory = new MyHelperClass();
            con =(Connection)(Object) DbForumFactory.getConnection();
            con.setAutoCommit(false);
            pstmt =(PreparedStatement)(Object) con.prepareStatement(str);
            MyHelperClass SecurityUtil = new MyHelperClass();
            pstmt.setString(1,(String)(Object) SecurityUtil.md5ByHex(strNewPass));
            pstmt.setString(2, strName);
            pstmt.executeUpdate();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
            }
        } finally {
            try {
                MyHelperClass DbForumFactory = new MyHelperClass();
                DbForumFactory.closeDB(null, pstmt, null, con);
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass md5ByHex(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass closeDB(Object o0, PreparedStatement o1, Object o2, Connection o3){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
