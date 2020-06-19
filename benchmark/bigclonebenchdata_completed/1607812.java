


class c1607812 {
public MyHelperClass _ts_col;

    public void cleanup(long timeout) throws PersisterException {
        long threshold = System.currentTimeMillis() - timeout;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass _ds = new MyHelperClass();
            conn =(Connection)(Object) _ds.getConnection();
            conn.setAutoCommit(true);
            MyHelperClass _table_name = new MyHelperClass();
            ps =(PreparedStatement)(Object) conn.prepareStatement("delete from " + _table_name + " where " + _ts_col + " < ?");
            ps.setLong(1, threshold);
            ps.executeUpdate();
        } catch (Throwable th) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (Throwable th2) {
                }
            }
            throw new PersisterException("Failed to cleanup timed out objects: ", th);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Throwable th) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Throwable th) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class PersisterException extends Exception{
	public PersisterException(String errorMessage) { super(errorMessage); }
	PersisterException(){}
	PersisterException(String o0, Throwable o1){}
}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
