


class c4932274 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(String o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
public MyHelperClass assertNotNull(Statement o0){ return null; }

    public void testCommitRollback() throws Exception {
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        assertNotNull(stmt);
//        MyHelperClass con = new MyHelperClass();
        assertTrue(con.getAutoCommit());
        stmt.execute("CREATE TABLE #TESTCOMMIT (id int primary key)");
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
//        MyHelperClass con = new MyHelperClass();
        assertFalse(con.getAutoCommit());
        assertEquals(1, stmt.executeUpdate("INSERT INTO #TESTCOMMIT VALUES (1)"));
//        MyHelperClass con = new MyHelperClass();
        con.commit();
        assertEquals(1, stmt.executeUpdate("INSERT INTO #TESTCOMMIT VALUES (2)"));
        assertEquals(1, stmt.executeUpdate("INSERT INTO #TESTCOMMIT VALUES (3)"));
//        MyHelperClass con = new MyHelperClass();
        con.rollback();
        assertEquals(1, stmt.executeUpdate("INSERT INTO #TESTCOMMIT VALUES (4)"));
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(true);
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("SELECT COUNT(*) FROM #TESTCOMMIT");
        rs.next();
        assertEquals("commit", 2, rs.getInt(1));
        stmt.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
