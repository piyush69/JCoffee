
import java.io.UncheckedIOException;


class c9307757 {
public MyHelperClass clearTables(Statement o0){ return null; }

    private void load() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            MyHelperClass FidoDataSource = new MyHelperClass();
            conn =(Connection)(Object) FidoDataSource.getConnection();
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            clearTables(stmt);
            stmt.executeQuery("select setval('objects_objectid_seq', 1000)");
            stmt.executeQuery("select setval('instructions_instructionid_seq', 1)");
            stmt.executeQuery("select setval('transactions_transactionid_seq', 1)");
            stmt.executeQuery("select setval('verbtransactions_verbid_seq', 1)");
            stmt.executeUpdate("update SystemProperties set value = 'Minimal Data' where name = 'DB Data Version'");
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
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}
