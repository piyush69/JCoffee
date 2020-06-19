


class c12739583 {
public MyHelperClass assertNotNull(ResultSet o0){ return null; }
public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass dropTable(String o0){ return null; }

    public void testPreparedStatement0009() throws Exception {
        Connection cx =(Connection)(Object) getConnection();
        dropTable("#t0009");
        Statement stmt =(Statement)(Object) cx.createStatement();
        stmt.executeUpdate("create table #t0009 " + "  (i  integer  not null,      " + "   s  char(10) not null)      ");
        cx.setAutoCommit(false);
        PreparedStatement pStmt =(PreparedStatement)(Object) cx.prepareStatement("insert into #t0009 values (?, ?)");
        int rowsToAdd = 8;
        final String theString = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 1; i <= rowsToAdd; i++) {
            pStmt.setInt(1, i);
            pStmt.setString(2, theString.substring(0, i));
            count += (int)(Object)pStmt.executeUpdate();
        }
        assertTrue(count == rowsToAdd);
        cx.rollback();
        stmt =(Statement)(Object) cx.createStatement();
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0009");
        assertNotNull(rs);
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            assertTrue(rs.getString(1).trim().length() == rs.getInt(2));
        }
        assertTrue(count == 0);
        cx.commit();
        rowsToAdd = 6;
        count = 0;
        for (int i = 1; i <= rowsToAdd; i++) {
            pStmt.setInt(1, i);
            pStmt.setString(2, theString.substring(0, i));
            count += (int)(Object)pStmt.executeUpdate();
        }
        assertTrue(count == rowsToAdd);
        cx.commit();
        rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0009");
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            assertTrue(rs.getString(1).trim().length() == rs.getInt(2));
        }
        assertTrue(count == rowsToAdd);
        cx.commit();
        cx.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass trim(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
