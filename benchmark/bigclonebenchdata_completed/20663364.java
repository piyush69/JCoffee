


class c20663364 {
public MyHelperClass assertNotNull(ResultSet o0){ return null; }
public MyHelperClass con;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testPreparedStatement0009() throws Exception {
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        stmt.executeUpdate("create table #t0009 " + "  (i  integer  not null,      " + "   s  char(10) not null)      ");
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
//        MyHelperClass con = new MyHelperClass();
        PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement("insert into #t0009 values (?, ?)");
        int rowsToAdd = 8;
        final String theString = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 1; i <= rowsToAdd; i++) {
            pstmt.setInt(1, i);
            pstmt.setString(2, theString.substring(0, i));
            count += (int)(Object)pstmt.executeUpdate();
        }
        pstmt.close();
        assertEquals(count, rowsToAdd);
        con.rollback();
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0009");
        assertNotNull(rs);
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            assertEquals((int)(Object)rs.getString(1).trim().length(),(int)(Object) rs.getInt(2));
        }
        assertEquals(count, 0);
        con.commit();
        pstmt =(PreparedStatement)(Object) con.prepareStatement("insert into #t0009 values (?, ?)");
        rowsToAdd = 6;
        count = 0;
        for (int i = 1; i <= rowsToAdd; i++) {
            pstmt.setInt(1, i);
            pstmt.setString(2, theString.substring(0, i));
            count += (int)(Object)pstmt.executeUpdate();
        }
        assertEquals(count, rowsToAdd);
        con.commit();
        pstmt.close();
        rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0009");
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            assertEquals((int)(Object)rs.getString(1).trim().length(),(int)(Object) rs.getInt(2));
        }
        assertEquals(count, rowsToAdd);
        con.commit();
        stmt.close();
        con.setAutoCommit(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
