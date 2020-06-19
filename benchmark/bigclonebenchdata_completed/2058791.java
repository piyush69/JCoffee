
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2058791 {
public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass executeQuery(PreparedStatement o0){ return null; }
public MyHelperClass testId;
	public MyHelperClass MAX_KEY_VALUE;
	public MyHelperClass getNextKey(){ return null; }

    public void doPreparedStatementQueryAndUpdate(Connection conn, String id) throws SQLException {
        try {
            int key =(int)(Object) getNextKey();
            String bValue = "doPreparedStatementQueryAndUpdate:" + id + ":" + testId;
            PreparedStatement s1;
            if (key >= (int)(Object)MAX_KEY_VALUE) {
                key = key % (int)(Object)MAX_KEY_VALUE;
                s1 =(PreparedStatement)(Object) conn.prepareStatement("delete from many_threads where a = ?");
                s1.setInt(1, key);
                s1.executeUpdate();
                s1.close();
            }
            s1 =(PreparedStatement)(Object) conn.prepareStatement("insert into many_threads values (?, ?, 0)");
            s1.setInt(1, key);
            s1.setString(2, bValue);
            assertEquals(1, s1.executeUpdate());
            s1.close();
            s1 =(PreparedStatement)(Object) conn.prepareStatement("select a from many_threads where a = ?");
            s1.setInt(1, key);
            assertEquals(key, executeQuery(s1));
            s1.close();
            s1 =(PreparedStatement)(Object) conn.prepareStatement("update many_threads set value = a * a, b = b || ? where a = ?");
            s1.setString(1, "&" + bValue);
            s1.setInt(2, key + 1);
            s1.executeUpdate();
            s1.close();
            if (!(Boolean)(Object)conn.getAutoCommit()) {
                conn.commit();
            }
        } catch (UncheckedIOException e) {
            if (!(Boolean)(Object)conn.getAutoCommit()) {
                try {
                    conn.rollback();
                } catch (UncheckedIOException e2) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
