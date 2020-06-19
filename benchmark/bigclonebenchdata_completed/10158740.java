
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10158740 {
public MyHelperClass FidoDataSource;
	public MyHelperClass bumpAllRowsUp(Statement o0, String o1, String o2, int o3){ return null; }

    public void delete(String language, String tag, int row) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                String sql = "delete from LanguageMorphologies " + "where LanguageName = '" + language + "' and MorphologyTag = '" + tag + "' and " + "      Rank = " + row;
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                stmt.executeUpdate(sql);
                bumpAllRowsUp(stmt, language, tag, row);
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
