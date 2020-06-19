


class c9802073 {
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass getConnectionOverrideProperties(Properties o0){ return null; }

    public void testAutoCommit() throws Exception {
        Connection con =(Connection)(Object) getConnectionOverrideProperties(new Properties());
        try {
            Statement stmt =(Statement)(Object) con.createStatement();
            assertEquals(0, stmt.executeUpdate("create table #testAutoCommit (i int)"));
            con.setAutoCommit(false);
            assertEquals(1, stmt.executeUpdate("insert into #testAutoCommit (i) values (0)"));
            con.setAutoCommit(false);
            con.rollback();
            assertEquals(1, stmt.executeUpdate("insert into #testAutoCommit (i) values (1)"));
            con.setAutoCommit(true);
            con.setAutoCommit(false);
            con.rollback();
            con.setAutoCommit(true);
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select i from #testAutoCommit");
            assertTrue(rs.next());
            assertEquals(1, rs.getInt(1));
            assertFalse(rs.next());
            rs.close();
            stmt.close();
        } finally {
            con.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Properties {

}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
