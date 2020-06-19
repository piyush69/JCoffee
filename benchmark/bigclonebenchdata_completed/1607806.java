


class c1607806 {
public MyHelperClass _table_name;
	public MyHelperClass NULL;
	public MyHelperClass _ds;
	public MyHelperClass _oid_col;
	public MyHelperClass getLock(String o0){ return null; }

    public void remove(String oid) throws PersisterException {
        String key =(String)(Object) getLock(oid);
        if (key == null) {
            throw new PersisterException("Object does not exist: OID = " + oid);
        } else if (!NULL.equals(key)) {
            throw new PersisterException("The object is currently locked: OID = " + oid + ", LOCK = " + key);
        }
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn =(Connection)(Object) _ds.getConnection();
            conn.setAutoCommit(true);
            ps =(PreparedStatement)(Object) conn.prepareStatement("delete from " + _table_name + " where " + _oid_col + " = ?");
            ps.setString(1, oid);
            ps.executeUpdate();
        } catch (Throwable th) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (Throwable th2) {
                }
            }
            throw new PersisterException("Failed to delete object: OID = " + oid, th);
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

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
