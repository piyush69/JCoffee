
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10759917 {
public MyHelperClass FidoDataSource;
	public MyHelperClass isSystemLink(Statement o0, String o1){ return null; }

    public void delete(String name) throws FidoDatabaseException, CannotDeleteSystemLinkException, ClassLinkTypeNotFoundException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                if ((boolean)(Object)isSystemLink(stmt, name) == true) throw new CannotDeleteSystemLinkException(name);
                AdjectivePrepositionTable prepTable = new AdjectivePrepositionTable();
                prepTable.deleteLinkType(stmt, name);
                ObjectLinkTable objectLinkTable = new ObjectLinkTable();
                objectLinkTable.deleteLinkType(stmt, name);
                String sql = "delete from ClassLinkTypes where LinkName = '" + name + "'";
                stmt.executeUpdate(sql);
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

class CannotDeleteSystemLinkException extends Exception{
	public CannotDeleteSystemLinkException(String errorMessage) { super(errorMessage); }
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
	public MyHelperClass executeUpdate(String o0){ return null; }}

class AdjectivePrepositionTable {

public MyHelperClass deleteLinkType(Statement o0, String o1){ return null; }}

class ObjectLinkTable {

public MyHelperClass deleteLinkType(Statement o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
