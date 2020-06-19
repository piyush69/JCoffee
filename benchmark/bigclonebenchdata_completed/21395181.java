


class c21395181 {
public MyHelperClass Config;

//    @Test
    public void test20_badSmtp() throws Exception {
        MyHelperClass DbConnection = new MyHelperClass();
        Db db =(Db)(Object) DbConnection.defaultCieDbRW();
        try {
            db.begin();
            MyHelperClass oldSmtp = new MyHelperClass();
            oldSmtp = Config.getProperty(db, "com.entelience.mail.MailHelper.hostName", "localhost");
            MyHelperClass oldSupport = new MyHelperClass();
            oldSupport = Config.getProperty(db, "com.entelience.esis.feature.SupportNotifier", false);
            MyHelperClass Config = new MyHelperClass();
            Config.setProperty(db, "com.entelience.mail.MailHelper.hostName", "127.0.10.1", 1);
//            MyHelperClass Config = new MyHelperClass();
            Config.setProperty(db, "com.entelience.esis.feature.SupportNotifier", "true", 1);
            PreparedStatement pst =(PreparedStatement)(Object) db.prepareStatement("DELETE FROM t_client_errors");
            db.executeUpdate(pst);
            db.commit();
        } catch (Exception e) {
            db.rollback();
        } finally {
            db.safeClose();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setProperty(Db o0, String o1, String o2, int o3){ return null; }
	public MyHelperClass getProperty(Db o0, String o1, boolean o2){ return null; }
	public MyHelperClass getProperty(Db o0, String o1, String o2){ return null; }
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

}
