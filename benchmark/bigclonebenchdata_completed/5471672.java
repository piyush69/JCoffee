
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5471672 {
public MyHelperClass LOG;
	public MyHelperClass conn;
	public MyHelperClass SCHEMA_VERSION;
	public MyHelperClass SQL_ERROR;
	public MyHelperClass getSchema(){ return null; }

    private void upgradeSchema() throws IOException {
        Statement stmt = null;
        try {
            int i =(int)(Object) getSchema();
            if (i < (int)(Object)SCHEMA_VERSION) {
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                while (i < (int)(Object)SCHEMA_VERSION) {
                    String qry;
                    switch(i) {
                        case 1:
                            qry = "CREATE TABLE log (id INTEGER PRIMARY KEY, context VARCHAR(16) NOT NULL, level VARCHAR(16) NOT NULL, time LONG INT NOT NULL, msg LONG VARCHAR NOT NULL, parent INT)";
                            stmt.executeUpdate(qry);
                            qry = "UPDATE settings SET val = '2' WHERE var = 'schema'";
                            stmt.executeUpdate(qry);
                            break;
                        case 2:
                            qry = "CREATE TABLE monitor (id INTEGER PRIMARY KEY NOT NULL, status INTEGER NOT NULL)";
                            stmt.executeUpdate(qry);
                            qry = "UPDATE settings SET val = '3' WHERE var = 'schema'";
                            stmt.executeUpdate(qry);
                            break;
                        case 3:
                            qry = "CREATE TABLE favs (id INTEGER PRIMARY KEY NOT NULL)";
                            stmt.executeUpdate(qry);
                            qry = "UPDATE settings SET val = '4' WHERE var = 'schema'";
                            stmt.executeUpdate(qry);
                            break;
                        case 4:
                            qry = "DROP TABLE log";
                            stmt.executeUpdate(qry);
                            qry = "UPDATE settings SET val = '5' WHERE var = 'schema'";
                            stmt.executeUpdate(qry);
                            break;
                        case 5:
                            qry = "UPDATE settings SET val = '120000' WHERE var = 'SleepTime'";
                            stmt.executeUpdate(qry);
                            qry = "UPDATE settings set val = '6' WHERE var = 'schema'";
                            stmt.executeUpdate(qry);
                            break;
                    }
                    i++;
                }
                conn.commit();
            }
        } catch (UncheckedIOException e) {
            try {
                conn.rollback();
            } catch (UncheckedIOException e2) {
                LOG.trace(SQL_ERROR,(SQLException)(Object) e2);
                LOG.error((SQLException)(Object)e2);
            }
            LOG.trace(SQL_ERROR,(SQLException)(Object) e);
            LOG.fatal((SQLException)(Object)e);
            throw new IOException("Error upgrading data store",(SQLException)(Object) e);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conn.setAutoCommit(true);
            } catch (UncheckedIOException e) {
                LOG.trace(SQL_ERROR,(SQLException)(Object) e);
                throw new IOException("Unable to cleanup SQL resources",(SQLException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(SQLException o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass trace(MyHelperClass o0, SQLException o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(){}
	IOException(String o0, SQLException o1){}
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
