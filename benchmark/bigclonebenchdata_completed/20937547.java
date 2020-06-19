
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20937547 {

    public int saveRoom(String name, String icon, String stringid) {
        DBConnection con = null;
        int categoryId = -1;
        try {
            MyHelperClass DBServiceManager = new MyHelperClass();
            con =(DBConnection)(Object) DBServiceManager.allocateConnection();
            con.setAutoCommit(false);
            String query = "INSERT INTO cafe_Chat_Category " + "(cafe_Chat_Category_pid,cafe_Chat_Category_name, cafe_Chat_Category_icon) " + "VALUES (null,?,?) ";
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, icon);
            ps.executeUpdate();
            query = "SELECT cafe_Chat_Category_id FROM cafe_Chat_Category " + "WHERE cafe_Chat_Category_name=? ";
            ps =(PreparedStatement)(Object) con.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) {
                query = "INSERT INTO cafe_Chatroom (cafe_chatroom_category, cafe_chatroom_name, cafe_chatroom_stringid) " + "VALUES (?,?,?) ";
                ps =(PreparedStatement)(Object) con.prepareStatement(query);
                ps.setInt(1, rs.getInt("cafe_Chat_Category_id"));
                categoryId =(int)(Object) rs.getInt("cafe_Chat_Category_id");
                ps.setString(2, name);
                ps.setString(3, stringid);
                ps.executeUpdate();
            }
            con.commit();
            con.setAutoCommit(true);
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException sqle) {
            }
        } finally {
            if (con != null) con.release();
        }
        return categoryId;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocateConnection(){ return null; }}

class DBConnection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass release(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
