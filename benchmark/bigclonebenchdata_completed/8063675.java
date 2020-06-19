


class c8063675 {

    private static int ejecutaUpdate(String database, String SQL) throws Exception {
        int i = 0;
        DBConnectionManager dbm = null;
        Connection bd = null;
        try {
            MyHelperClass DBConnectionManager = new MyHelperClass();
            dbm =(DBConnectionManager)(Object) DBConnectionManager.getInstance();
            bd =(Connection)(Object) dbm.getConnection(database);
            Statement st =(Statement)(Object) bd.createStatement();
            i =(int)(Object) st.executeUpdate(SQL);
            bd.commit();
            st.close();
            dbm.freeConnection(database, bd);
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("SQL error: " + SQL, e);
            Exception excep;
            if (dbm == null) excep = new Exception("Could not obtain pool object DbConnectionManager"); else if (bd == null) excep = new Exception("The Db connection pool could not obtain a database connection"); else {
                bd.rollback();
                excep = new Exception("SQL Error: " + SQL + " error: " + e);
                dbm.freeConnection(database, bd);
            }
            throw excep;
        }
        return i;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class DBConnectionManager {

public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass freeConnection(String o0, Connection o1){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
