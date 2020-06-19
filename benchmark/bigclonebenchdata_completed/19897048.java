


class c19897048 {
public MyHelperClass log;

    public void insertRight(final String right) throws IOException {
        try {
            Connection conn = null;
            boolean autoCommit = false;
            try {
                MyHelperClass pool = new MyHelperClass();
                conn =(Connection)(Object) pool.getConnection();
                autoCommit =(boolean)(Object) conn.getAutoCommit();
                conn.setAutoCommit(true);
                final PreparedStatement insert =(PreparedStatement)(Object) conn.prepareStatement("insert into rights (name) values (?)");
                insert.setString(1, right);
                insert.executeUpdate();
            } catch (Throwable t) {
                if (conn != null) conn.rollback();
                throw new SQLException(t.toString());
            } finally {
                if (conn != null) {
                    conn.setAutoCommit(autoCommit);
                    conn.close();
                }
            }
        } catch (final SQLException sqle) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, sqle.toString(), sqle);
            throw new IOException(sqle.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
