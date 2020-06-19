
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10158738 {
public MyHelperClass getFirstRegularFormForTag(Statement o0, String o1, String o2){ return null; }
	public MyHelperClass containsTag(Statement o0, String o1){ return null; }
	public MyHelperClass isRuleUnique(Statement o0, String o1, String o2, String o3, String o4){ return null; }
	public MyHelperClass getFirstRowForTag(Statement o0, String o1, String o2){ return null; }
	public MyHelperClass bumpAllRowsDown(Statement o0, String o1, String o2, int o3){ return null; }
	public MyHelperClass getAppendRowForTag(Statement o0, String o1, String o2){ return null; }
public MyHelperClass determineRecognitionUse(String o0, String o1){ return null; }

    public void add(String language, String tag, String root, String surface) throws FidoDatabaseException, MorphologyTagNotFoundException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                MyHelperClass FidoDataSource = new MyHelperClass();
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                if ((boolean)(Object)containsTag(stmt, tag) == false) throw new MorphologyTagNotFoundException(tag);
                if ((boolean)(Object)isRuleUnique(stmt, language, tag, root, surface) == false) return;
                int row;
                if (root.equals("*") == true) row =(int)(Object) getAppendRowForTag(stmt, language, tag); else if (root.indexOf('*') == -1) row =(int)(Object) getFirstRowForTag(stmt, language, tag); else row =(int)(Object) getFirstRegularFormForTag(stmt, language, tag);
                boolean use =(boolean)(Object) determineRecognitionUse(root, surface);
                bumpAllRowsDown(stmt, language, tag, row);
                String sql = "insert into LanguageMorphologies (LanguageName, Rank, Root, Surface, MorphologyTag, Used) " + "values ('" + language + "', " + row + ", '" + root + "', '" + surface + "', '" + tag + "', ";
                if (use == true) sql = sql + "TRUE)"; else sql = sql + "FALSE)";
                stmt.executeUpdate(sql);
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

class MorphologyTagNotFoundException extends Exception{
	public MorphologyTagNotFoundException(String errorMessage) { super(errorMessage); }
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
