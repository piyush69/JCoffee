


class c5506808 {
public MyHelperClass assertNotNull(ResultSet o0){ return null; }
public MyHelperClass con;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testTransactions0010() throws Exception {
        MyHelperClass con = new MyHelperClass();
        Statement stmt =(Statement)(Object) con.createStatement();
        stmt.executeUpdate("create table #t0010 " + "  (i  integer  not null,      " + "   s  char(10) not null)      ");
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
//        MyHelperClass con = new MyHelperClass();
        PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement("insert into #t0010 values (?, ?)");
        int rowsToAdd = 8;
        final String theString = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 1; i <= rowsToAdd; i++) {
            pstmt.setInt(1, i);
            pstmt.setString(2, theString.substring(0, i));
            count += (int)(Object)pstmt.executeUpdate();
        }
        assertEquals(count, rowsToAdd);
        con.rollback();
        ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0010");
        assertNotNull(rs);
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            assertEquals((int)(Object)rs.getString(1).trim().length(),(int)(Object) rs.getInt(2));
        }
        assertEquals(count, 0);
        rowsToAdd = 6;
        for (int j = 1; j <= 2; j++) {
            count = 0;
            for (int i = 1; i <= rowsToAdd; i++) {
                pstmt.setInt(1, i + ((j - 1) * rowsToAdd));
                pstmt.setString(2, theString.substring(0, i));
                count += (int)(Object)pstmt.executeUpdate();
            }
            assertEquals(count, rowsToAdd);
            con.commit();
        }
        rs =(ResultSet)(Object) stmt.executeQuery("select s, i from #t0010");
        count = 0;
        while ((boolean)(Object)rs.next()) {
            count++;
            int i =(int)(Object) rs.getInt(2);
            if (i > rowsToAdd) {
                i -= rowsToAdd;
            }
            assertEquals((int)(Object)rs.getString(1).trim().length(), i);
        }
        assertEquals(count, (2 * rowsToAdd));
        stmt.close();
        pstmt.close();
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
