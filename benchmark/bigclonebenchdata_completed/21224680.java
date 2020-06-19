
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21224680 {
public MyHelperClass contains(Statement o0, String o1){ return null; }
	public MyHelperClass updateRoles(Statement o0, String o1, boolean o2, boolean o3){ return null; }

    public void add(String user, String pass, boolean admin, boolean developer) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                MyHelperClass FidoDataSource = new MyHelperClass();
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                String sql;
                if ((boolean)(Object)contains(stmt, user) == true) {
                    sql = "update Principals set Password = '" + pass + "' " + " where PrincipalId = '" + user + "'";
                } else {
                    sql = "insert into Principals (PrincipalId, Password) " + " values ('" + user + "', '" + pass + "')";
                }
                stmt.executeUpdate(sql);
                updateRoles(stmt, user, admin, developer);
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
