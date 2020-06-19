
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17553387 {
public MyHelperClass UPDATE_COMMON_DESCRIPTION_STATEMENT;
	public MyHelperClass LOGGER;
	public MyHelperClass SELECT_COMMON_DESCRIPTION_STATEMENT;
	public MyHelperClass INSERT_COMMON_DESCRIPTION_STATEMENT;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public boolean putDescription(String uuid, String description) throws DatabaseException {
        if (uuid == null) throw new NullPointerException("uuid");
        if (description == null) throw new NullPointerException("description");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        boolean found = true;
        try {
            PreparedStatement findSt =(PreparedStatement)(Object) getConnection().prepareStatement(SELECT_COMMON_DESCRIPTION_STATEMENT);
            PreparedStatement updSt = null;
            findSt.setString(1, uuid);
            ResultSet rs =(ResultSet)(Object) findSt.executeQuery();
            found =(boolean)(Object) rs.next();
            int modified = 0;
            updSt =(PreparedStatement)(Object) getConnection().prepareStatement(found ? UPDATE_COMMON_DESCRIPTION_STATEMENT : INSERT_COMMON_DESCRIPTION_STATEMENT);
            updSt.setString(1, description);
            updSt.setString(2, uuid);
            modified =(int)(Object) updSt.executeUpdate();
            if (modified == 1) {
                getConnection().commit();
                LOGGER.debug("DB has been updated. Queries: \"" + findSt + "\" and \"" + updSt + "\"");
            } else {
                getConnection().rollback();
                LOGGER.error("DB has not been updated -> rollback! Queries: \"" + findSt + "\" and \"" + updSt + "\"");
                found = false;
            }
        } catch (UncheckedIOException e) {
            LOGGER.error((SQLException)(Object)e);
            found = false;
        } finally {
            closeConnection();
        }
        return found;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass prepareStatement(foun o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class foun {

}
