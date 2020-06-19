


class c18374478 {
public MyHelperClass log;

    public void updateUser(final User user) throws IOException {
        try {
            Connection conn = null;
            boolean autoCommit = false;
            try {
                MyHelperClass pool = new MyHelperClass();
                conn =(Connection)(Object) pool.getConnection();
                autoCommit =(boolean)(Object) conn.getAutoCommit();
                conn.setAutoCommit(false);
                final PreparedStatement updateUser =(PreparedStatement)(Object) conn.prepareStatement("update users set mainRoleId=? where userId=?");
                updateUser.setInt(1, user.getMainRole().getId());
                updateUser.setString(2, user.getUserId());
                updateUser.executeUpdate();
                final PreparedStatement deleteRoles =(PreparedStatement)(Object) conn.prepareStatement("delete from userRoles where userId=?");
                deleteRoles.setString(1, user.getUserId());
                deleteRoles.executeUpdate();
                final PreparedStatement insertRoles =(PreparedStatement)(Object) conn.prepareStatement("insert into userRoles (userId, roleId) values (?,?)");
                for (final Role role :(Role[])(Object) (Object[])(Object)user.getRoles()) {
                    insertRoles.setString(1, user.getUserId());
                    insertRoles.setInt(2, role.getId());
                    insertRoles.executeUpdate();
                }
                conn.commit();
            } catch (Throwable t) {
                if (conn != null) conn.rollback();
                throw new SQLException(t.toString());
            } finally {
                if (conn != null) {
                    conn.setAutoCommit(autoCommit);
                    conn.close();
                }
            }
        } catch (final SQLException sqle) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, sqle.toString(), sqle);
            throw new IOException(sqle.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getId(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class User {

public MyHelperClass getMainRole(){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getRoles(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Role {

public MyHelperClass getId(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
