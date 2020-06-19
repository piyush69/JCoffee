


class c10182363 {
public MyHelperClass setInputStream(MyHelperClass o0){ return null; }
public MyHelperClass FTP;
	public MyHelperClass ap;
	public MyHelperClass cl;
	public MyHelperClass AuthManager;
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getSite(){ return null; }
	public MyHelperClass getPosition(){ return null; }
	public MyHelperClass getURL(){ return null; }

    public void initGet() throws Exception {
        FTPClient cl;// = new FTPClient();
        cl = new FTPClient();
        cl.connect(getHostName());
        Authentication auth =(Authentication)(Object) AuthManager.getAuth(getSite());
        if (auth == null) auth =(Authentication)(Object) new FTPAuthentication(getSite());
        while (!(Boolean)(Object)cl.login(auth.getUser(), auth.getPassword())) {
            ap.setSite(getSite());
            auth =(Authentication)(Object) ap.promptAuthentication();
            if (auth == null) throw new Exception("User Cancelled Auth Operation");
        }
        cl.connect(getHostName());
        cl.login(auth.getUser(), auth.getPassword());
        cl.enterLocalPassiveMode();
        cl.setFileType(FTP.BINARY_FILE_TYPE);
        cl.setRestartOffset(getPosition());
        setInputStream(cl.retrieveFileStream(new URL(getURL()).getFile()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass promptAuthentication(){ return null; }
	public MyHelperClass setRestartOffset(MyHelperClass o0){ return null; }
	public MyHelperClass setSite(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAuth(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class Authentication {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class FTPAuthentication {

FTPAuthentication(){}
	FTPAuthentication(MyHelperClass o0){}}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass getFile(){ return null; }}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass setRestartOffset(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass retrieveFileStream(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}
