
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22181956 {
public MyHelperClass LOG;
	public MyHelperClass conn;
	public MyHelperClass logQry(String o0){ return null; }

    private void loadDDL() throws IOException {
        try {
            MyHelperClass conn = new MyHelperClass();
            conn.createStatement().executeQuery("SELECT * FROM reporters").close();
        } catch (UncheckedIOException e) {
            Statement stmt = null;
            MyHelperClass ERR_MISSING_TABLE = new MyHelperClass();
            if (!e.getMessage().matches((String)(Object)ERR_MISSING_TABLE)) {
                String msg = "Error on initial data store read";
                MyHelperClass LOG = new MyHelperClass();
                LOG.fatal(msg,(SQLException)(Object) e);
                throw new IOException(msg,(SQLException)(Object) e);
            }
            String[] qry = { "CREATE TABLE reporters (type LONG VARCHAR NOT NULL, key LONG VARCHAR NOT NULL, data LONG VARCHAR, PRIMARY KEY(type, key))", "CREATE TABLE listeners (event VARCHAR(255) NOT NULL, type LONG VARCHAR NOT NULL, key LONG VARCHAR NOT NULL, PRIMARY KEY(event, type, key))", "CREATE TABLE settings (var VARCHAR(32) NOT NULL, val VARCHAR(255) NOT NULL, PRIMARY KEY(var))", "INSERT INTO settings (var, val) VALUES ('schema', '1')" };
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.setAutoCommit(false);
//                MyHelperClass conn = new MyHelperClass();
                stmt =(Statement)(Object) conn.createStatement();
                for (String q : qry) {
                    logQry(q);
                    stmt.executeUpdate(q);
                }
                conn.commit();
            } catch (UncheckedIOException e2) {
                String msg = "Error initializing data store";
                try {
                    conn.rollback();
                } catch (UncheckedIOException e3) {
                    LOG.fatal(msg,(SQLException)(Object) e3);
                }
                LOG.fatal(msg,(SQLException)(Object) e2);
                throw new IOException(msg);
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (UncheckedIOException e4) {
                        String msg = "Unable to cleanup data store resources";
                        LOG.fatal(msg,(SQLException)(Object) e4);
                        throw new IOException(msg);
                    }
                }
                try {
                    conn.setAutoCommit(true);
                } catch (UncheckedIOException e3) {
                    String msg = "Unable to reset data store auto commit";
                    LOG.fatal(msg,(SQLException)(Object) e3);
                    throw new IOException(msg);
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
	public MyHelperClass fatal(String o0, SQLException o1){ return null; }
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
