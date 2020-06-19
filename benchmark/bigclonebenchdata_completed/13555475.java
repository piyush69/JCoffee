


class c13555475 {

    public boolean testConnection(FTPSite site) throws IOException {
        FTPClient testclient = new FTPClient();
        testclient.connect(site.getHost(), site.getPort());
        boolean check =(boolean)(Object) testclient.login(site.getUser(), site.getPassword());
        testclient.disconnect();
        return check;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPSite {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}
