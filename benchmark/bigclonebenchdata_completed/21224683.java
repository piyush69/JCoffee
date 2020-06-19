
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21224683 {
public MyHelperClass FidoDataSource;

    public void delete(String user) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                stmt.executeUpdate("delete from Principals where PrincipalId = '" + user + "'");
                stmt.executeUpdate("delete from Roles where PrincipalId = '" + user + "'");
                conn.commit();
            } catch (UncheckedIOException e) {
                if (conn != null) conn.rollback();
                throw e;
            } finally {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        } catch (UncheckedIOException e) {
            throw new FidoDatabaseException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class FidoDatabaseException extends Exception{
	public FidoDatabaseException(String errorMessage) { super(errorMessage); }
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
