
import java.io.UncheckedIOException;


class c16991395 {

    protected static void clearTables() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            MyHelperClass FidoDataSource = new MyHelperClass();
            conn =(Connection)(Object) FidoDataSource.getConnection();
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            MyHelperClass ClearData = new MyHelperClass();
            ClearData.clearTables(stmt);
            stmt.executeUpdate("delete from MorphologyTags");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('not')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('plural')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('third singular')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('again')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('past tense')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('against')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('deprive')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('cause to happen')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('nounify')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('someone who believes')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('belief system of')");
            stmt.executeUpdate("insert into MorphologyTags (TagName) values ('capable of')");
            conn.commit();
        } catch (UncheckedIOException e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clearTables(Statement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
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
