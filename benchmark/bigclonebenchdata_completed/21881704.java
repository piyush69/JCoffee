
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21881704 {
public MyHelperClass log(){ return null; }
	public MyHelperClass getDataSourceFactory(){ return null; }

    private void runUpdate(String sql, boolean transactional) {
        log().info("Vacuumd executing statement: " + sql);
        Connection dbConn = null;
        boolean commitRequired = false;
        boolean autoCommitFlag = !transactional;
        try {
            dbConn =(Connection)(Object) getDataSourceFactory().getConnection();
            dbConn.setAutoCommit(autoCommitFlag);
            PreparedStatement stmt =(PreparedStatement)(Object) dbConn.prepareStatement(sql);
            int count =(int)(Object) stmt.executeUpdate();
            stmt.close();
            if ((boolean)(Object)log().isDebugEnabled()) {
                log().debug("Vacuumd: Ran update " + sql + ": this affected " + count + " rows");
            }
            commitRequired = transactional;
        } catch (UncheckedIOException ex) {
            log().error("Vacuumd:  Database error execuating statement  " + sql,(SQLException)(Object) ex);
        } finally {
            if (dbConn != null) {
                try {
                    if (commitRequired) {
                        dbConn.commit();
                    } else if (transactional) {
                        dbConn.rollback();
                    }
                } catch (UncheckedIOException ex) {
                } finally {
                    if (dbConn != null) {
                        try {
                            dbConn.close();
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
