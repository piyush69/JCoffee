
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10158742 {
public MyHelperClass FidoDataSource;
	public MyHelperClass findMaxRank(Statement o0, String o1, String o2){ return null; }

    public void moveRuleDown(String language, String tag, int row) throws FidoDatabaseException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                int max =(int)(Object) findMaxRank(stmt, language, tag);
                if ((row < 1) || (row > (max - 1))) throw new IllegalArgumentException("Row number (" + row + ") was not between 1 and " + (max - 1));
                stmt.executeUpdate("update LanguageMorphologies set Rank = -1 " + "where Rank = " + row + " and MorphologyTag = '" + tag + "' and " + "      LanguageName = '" + language + "'");
                stmt.executeUpdate("update LanguageMorphologies set Rank = " + row + "where Rank = " + (row + 1) + " and MorphologyTag = '" + tag + "' and " + "      LanguageName = '" + language + "'");
                stmt.executeUpdate("update LanguageMorphologies set Rank = " + (row + 1) + "where Rank = -1 and MorphologyTag = '" + tag + "' and " + "      LanguageName = '" + language + "'");
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
