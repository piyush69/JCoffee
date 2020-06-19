
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2058785 {
public MyHelperClass executeQuery(Statement o0, String o1){ return null; }
public MyHelperClass testId;
	public MyHelperClass MAX_KEY_VALUE;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass getNextKey(){ return null; }

    public void doStatementQueryAndUpdate(Connection conn, String id) throws SQLException {
        try {
            int key =(int)(Object) getNextKey();
            Statement s1 =(Statement)(Object) conn.createStatement();
            String bValue = "doStatementQueryAndUpdate:" + id + testId;
            if (key >= (int)(Object)MAX_KEY_VALUE) {
                key = key % (int)(Object)MAX_KEY_VALUE;
                s1.executeUpdate("delete from many_threads where a = " + key);
            }
            int count =(int)(Object) s1.executeUpdate("insert into many_threads values (" + key + ", '" + bValue + "', 0)");
            assertEquals(1, count);
            assertEquals(key,(int)(Object) executeQuery(s1, "select a from many_threads where a = " + key));
            s1.executeUpdate("update many_threads set value =  a * a, b = b || '&" + bValue + "' where a = " + (key + 1));
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
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
