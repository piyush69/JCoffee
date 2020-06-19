import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22247688 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public void testPreparedStatementRollback1() throws Throwable, Exception {
        Connection localCon =(Connection)(Object) getConnection();
        Statement stmt =(Statement)(Object) localCon.createStatement();
        stmt.execute("CREATE TABLE #psr1 (data BIT)");
        localCon.setAutoCommit(false);
        PreparedStatement pstmt =(PreparedStatement)(Object) localCon.prepareStatement("INSERT INTO #psr1 (data) VALUES (?)");
        pstmt.setBoolean(1, true);
        assertEquals(1, pstmt.executeUpdate());
        pstmt.close();
        localCon.rollback();
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("SELECT data FROM #psr1");
        assertFalse(rs.next());
        rs.close();
        stmt.close();
        localCon.close();
        try {
            localCon.commit();
            fail("Expecting commit to fail, connection was closed");
        } catch (SQLException ex) {
            assertEquals("HY010", ex.getSQLState());
        }
        try {
            localCon.rollback();
            fail("Expecting rollback to fail, connection was closed");
        } catch (SQLException ex) {
            assertEquals("HY010", ex.getSQLState());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass execute(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
