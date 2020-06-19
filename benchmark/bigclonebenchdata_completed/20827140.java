


class c20827140 {

    public static Chunk updateLastSend(Chunk c) throws Exception {
        DBConnectionManager dbm = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        Chunk ret = null;
        String SQL = "UPDATE CHUNK SET SENT=? WHERE FILEHASH=? AND STARTOFF=? AND LENGTH=?";
        MyHelperClass log = new MyHelperClass();
        log.debug("update chunk last sent for chunk " + c.getHash() + " startoff " + c.getStartOffset());
        try {
            MyHelperClass DBConnectionManager = new MyHelperClass();
            dbm =(DBConnectionManager)(Object) DBConnectionManager.getInstance();
            conn =(Connection)(Object) dbm.getConnection("satmule");
            stmt =(PreparedStatement)(Object) conn.prepareStatement(SQL);
            stmt.setDate(1,(Date)(Object) new java.sql.Date((long)(Object)c.getLastSend().getTime()));
            stmt.setString(2, c.getHash());
            stmt.setLong(3, c.getStartOffset());
            stmt.setLong(4, c.getSize());
            stmt.executeUpdate();
            conn.commit();
            stmt.close();
            dbm.freeConnection("satmule", conn);
        } catch (Exception e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Error while updating chunk " + c.getHash() + "offset:" + c.getStartOffset() + "SQL error: " + SQL, e);
            Exception excep;
            if (dbm == null) excep = new Exception("Could not obtain pool object DbConnectionManager"); else if (conn == null) excep = new Exception("The Db connection pool could not obtain a database connection"); else {
                conn.rollback();
                excep = new Exception("SQL Error : " + SQL + " error: " + e);
                dbm.freeConnection("satmule", conn);
            }
            throw excep;
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getTime(){ return null; }}

class Chunk {

public MyHelperClass getLastSend(){ return null; }
	public MyHelperClass getStartOffset(){ return null; }
	public MyHelperClass getHash(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class DBConnectionManager {

public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass freeConnection(String o0, Connection o1){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }}

class Date {

}
