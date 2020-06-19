
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1293658 {
public MyHelperClass FidoDataSource;
	public MyHelperClass getCurrentId(Statement o0){ return null; }

    public int addCollectionInstruction() throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                String sql = "insert into Instructions (Type, Operator) " + "values (1, 0)";
                conn =(Connection)(Object) FidoDataSource.getConnection();
                stmt =(Statement)(Object) conn.createStatement();
                stmt.executeUpdate(sql);
                return(int)(Object) getCurrentId(stmt);
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

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
