


class c4470706 {
public MyHelperClass log;
	public MyHelperClass allNecessaryTablesCreated(Connection o0){ return null; }

//    @Override
    public boolean validatePublisher(Object object, String... dbSettingParams) {
        DBConnectionListener listener = (DBConnectionListener) object;
        String host = dbSettingParams[0];
        String port = dbSettingParams[1];
        String driver = dbSettingParams[2];
        String type = dbSettingParams[3];
        String dbHost = dbSettingParams[4];
        String dbName = dbSettingParams[5];
        String dbUser = dbSettingParams[6];
        String dbPassword = dbSettingParams[7];
        boolean validPublisher = false;
        String url = "http://" + host + ":" + port + "/reports";
        try {
            URL _url = new URL(url);
            _url.openConnection().connect();
            validPublisher = true;
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.FINE, "Failed validating url " + url, e);
        }
        if (validPublisher) {
            Connection conn;
            try {
                if (driver != null) {
                    MyHelperClass DBProperties = new MyHelperClass();
                    conn =(Connection)(Object) DBProperties.getInstance().getConnection(driver, dbHost, dbName, type, dbUser, dbPassword);
                } else {
                    MyHelperClass DBProperties = new MyHelperClass();
                    conn =(Connection)(Object) DBProperties.getInstance().getConnection();
                }
            } catch (Exception e) {
                conn = null;
                listener.connectionIsOk(false, null);
                validPublisher = false;
            }
            if (validPublisher) {
                if (!(Boolean)(Object)allNecessaryTablesCreated(conn)) {
                    conn = null;
                    listener.connectionIsOk(false, null);
                    validPublisher = false;
                }
                listener.connectionIsOk(true, conn);
            }
        } else {
            listener.connectionIsOk(false, null);
        }
        return validPublisher;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getConnection(String o0, String o1, String o2, String o3, String o4, String o5){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class DBConnectionListener {

public MyHelperClass connectionIsOk(boolean o0, Connection o1){ return null; }
	public MyHelperClass connectionIsOk(boolean o0, Object o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Connection {

}
