
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5471671 {
public MyHelperClass LOG;

    private void loadDDL() throws IOException {
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.createStatement().executeQuery("SELECT * FROM overrides").close();
        } catch (UncheckedIOException e) {
            Statement stmt = null;
            MyHelperClass ERR_MISSING_TABLE = new MyHelperClass();
            if (!e.getMessage().matches((String)(Object)ERR_MISSING_TABLE)) {
                MyHelperClass SQL_ERROR = new MyHelperClass();
                LOG.trace(SQL_ERROR,(SQLException)(Object) e);
                MyHelperClass LOG = new MyHelperClass();
                LOG.fatal((SQLException)(Object)e);
                throw new IOException("Error on initial data store read",(SQLException)(Object) e);
            }
            String[] qry = { "CREATE TABLE overrides (id INT NOT NULL, title VARCHAR(255) NOT NULL, subtitle VARCHAR(255) NOT NULL, PRIMARY KEY(id))", "CREATE TABLE settings (var VARCHAR(32) NOT NULL, val VARCHAR(255) NOT NULL, PRIMARY KEY(var))", "INSERT INTO settings (var, val) VALUES ('schema', '1')" };
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
                    MyHelperClass SQL_ERROR = new MyHelperClass();
                    LOG.trace(SQL_ERROR,(SQLException)(Object) e3);
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error((SQLException)(Object)e3);
                }
                MyHelperClass SQL_ERROR = new MyHelperClass();
                LOG.trace(SQL_ERROR,(SQLException)(Object) e2);
                throw new IOException("Error initializing data store",(SQLException)(Object) e2);
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (UncheckedIOException e4) {
                        MyHelperClass SQL_ERROR = new MyHelperClass();
                        LOG.trace(SQL_ERROR,(SQLException)(Object) e4);
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error((SQLException)(Object)e4);
                        throw new IOException("Unable to cleanup data store resources",(SQLException)(Object) e4);
                    }
                }
                try {
                    MyHelperClass conn = new MyHelperClass();
                    conn.setAutoCommit(true);
                } catch (UncheckedIOException e3) {
                    MyHelperClass SQL_ERROR = new MyHelperClass();
                    LOG.trace(SQL_ERROR,(SQLException)(Object) e3);
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error((SQLException)(Object)e3);
                    throw new IOException("Unable to reset data store auto commit",(SQLException)(Object) e3);
                }
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(SQLException o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass trace(MyHelperClass o0, SQLException o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(){}
	IOException(String o0, SQLException o1){}
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
