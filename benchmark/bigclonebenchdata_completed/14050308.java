
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14050308 {
public MyHelperClass FidoDataSource;
	public MyHelperClass contains(Statement o0, int o1){ return null; }

    public void deleteInstance(int instanceId) throws FidoDatabaseException, ObjectNotFoundException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                if ((boolean)(Object)contains(stmt, instanceId) == false) throw new ObjectNotFoundException((String)(Object)instanceId);
                ObjectLinkTable objectLinkList = new ObjectLinkTable();
                ObjectAttributeTable objectAttributeList = new ObjectAttributeTable();
                objectLinkList.deleteObject(stmt, instanceId);
                objectAttributeList.deleteObject(stmt, instanceId);
                stmt.executeUpdate("delete from Objects where ObjectId = " + instanceId);
                conn.commit();
            } catch (UncheckedIOException e) {
                if (conn != null) conn.rollback();
                throw e;
            } finally {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        } catch (UncheckedIOException e) {
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

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ObjectLinkTable {

public MyHelperClass deleteObject(Statement o0, int o1){ return null; }}

class ObjectAttributeTable {

public MyHelperClass deleteObject(Statement o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
