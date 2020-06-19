
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3512882 {

    static final void executeUpdate(Collection queries, DBConnector connector) throws IOException {
        Connection con = null;
        Statement st = null;
        try {
            con =(Connection)(Object) connector.getDB();
            con.setAutoCommit(false);
            st =(Statement)(Object) con.createStatement();
            for (String s :(String[])(Object) (Object[])(Object)queries) st.executeUpdate(s);
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            throw new IOException(e.getMessage());
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (UncheckedIOException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (UncheckedIOException ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Collection {

}

class DBConnector {

public MyHelperClass getDB(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
