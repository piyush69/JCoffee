
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20169230 {
public MyHelperClass INSERT_IDENTITY_STATEMENT;
	public MyHelperClass LOGGER;
	public MyHelperClass USER_IDENTITY_VALUE;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public String addUserIdentity(OpenIDItem identity, long userId) throws DatabaseException {
        if (identity == null) throw new NullPointerException("identity");
        if (identity.getIdentity() == null || "".equals(identity.getIdentity())) throw new NullPointerException("identity.getIdentity()");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        String retID = "exist";
        PreparedStatement insSt = null, seqSt = null;
        try {
            int modified = 0;
            insSt =(PreparedStatement)(Object) getConnection().prepareStatement(INSERT_IDENTITY_STATEMENT);
            insSt.setLong(1, userId);
            insSt.setString(2, identity.getIdentity());
            modified =(int)(Object) insSt.executeUpdate();
            seqSt =(PreparedStatement)(Object) getConnection().prepareStatement(USER_IDENTITY_VALUE);
            ResultSet rs =(ResultSet)(Object) seqSt.executeQuery();
            while ((boolean)(Object)rs.next()) {
                retID =(String)(Object) rs.getString(1);
            }
            if (modified == 1) {
                getConnection().commit();
                LOGGER.debug("DB has been updated. Queries: \"" + seqSt + "\" and \"" + insSt + "\"");
            } else {
                getConnection().rollback();
                LOGGER.debug("DB has not been updated -> rollback! Queries: \"" + seqSt + "\" and \"" + insSt + "\"");
                retID = "error";
            }
        } catch (UncheckedIOException e) {
            LOGGER.error((SQLException)(Object)e);
            retID = "error";
        } finally {
            closeConnection();
        }
        return retID;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class OpenIDItem {

public MyHelperClass getIdentity(){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
