
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20169227 {
public MyHelperClass INSERT_USER_STATEMENT;
	public MyHelperClass LOGGER;
	public MyHelperClass USER_CURR_VALUE;
	public MyHelperClass UPDATE_USER_STATEMENT;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public String addUser(UserInfoItem user) throws DatabaseException {
        if (user == null) throw new NullPointerException("user");
        if (user.getSurname() == null || "".equals(user.getSurname())) throw new NullPointerException("user.getSurname()");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        String retID = "exist";
        PreparedStatement insSt = null, updSt = null, seqSt = null;
        try {
            int modified = 0;
            if (user.getId() != null) {
                long id = Long.parseLong((String)(Object)user.getId());
                updSt =(PreparedStatement)(Object) getConnection().prepareStatement(UPDATE_USER_STATEMENT);
                updSt.setString(1, user.getName());
                updSt.setString(2, user.getSurname());
                updSt.setLong(3, id);
                modified =(int)(Object) updSt.executeUpdate();
            } else {
                insSt =(PreparedStatement)(Object) getConnection().prepareStatement(INSERT_USER_STATEMENT);
                insSt.setString(1, user.getName());
                insSt.setString(2, user.getSurname());
                insSt.setBoolean(3, "m".equalsIgnoreCase((String)(Object)user.getSex()));
                modified =(int)(Object) insSt.executeUpdate();
                seqSt =(PreparedStatement)(Object) getConnection().prepareStatement(USER_CURR_VALUE);
                ResultSet rs =(ResultSet)(Object) seqSt.executeQuery();
                while ((boolean)(Object)rs.next()) {
                    retID =(String)(Object) rs.getString(1);
                }
            }
            if (modified == 1) {
                getConnection().commit();
                LOGGER.debug("DB has been updated. Queries: \"" + seqSt + "\" and \"" + (user.getId() != null ? updSt : insSt) + "\"");
            } else {
                getConnection().rollback();
                LOGGER.debug("DB has not been updated. -> rollback! Queries: \"" + seqSt + "\" and \"" + (user.getId() != null ? updSt : insSt) + "\"");
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

class UserInfoItem {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getSex(){ return null; }
	public MyHelperClass getSurname(){ return null; }
	public MyHelperClass getName(){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
