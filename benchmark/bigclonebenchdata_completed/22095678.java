
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22095678 {

    public static String deleteTag(String tag_id) {
        MyHelperClass OctopusErrorMessages = new MyHelperClass();
        String so =(String)(Object) OctopusErrorMessages.UNKNOWN_ERROR;
        if (tag_id == null || tag_id.trim().equals("")) {
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            return(String)(Object) OctopusErrorMessages.TAG_ID_CANT_BE_EMPTY;
        }
        DBConnection theConnection = null;
        try {
            MyHelperClass DBServiceManager = new MyHelperClass();
            theConnection =(DBConnection)(Object) DBServiceManager.allocateConnection();
            theConnection.setAutoCommit(false);
            String query = "DELETE FROM tr_translation WHERE tr_translation_trtagid=?";
            PreparedStatement state =(PreparedStatement)(Object) theConnection.prepareStatement(query);
            state.setString(1, tag_id);
            state.executeUpdate();
            String query2 = "DELETE FROM tr_tag WHERE tr_tag_id=? ";
            PreparedStatement state2 =(PreparedStatement)(Object) theConnection.prepareStatement(query2);
            state2.setString(1, tag_id);
            state2.executeUpdate();
            theConnection.commit();
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            so =(String)(Object) OctopusErrorMessages.ACTION_DONE;
        } catch (UncheckedIOException e) {
            try {
                theConnection.rollback();
            } catch (UncheckedIOException ex) {
            }
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            so =(String)(Object) OctopusErrorMessages.ERROR_DATABASE;
        } finally {
            if (theConnection != null) {
                try {
                    theConnection.setAutoCommit(true);
                } catch (UncheckedIOException ex) {
                }
                theConnection.release();
            }
        }
        return so;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UNKNOWN_ERROR;
	public MyHelperClass ACTION_DONE;
	public MyHelperClass TAG_ID_CANT_BE_EMPTY;
	public MyHelperClass ERROR_DATABASE;
public MyHelperClass allocateConnection(){ return null; }}

class DBConnection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass release(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
