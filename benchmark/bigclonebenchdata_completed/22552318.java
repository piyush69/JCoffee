
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22552318 {

    private synchronized void loadDDL() throws IOException {
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.createStatement().executeQuery("SELECT * FROM non_generic_favs").close();
        } catch (UncheckedIOException e) {
            Statement stmt = null;
            MyHelperClass ERR_MISSING_TABLE = new MyHelperClass();
            if (!e.getMessage().matches((String)(Object)ERR_MISSING_TABLE)) {
                e.printStackTrace(System.out);
                throw new IOException("Error on initial data store read");
            }
            String[] qry = { "CREATE TABLE non_generic_favs (id INT NOT NULL PRIMARY KEY)", "CREATE TABLE ignore_chan_favs (id INT NOT NULL PRIMARY KEY, chanlist LONG VARCHAR)", "CREATE TABLE settings (var VARCHAR(32) NOT NULL, val VARCHAR(255) NOT NULL, PRIMARY KEY(var))", "INSERT INTO settings (var, val) VALUES ('schema', '1')" };
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.setAutoCommit(false);
//                MyHelperClass conn = new MyHelperClass();
                stmt =(Statement)(Object) conn.createStatement();
                for (String q : qry) stmt.executeUpdate(q);
//                MyHelperClass conn = new MyHelperClass();
                conn.commit();
            } catch (UncheckedIOException e2) {
                try {
                    MyHelperClass conn = new MyHelperClass();
                    conn.rollback();
                } catch (UncheckedIOException e3) {
                    e3.printStackTrace(System.out);
                }
                e2.printStackTrace((java.io.PrintStream)(Object)(PrintStream)(Object)new PrintWriter((PrintStream)(Object)System.out));
                throw new IOException("Error initializing data store");
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (UncheckedIOException e4) {
                        e4.printStackTrace(System.out);
                        throw new IOException("Unable to cleanup data store resources");
                    }
                }
                try {
                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                } catch (UncheckedIOException e3) {
                    e3.printStackTrace(System.out);
                    throw new IOException("Unable to reset data store auto commit");
                }
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class PrintWriter {

PrintWriter(PrintStream o0){}
	PrintWriter(){}}

class PrintStream {

}
