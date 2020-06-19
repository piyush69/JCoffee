
import java.io.UncheckedIOException;


class c20836129 {

    public void addUser(String strUserName, String strPass) {
        MyHelperClass Function = new MyHelperClass();
        String datetime = Function.getSysTime().toString();
        String time = datetime.substring(0, 4) + datetime.substring(5, 7) + datetime.substring(8, 10) + datetime.substring(11, 13) + datetime.substring(14, 16) + datetime.substring(17, 19) + datetime.substring(20, 22) + "0";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            MyHelperClass DbForumFactory = new MyHelperClass();
            con =(Connection)(Object) DbForumFactory.getConnection();
            con.setAutoCommit(false);
            MyHelperClass DbSequenceManager = new MyHelperClass();
            int userID =(int)(Object) DbSequenceManager.nextID(DbSequenceManager.USER);
            MyHelperClass INSERT_USER = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) con.prepareStatement(INSERT_USER);
            pstmt.setString(1, strUserName);
            MyHelperClass SecurityUtil = new MyHelperClass();
            pstmt.setString(2,(String)(Object) SecurityUtil.md5ByHex(strPass));
            pstmt.setString(3, time);
            pstmt.setString(4, "");
            pstmt.setString(5, "");
            pstmt.setString(6, "");
            pstmt.setString(7, "");
            pstmt.setInt(8, userID);
            pstmt.executeUpdate();
            pstmt.clearParameters();
            MyHelperClass INSERT_USERPROPS = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) con.prepareStatement(INSERT_USERPROPS);
            pstmt.setString(1, "");
            pstmt.setString(2, "");
            pstmt.setString(3, "");
            pstmt.setInt(4, 0);
            pstmt.setString(5, "");
            pstmt.setInt(6, 0);
            pstmt.setInt(7, 0);
            pstmt.setString(8, "");
            pstmt.setString(9, "");
            pstmt.setString(10, "");
            pstmt.setInt(11, 0);
            pstmt.setInt(12, 0);
            pstmt.setInt(13, 0);
            pstmt.setInt(14, 0);
            pstmt.setString(15, "");
            pstmt.setString(16, "");
            pstmt.setString(17, "");
            pstmt.setString(18, "");
            pstmt.setString(19, "");
            pstmt.setString(20, "");
            pstmt.setString(21, "");
            pstmt.setString(22, "");
            pstmt.setString(23, "");
            pstmt.setInt(24, 0);
            pstmt.setInt(25, 0);
            pstmt.setInt(26, userID);
            pstmt.executeUpdate();
            pstmt.clearParameters();
            MyHelperClass INSTER_USERGROUP = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) con.prepareStatement(INSTER_USERGROUP);
            pstmt.setInt(1, 4);
            pstmt.setInt(2, userID);
            pstmt.setInt(3, 0);
            pstmt.executeUpdate();
            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
            }
            MyHelperClass log = new MyHelperClass();
            log.error("insert user Error: " + e.toString());
        } finally {
            MyHelperClass DbForumFactory = new MyHelperClass();
            DbForumFactory.closeDB(null, pstmt, null, con);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER;
public MyHelperClass closeDB(Object o0, PreparedStatement o1, Object o2, Connection o3){ return null; }
	public MyHelperClass getSysTime(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass nextID(MyHelperClass o0){ return null; }
	public MyHelperClass md5ByHex(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
