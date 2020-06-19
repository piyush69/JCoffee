
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4593012 {
public MyHelperClass LOG;
	public MyHelperClass conn;
	public MyHelperClass SCHEMA_VERSION;
	public MyHelperClass SQL_ERROR;
	public MyHelperClass getSchema(){ return null; }

    private void upgradeSchema() throws IOException {
        Statement stmt = null;
        try {
            int i =(int)(Object) getSchema();
            LOG.info("DB is currently at schema " + i);
            if (i < (int)(Object)SCHEMA_VERSION) {
                LOG.info("Upgrading from schema " + i + " to schema " + SCHEMA_VERSION);
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                while (i < (int)(Object)SCHEMA_VERSION) {
                    String qry;
                    switch(i) {
                        case 1:
                            qry = "UPDATE settings SET val = '2' WHERE var = 'schema'";
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
                LOG.error(SQL_ERROR,(SQLException)(Object) e2);
            }
            LOG.fatal(SQL_ERROR,(SQLException)(Object) e);
            throw new IOException("Error upgrading data store",(SQLException)(Object) e);
        } finally {
            try {
                if (stmt != null) stmt.close();
                conn.setAutoCommit(true);
            } catch (UncheckedIOException e) {
                LOG.error(SQL_ERROR,(SQLException)(Object) e);
                throw new IOException("Unable to cleanup SQL resources",(SQLException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass error(MyHelperClass o0, SQLException o1){ return null; }
	public MyHelperClass fatal(MyHelperClass o0, SQLException o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass info(String o0){ return null; }
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
