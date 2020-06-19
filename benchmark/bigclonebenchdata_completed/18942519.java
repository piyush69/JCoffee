


class c18942519 {

    public void deleteRole(AuthSession authSession, RoleBean roleBean) {
        DatabaseAdapter dbDyn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            dbDyn =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            if (roleBean.getRoleId() == null) throw new IllegalArgumentException("role id is null");
            String sql = "delete from WM_AUTH_ACCESS_GROUP where ID_ACCESS_GROUP=? ";
            ps =(PreparedStatement)(Object) dbDyn.prepareStatement(sql);
            MyHelperClass RsetTools = new MyHelperClass();
            RsetTools.setLong(ps, 1, roleBean.getRoleId());
            int i1 =(int)(Object) ps.executeUpdate();
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Count of deleted records - " + i1);
            dbDyn.commit();
        } catch (Exception e) {
            try {
                if (dbDyn != null) dbDyn.rollback();
            } catch (Exception e001) {
            }
            String es = "Error delete role";
            MyHelperClass log = new MyHelperClass();
            log.error(es, e);
            throw new IllegalStateException(es, e);
        } finally {
            MyHelperClass DatabaseManager = new MyHelperClass();
            DatabaseManager.close(dbDyn, ps);
            dbDyn = null;
            ps = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setLong(PreparedStatement o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class AuthSession {

}

class RoleBean {

public MyHelperClass getRoleId(){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}
