


class c18942525 {
public MyHelperClass processNewRoles(DatabaseAdapter o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass processDeletedRoles(DatabaseAdapter o0, AuthUserExtendedInfo o1){ return null; }

    public void updateUserInfo(AuthSession authSession, AuthUserExtendedInfo infoAuth) {
        MyHelperClass log = new MyHelperClass();
        log.info("Start update auth");
        PreparedStatement ps = null;
        DatabaseAdapter db = null;
        try {
            MyHelperClass DatabaseAdapter = new MyHelperClass();
            db =(DatabaseAdapter)(Object) DatabaseAdapter.getInstance();
            String sql = "update WM_AUTH_USER " + "set " + "ID_FIRM=?, IS_USE_CURRENT_FIRM=?, " + "ID_HOLDING=?, IS_HOLDING=? " + "WHERE  ID_AUTH_USER=? ";
            ps =(PreparedStatement)(Object) db.prepareStatement(sql);
            if (infoAuth.getAuthInfo().getCompanyId() == null) {
                MyHelperClass Types = new MyHelperClass();
                ps.setNull(1, Types.INTEGER);
                ps.setInt(2, 0);
            } else {
                ps.setLong(1, infoAuth.getAuthInfo().getCompanyId());
                ps.setInt(2,(boolean)(Object) infoAuth.getAuthInfo().isCompany() ? 1 : 0);
            }
            if (infoAuth.getAuthInfo().getHoldingId() == null) {
                MyHelperClass Types = new MyHelperClass();
                ps.setNull(3, Types.INTEGER);
                ps.setInt(4, 0);
            } else {
                ps.setLong(3, infoAuth.getAuthInfo().getHoldingId());
                ps.setInt(4,(boolean)(Object) infoAuth.getAuthInfo().isHolding() ? 1 : 0);
            }
            ps.setLong(5, infoAuth.getAuthInfo().getAuthUserId());
            ps.executeUpdate();
            processDeletedRoles(db, infoAuth);
            processNewRoles(db, infoAuth.getRoles(), infoAuth.getAuthInfo().getAuthUserId());
            db.commit();
        } catch (Throwable e) {
            try {
                if (db != null) db.rollback();
            } catch (Exception e001) {
            }
            final String es = "Error add user auth";
//            MyHelperClass log = new MyHelperClass();
            log.error(es, e);
            throw new IllegalStateException(es, e);
        } finally {
            MyHelperClass DatabaseManager = new MyHelperClass();
            DatabaseManager.close(db, ps);
            ps = null;
            db = null;
//            MyHelperClass log = new MyHelperClass();
            log.info("End update auth");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INTEGER;
public MyHelperClass getCompanyId(){ return null; }
	public MyHelperClass close(DatabaseAdapter o0, PreparedStatement o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getAuthUserId(){ return null; }
	public MyHelperClass getHoldingId(){ return null; }
	public MyHelperClass isHolding(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isCompany(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class AuthSession {

}

class AuthUserExtendedInfo {

public MyHelperClass getAuthInfo(){ return null; }
	public MyHelperClass getRoles(){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DatabaseAdapter {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}
