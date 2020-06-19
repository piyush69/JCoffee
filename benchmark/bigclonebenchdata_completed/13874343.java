
import java.io.UncheckedIOException;


class c13874343 {

    private static boolean execute(String query) throws SQLException {
        boolean success = true;
        try {
            MyHelperClass con = new MyHelperClass();
            PreparedStatement stm =(PreparedStatement)(Object) con.prepareStatement(query);
            stm.executeUpdate();
            stm.close();
//            MyHelperClass con = new MyHelperClass();
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                MyHelperClass con = new MyHelperClass();
                con.rollback();
            } catch (Exception rbex) {
                rbex.printStackTrace();
            }
            success = false;
            throw e;
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
