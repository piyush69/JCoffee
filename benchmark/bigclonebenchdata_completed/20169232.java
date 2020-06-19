
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20169232 {
public MyHelperClass hasRole(MyHelperClass o0, long o1){ return null; }
public MyHelperClass USER_ROLE_VALUE;
	public MyHelperClass LOGGER;
	public MyHelperClass INSERT_USER_IN_ROLE_STATEMENT;
	public MyHelperClass SELECT_ROLE_DESCRIPTION;
	public MyHelperClass closeConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

//    @Override
    public RoleItem addUserRole(RoleItem role, long userId) throws DatabaseException {
        if (role == null) throw new NullPointerException("role");
        if (role.getName() == null || "".equals(role.getName())) throw new NullPointerException("role.getName()");
        if ((boolean)(Object)hasRole(role.getName(), userId)) {
            return new RoleItem(role.getName(), "", "exist");
        }
        RoleItem defaultRole = new RoleItem(role.getName(), "", "exist");
        try {
            getConnection().setAutoCommit(false);
        } catch (UncheckedIOException e) {
            LOGGER.warn("Unable to set autocommit off",(SQLException)(Object) e);
        }
        String retID = "exist";
        String roleDesc = "";
        PreparedStatement seqSt = null, roleDescSt = null;
        try {
            int modified = 0;
            PreparedStatement insSt =(PreparedStatement)(Object) getConnection().prepareStatement(INSERT_USER_IN_ROLE_STATEMENT);
            insSt.setLong(1, userId);
            insSt.setString(2, role.getName());
            modified =(int)(Object) insSt.executeUpdate();
            seqSt =(PreparedStatement)(Object) getConnection().prepareStatement(USER_ROLE_VALUE);
            ResultSet rs =(ResultSet)(Object) seqSt.executeQuery();
            while ((boolean)(Object)rs.next()) {
                retID =(String)(Object) rs.getString(1);
            }
            roleDescSt =(PreparedStatement)(Object) getConnection().prepareStatement(SELECT_ROLE_DESCRIPTION);
            roleDescSt.setString(1, role.getName());
            ResultSet rs2 =(ResultSet)(Object) roleDescSt.executeQuery();
            while ((boolean)(Object)rs2.next()) {
                roleDesc =(String)(Object) rs2.getString(1);
            }
            if (modified == 1) {
                getConnection().commit();
                LOGGER.debug("DB has been updated. Queries: \"" + seqSt + "\" and \"" + roleDescSt + "\"");
            } else {
                getConnection().rollback();
                LOGGER.error("DB has not been updated -> rollback! Queries: \"" + seqSt + "\" and \"" + roleDescSt + "\"");
                retID = "error";
            }
        } catch (UncheckedIOException e) {
            LOGGER.error((SQLException)(Object)e);
            retID = "error";
        } finally {
            closeConnection();
        }
        defaultRole.setId(retID);
        defaultRole.setDescription(roleDesc);
        return defaultRole;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, SQLException o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class RoleItem {

RoleItem(){}
	RoleItem(MyHelperClass o0, String o1, String o2){}
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

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
