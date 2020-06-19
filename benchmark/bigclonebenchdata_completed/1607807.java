


class c1607807 {
public MyHelperClass serialize(Serializable o0){ return null; }
public MyHelperClass _table_name;
	public MyHelperClass _data_col;
	public MyHelperClass NULL;
	public MyHelperClass _ds;
	public MyHelperClass _oid_col;
	public MyHelperClass _ts_col;
	public MyHelperClass getLock(String o0){ return null; }

    public void save(String oid, String key, Serializable obj) throws PersisterException {
        String lock =(String)(Object) getLock(oid);
        if (lock == null) {
            throw new PersisterException("Object does not exist: OID = " + oid);
        } else if (!NULL.equals(lock) && (!lock.equals(key))) {
            throw new PersisterException("The object is currently locked with another key: OID = " + oid + ", LOCK = " + lock + ", KEY = " + key);
        }
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            byte[] data =(byte[])(Object) serialize(obj);
            conn =(Connection)(Object) _ds.getConnection();
            conn.setAutoCommit(true);
            ps =(PreparedStatement)(Object) conn.prepareStatement("update " + _table_name + " set " + _data_col + " = ?, " + _ts_col + " = ? where " + _oid_col + " = ?");
            ps.setBinaryStream(1, new ByteArrayInputStream(data), data.length);
            ps.setLong(2, System.currentTimeMillis());
            ps.setString(3, oid);
            ps.executeUpdate();
        } catch (Throwable th) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (Throwable th2) {
                }
            }
            throw new PersisterException("Failed to save object: OID = " + oid, th);
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

class Serializable {

}

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

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setBinaryStream(int o0, ByteArrayInputStream o1, int o2){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
