


class c14050307 {
public MyHelperClass FidoDataSource;
	public MyHelperClass contains(Statement o0, int o1){ return null; }

    public int instantiate(int objectId, String description) throws FidoDatabaseException, ObjectNotFoundException, ClassLinkTypeNotFoundException {
        try {
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                String sql = "insert into Objects (Description) " + "values ('" + description + "')";
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                if ((boolean)(Object)contains(stmt, objectId) == false) throw new ObjectNotFoundException((String)(Object)objectId);
                stmt.executeUpdate(sql);
                int id;
                sql = "select currval('objects_objectid_seq')";
                rs =(ResultSet)(Object) stmt.executeQuery(sql);
                if ((boolean)(Object)rs.next() == false) throw new SQLException("No rows returned from select currval() query"); else id =(int)(Object) rs.getInt(1);
                ObjectLinkTable objectLinkList = new ObjectLinkTable();
                objectLinkList.linkObjects(stmt, id, "instance", objectId);
                conn.commit();
                return id;
            } catch (SQLException e) {
                if (conn != null) conn.rollback();
                throw e;
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        } catch (SQLException e) {
            throw new FidoDatabaseException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class FidoDatabaseException extends Exception{
	public FidoDatabaseException(String errorMessage) { super(errorMessage); }
}

class ObjectNotFoundException extends Exception{
	public ObjectNotFoundException(String errorMessage) { super(errorMessage); }
}

class ClassLinkTypeNotFoundException extends Exception{
	public ClassLinkTypeNotFoundException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ObjectLinkTable {

public MyHelperClass linkObjects(Statement o0, int o1, String o2, int o3){ return null; }}
