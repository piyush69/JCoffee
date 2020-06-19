
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6330721 {

    public int setData(String mysql) {
        int mycount = 0;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.setAutoCommit(false);
            mycount = 0;
            MyHelperClass stmt = new MyHelperClass();
            stmt = conn.createStatement();
//            MyHelperClass stmt = new MyHelperClass();
            mycount =(int)(Object) stmt.executeUpdate(mysql);
        } catch (Exception e) {
            mycount = -1;
        } finally {
            if (mycount > 0) {
                try {
                    MyHelperClass conn = new MyHelperClass();
                    conn.commit();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        return mycount;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
