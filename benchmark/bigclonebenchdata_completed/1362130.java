
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1362130 {
public MyHelperClass FidoDataSource;
	public MyHelperClass findMaxRank(Statement o0){ return null; }

    public void moveRowUp(int row) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                int max =(int)(Object) findMaxRank(stmt);
                if ((row < 2) || (row > max)) throw new IllegalArgumentException("Row number not between 2 and " + max);
                stmt.executeUpdate("update WordClassifications set Rank = -1 where Rank = " + row);
                stmt.executeUpdate("update WordClassifications set Rank = " + row + " where Rank = " + (row - 1));
                stmt.executeUpdate("update WordClassifications set Rank = " + (row - 1) + " where Rank = -1");
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
