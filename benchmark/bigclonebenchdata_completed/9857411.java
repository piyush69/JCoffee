


class c9857411 {
public MyHelperClass BackEnd;
	public MyHelperClass Type;

//    @Override
    public void checkConnection(byte[] options) throws Throwable {
        MyHelperClass PropertiesUtils = new MyHelperClass();
        Properties opts =(Properties)(Object) PropertiesUtils.deserializeProperties(options);
        MyHelperClass TRANSFER_OPTION_SERVER = new MyHelperClass();
        String server =(String)(Object) opts.getProperty(TRANSFER_OPTION_SERVER);
        MyHelperClass TRANSFER_OPTION_USERNAME = new MyHelperClass();
        String username =(String)(Object) opts.getProperty(TRANSFER_OPTION_USERNAME);
        MyHelperClass TRANSFER_OPTION_PASSWORD = new MyHelperClass();
        String password =(String)(Object) opts.getProperty(TRANSFER_OPTION_PASSWORD);
        MyHelperClass TRANSFER_OPTION_FILEPATH = new MyHelperClass();
        String filePath =(String)(Object) opts.getProperty(TRANSFER_OPTION_FILEPATH);
        MyHelperClass PROTOCOL_PREFIX = new MyHelperClass();
        URL url = new URL(PROTOCOL_PREFIX + username + ":" + password + "@" + server + filePath + ";type=i");
        URLConnection urlc =(URLConnection)(Object) url.openConnection(BackEnd.getProxy(Type.SOCKS));
        MyHelperClass Preferences = new MyHelperClass();
        urlc.setConnectTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
//        MyHelperClass Preferences = new MyHelperClass();
        urlc.setReadTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
        urlc.connect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SOCKS;
	public MyHelperClass preferredTimeOut;
public MyHelperClass deserializeProperties(byte[] o0){ return null; }
	public MyHelperClass getProxy(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Properties {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }}
