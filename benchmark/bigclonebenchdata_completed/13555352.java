


class c13555352 {
public MyHelperClass PeopleFactory;
	public MyHelperClass assertNotNull(MyHelperClass o0){ return null; }
public MyHelperClass extenId;
	public MyHelperClass DbConnection;
	public MyHelperClass esisId;
	public MyHelperClass guestId;
	public MyHelperClass ModuleHelper;
	public MyHelperClass init(){ return null; }

//    @Test
    public void test00_reinitData() throws Exception {
        MyHelperClass Logs = new MyHelperClass();
        Logs.logMethodName();
        init();
        Db db =(Db)(Object) DbConnection.defaultCieDbRW();
        try {
            db.begin();
            PreparedStatement pst =(PreparedStatement)(Object) db.prepareStatement("TRUNCATE e_module;");
            pst.executeUpdate();
            pst =(PreparedStatement)(Object) db.prepareStatement("TRUNCATE e_application_version;");
            pst.executeUpdate();
            ModuleHelper.synchronizeDbWithModuleList(db);
            ModuleHelper.declareNewVersion(db);
            ModuleHelper.updateModuleVersions(db);
            esisId = PeopleFactory.lookupUserName(db, "esis");
            assertNotNull(esisId);
            guestId = PeopleFactory.lookupUserName(db, "guest");
            assertNotNull(guestId);
            extenId = PeopleFactory.lookupUserName(db, "exten");
            assertNotNull(extenId);
            db.commit();
        } catch (Exception e) {
            db.rollback();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logMethodName(){ return null; }
	public MyHelperClass lookupUserName(Db o0, String o1){ return null; }
	public MyHelperClass updateModuleVersions(Db o0){ return null; }
	public MyHelperClass synchronizeDbWithModuleList(Db o0){ return null; }
	public MyHelperClass declareNewVersion(Db o0){ return null; }
	public MyHelperClass defaultCieDbRW(){ return null; }}

class Test {

}

class Db {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass begin(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}
