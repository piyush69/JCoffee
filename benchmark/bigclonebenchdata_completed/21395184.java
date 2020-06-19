


class c21395184 {
public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass DateHelper;
	public MyHelperClass Config;
	public MyHelperClass t30chgpasswd(){ return null; }
	public MyHelperClass isPasswordExpired(){ return null; }
	public MyHelperClass t30login1(){ return null; }
	public MyHelperClass getCurrentPeople(){ return null; }
	public MyHelperClass t30login2(){ return null; }
	public MyHelperClass t30chgpasswd2(){ return null; }
	public MyHelperClass p_logout(){ return null; }

//    @Test
    public void test30_passwordAging() throws Exception {
        MyHelperClass DbConnection = new MyHelperClass();
        Db db =(Db)(Object) DbConnection.defaultCieDbRW();
        try {
            db.begin();
            MyHelperClass Config = new MyHelperClass();
            Config.setProperty(db, "com.entelience.esis.security.passwordAge", "5", 1);
            PreparedStatement pst =(PreparedStatement)(Object) db.prepareStatement("UPDATE e_people SET last_passwd_change = '2006-07-01' WHERE user_name = ?");
            pst.setString(1, "esis");
            db.executeUpdate(pst);
            db.commit();
            p_logout();
            t30login1();
            assertTrue(isPasswordExpired());
            PeopleInfoLine me =(PeopleInfoLine)(Object) getCurrentPeople();
            assertNotNull(me.getPasswordExpirationDate());
            assertTrue(me.getPasswordExpirationDate().before(DateHelper.now()));
            t30chgpasswd();
            assertFalse(isPasswordExpired());
            me =(PeopleInfoLine)(Object) getCurrentPeople();
            assertNotNull(me.getPasswordExpirationDate());
            assertTrue(me.getPasswordExpirationDate().after(DateHelper.now()));
            p_logout();
            t30login2();
            assertFalse(isPasswordExpired());
            t30chgpasswd2();
            db.begin();
            Config.setProperty(db, "com.entelience.esis.security.passwordAge", "0", 1);
            db.commit();
        } catch (Exception e) {
            e.printStackTrace();
            db.rollback();
        } finally {
            db.safeClose();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass before(MyHelperClass o0){ return null; }
	public MyHelperClass now(){ return null; }
	public MyHelperClass setProperty(Db o0, String o1, String o2, int o3){ return null; }
	public MyHelperClass after(MyHelperClass o0){ return null; }
	public MyHelperClass defaultCieDbRW(){ return null; }}

class Test {

}

class Db {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass safeClose(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass begin(){ return null; }
	public MyHelperClass executeUpdate(PreparedStatement o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }}

class PeopleInfoLine {

public MyHelperClass getPasswordExpirationDate(){ return null; }}
