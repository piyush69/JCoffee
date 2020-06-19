
import java.io.UncheckedIOException;


class c17193692 {

    public void execUpdate(String sqlStmts[]) throws SQLException {
        MyHelperClass conn = new MyHelperClass();
        if (conn == null || (boolean)(Object)conn.isClosed()) throw new SQLException("The connection has not been established yet.");
        if (sqlStmts == null || sqlStmts.length == 0) throw new SQLException("SQL-statement is null.");
//        MyHelperClass conn = new MyHelperClass();
        conn.setAutoCommit(false);
        try {
            for (int i = 0; i < sqlStmts.length; i++) {
                MyHelperClass stmt = new MyHelperClass();
                stmt = conn.createStatement();
//                MyHelperClass stmt = new MyHelperClass();
                stmt.executeUpdate(sqlStmts[i]);
                MyHelperClass logger = new MyHelperClass();
                logger.debug(sqlStmts[i]);
//                MyHelperClass stmt = new MyHelperClass();
                stmt.close();
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (UncheckedIOException ex) {
//            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            throw ex;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
