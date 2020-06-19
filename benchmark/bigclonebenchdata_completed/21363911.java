import java.io.*;
import java.lang.*;
import java.util.*;



class c21363911 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass TestUtil;

    public void testTransactions() throws Exception {
        MyHelperClass con = new MyHelperClass();
        con = TestUtil.openDB();
        Statement st;
        ResultSet rs;
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
//        MyHelperClass con = new MyHelperClass();
        assertTrue((MyHelperClass)(Object)!(Boolean)(Object)con.getAutoCommit());
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(true);
//        MyHelperClass con = new MyHelperClass();
        assertTrue(con.getAutoCommit());
//        MyHelperClass con = new MyHelperClass();
        st =(Statement)(Object) con.createStatement();
        st.executeUpdate("insert into test_a (imagename,image,id) values ('comttest',1234,5678)");
//        MyHelperClass con = new MyHelperClass();
        con.setAutoCommit(false);
        st.executeUpdate("update test_a set image=9876 where id=5678");
//        MyHelperClass con = new MyHelperClass();
        con.commit();
        rs =(ResultSet)(Object) st.executeQuery("select image from test_a where id=5678");
        assertTrue(rs.next());
        assertEquals(9876, rs.getInt(1));
        rs.close();
        st.executeUpdate("update test_a set image=1111 where id=5678");
//        MyHelperClass con = new MyHelperClass();
        con.rollback();
        rs =(ResultSet)(Object) st.executeQuery("select image from test_a where id=5678");
        assertTrue(rs.next());
        assertEquals(9876, rs.getInt(1));
        rs.close();
//        MyHelperClass con = new MyHelperClass();
        TestUtil.closeDB(con);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass closeDB(MyHelperClass o0){ return null; }
	public MyHelperClass openDB(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
