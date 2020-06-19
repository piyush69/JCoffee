


class c4502456 {
public MyHelperClass pass;
	public MyHelperClass FTPTransferType;
	public MyHelperClass user;
	public MyHelperClass FTPConnectMode;
	public MyHelperClass cl;
	public MyHelperClass getPosition(){ return null; }
	public MyHelperClass getURL(){ return null; }

    public void initGet() throws Exception {
        FTPClient cl;// = new FTPClient();
        cl = new FTPClient();
        URL url = new URL(getURL());
        cl.setRemoteHost(url.getHost());
        cl.connect();
        cl.login(user, pass);
        cl.setType(FTPTransferType.BINARY);
        cl.setConnectMode(FTPConnectMode.PASV);
        cl.restart(getPosition());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY;
	public MyHelperClass PASV;
public MyHelperClass setRemoteHost(MyHelperClass o0){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass restart(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass getHost(){ return null; }}

class FTPClient {

public MyHelperClass restart(MyHelperClass o0){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setRemoteHost(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }}
