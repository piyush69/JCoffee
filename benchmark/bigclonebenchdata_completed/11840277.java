
import java.io.UncheckedIOException;


class c11840277 {

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
            stmt.executeUpdate("delete from Objects");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (1, 'Money value')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (2, 'Date')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (3, 'Unix path')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (4, 'Dos path')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (5, 'Time')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (6, 'IP address')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (7, 'Internet hostname')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (8, 'Number')");
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
