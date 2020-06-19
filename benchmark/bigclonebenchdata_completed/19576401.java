
import java.io.UncheckedIOException;


class c19576401 {
public static MyHelperClass closeAll(Object o0, Statement o1, Object o2){ return null; }
//public MyHelperClass closeAll(Object o0, Statement o1, Object o2){ return null; }

    public static final int executeSql(final Connection conn, final String sql, final boolean rollback) throws SQLException {
        if (null == sql) return 0;
        Statement stmt = null;
        try {
            stmt =(Statement)(Object) conn.createStatement();
            final int updated =(int)(Object) stmt.executeUpdate(sql);
            return updated;
        } catch (final UncheckedIOException e) {
            if (rollback) conn.rollback();
            throw e;
        } finally {
            closeAll(null, stmt, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
