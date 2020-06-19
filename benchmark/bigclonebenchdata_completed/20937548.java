
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20937548 {

    public void removeRoom(int thisRoom) {
        DBConnection con = null;
        try {
            MyHelperClass DBServiceManager = new MyHelperClass();
            con =(DBConnection)(Object) DBServiceManager.allocateConnection();
            con.setAutoCommit(false);
            String query = "DELETE FROM cafe_Chat_Category WHERE cafe_Chat_Category_id=? ";
            PreparedStatement ps =(PreparedStatement)(Object) con.prepareStatement(query);
            ps.setInt(1, thisRoom);
            ps.executeUpdate();
            query = "DELETE FROM cafe_Chatroom WHERE cafe_chatroom_category=? ";
            ps =(PreparedStatement)(Object) con.prepareStatement(query);
            ps.setInt(1, thisRoom);
            ps.executeUpdate();
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

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
