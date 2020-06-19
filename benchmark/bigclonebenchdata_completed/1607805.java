


class c1607805 {
public MyHelperClass serialize(Serializable o0){ return null; }
public MyHelperClass _table_name;
	public MyHelperClass _data_col;
	public MyHelperClass _ds;
	public MyHelperClass _oid_col;
	public MyHelperClass _ts_col;
	public MyHelperClass getLock(String o0){ return null; }

    public void create(String oid, Serializable obj) throws PersisterException {
        String key =(String)(Object) getLock(oid);
        if (key != null) {
            throw new PersisterException("Object already exists: OID = " + oid);
        }
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            byte[] data =(byte[])(Object) serialize(obj);
            conn =(Connection)(Object) _ds.getConnection();
            conn.setAutoCommit(true);
            ps =(PreparedStatement)(Object) conn.prepareStatement("insert into " + _table_name + "(" + _oid_col + "," + _data_col + "," + _ts_col + ") values (?,?,?)");
            ps.setString(1, oid);
            ps.setBinaryStream(2, new ByteArrayInputStream(data), data.length);
            ps.setLong(3, System.currentTimeMillis());
            ps.executeUpdate();
        } catch (Throwable th) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (Throwable th2) {
                }
            }
            throw new PersisterException("Failed to create object: OID = " + oid, th);
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
