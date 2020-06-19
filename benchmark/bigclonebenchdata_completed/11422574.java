
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11422574 {

    protected boolean update(String sql, int requiredRows, int maxRows) throws SQLException {
        MyHelperClass LOG = new MyHelperClass();
        if ((boolean)(Object)LOG.isDebugEnabled()) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("executing " + sql + "...");
        }
        Connection connection = null;
        boolean oldAutoCommit = true;
        try {
            MyHelperClass dataSource = new MyHelperClass();
            connection =(Connection)(Object) dataSource.getConnection();
            connection.clearWarnings();
            oldAutoCommit =(boolean)(Object) connection.getAutoCommit();
            connection.setAutoCommit(false);
            Statement statement =(Statement)(Object) connection.createStatement();
            int rowsAffected =(int)(Object) statement.executeUpdate(sql);
            if (requiredRows != -1 && rowsAffected < requiredRows) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("(" + rowsAffected + ") less than " + requiredRows + " rows affected, rolling back...");
                connection.rollback();
                return false;
            }
            if (maxRows != -1 && rowsAffected > maxRows) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("(" + rowsAffected + ") more than " + maxRows + " rows affected, rolling back...");
                connection.rollback();
                return false;
            }
            connection.commit();
            return true;
        } catch (UncheckedIOException e) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.error("Unable to update database using: " + sql,(SQLException)(Object) e);
            throw e;
        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(oldAutoCommit);
                    connection.close();
                }
            } catch (UncheckedIOException e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Unable to close connection: " + e,(SQLException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass clearWarnings(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
