import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20536507 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }

    public void testSavepoint9() throws Throwable, Exception {
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        stmt.execute("CREATE TABLE #savepoint9 (data int)");
        stmt.close();
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
//        MyHelperClass con = new MyHelperClass();
        Savepoint sp =(Savepoint)(Object) con.setSavepoint();
//        MyHelperClass con = new MyHelperClass();
        PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO #savepoint9 (data) VALUES (?)");
        pstmt.setInt(1, 1);
        assertTrue((MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)pstmt.executeUpdate() == 1);
        pstmt.close();
//        MyHelperClass con = new MyHelperClass();
        stmt =(Statement)(Object) con.createStatement();
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("SELECT SUM(data) FROM #savepoint9");
        assertTrue(rs.next());
        assertTrue((MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)rs.getInt(1) == 1);
        assertTrue((MyHelperClass)(Object)!(Boolean)(Object)rs.next());
        stmt.close();
        rs.close();
//        MyHelperClass con = new MyHelperClass();
        con.commit();
//        MyHelperClass con = new MyHelperClass();
        con.rollback();
//        MyHelperClass con = new MyHelperClass();
        stmt =(Statement)(Object) con.createStatement();
        rs =(ResultSet)(Object) stmt.executeQuery("SELECT SUM(data) FROM #savepoint9");
        assertTrue(rs.next());
        assertTrue("bug [2021839]",(int)(Object) rs.getInt(1) == 1);
        assertTrue((MyHelperClass)(Object)!(Boolean)(Object)rs.next());
        stmt.close();
        rs.close();
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass execute(String o0){ return null; }}

class Savepoint {

}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
