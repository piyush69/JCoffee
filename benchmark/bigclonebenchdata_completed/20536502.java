
import java.io.UncheckedIOException;


class c20536502 {
public MyHelperClass assertNotNull(Savepoint o0){ return null; }
public MyHelperClass con;
	public MyHelperClass assertTrue(boolean o0){ return null; }

    public void testSavepoint4() throws Exception {
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        stmt.execute("CREATE TABLE #savepoint4 (data int)");
        stmt.close();
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
        for (int i = 0; i < 3; i++) {
            System.out.println("iteration: " + i);
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO #savepoint4 (data) VALUES (?)");
            pstmt.setInt(1, 1);
            assertTrue((int)(Object)pstmt.executeUpdate() == 1);
//            MyHelperClass con = new MyHelperClass();
            Savepoint savepoint =(Savepoint)(Object) con.setSavepoint();
            assertNotNull(savepoint);
            assertTrue((int)(Object)savepoint.getSavepointId() == 1);
            try {
                savepoint.getSavepointName();
                assertTrue(false);
            } catch (UncheckedIOException e) {
            }
            pstmt.setInt(1, 2);
            assertTrue((int)(Object)pstmt.executeUpdate() == 1);
            pstmt.close();
            pstmt =(PreparedStatement)(Object) con.prepareStatement("SELECT SUM(data) FROM #savepoint4");
            ResultSet rs =(ResultSet)(Object) pstmt.executeQuery();
            assertTrue((boolean)(Object)rs.next());
            assertTrue((int)(Object)rs.getInt(1) == 3);
            assertTrue(!(Boolean)(Object)rs.next());
            pstmt.close();
            rs.close();
            con.rollback(savepoint);
            pstmt =(PreparedStatement)(Object) con.prepareStatement("SELECT SUM(data) FROM #savepoint4");
            rs =(ResultSet)(Object) pstmt.executeQuery();
            assertTrue((boolean)(Object)rs.next());
            assertTrue((int)(Object)rs.getInt(1) == 1);
            assertTrue(!(Boolean)(Object)rs.next());
            pstmt.close();
            rs.close();
            con.rollback();
        }
        con.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass setSavepoint(){ return null; }
	public MyHelperClass rollback(Savepoint o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Savepoint {

public MyHelperClass getSavepointName(){ return null; }
	public MyHelperClass getSavepointId(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
