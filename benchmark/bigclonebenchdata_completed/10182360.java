import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10182360 {
public MyHelperClass AuthManager;
	public MyHelperClass ap;
	public MyHelperClass cl;
	public MyHelperClass log;
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass setURL(String o0){ return null; }
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getSite(){ return null; }

    public void getDownloadInfo(String _url) throws Throwable, Exception {
        MyHelperClass cl = new MyHelperClass();
        cl = new FTPClient();
        Authentication auth =(Authentication)(Object) new FTPAuthentication();
        cl.connect(getHostName());
        while (!cl.login(auth.getUser(), auth.getPassword())) {
            log.debug("getDownloadInfo() - login error state: " + Arrays.asList(cl.getReplyStrings()));
            ap.setSite(getSite());
            auth = ap.promptAuthentication();
            if (auth == null) throw new Exception("User Cancelled Auth Operation");
        }
        AuthManager.putAuth(getSite(), auth);
        cl.enterLocalPassiveMode();
        FTPFile file = cl.listFiles(new URL(_url).getFile())[0];
        setURL(_url);
        setLastModified(file.getTimestamp().getTimeInMillis());
        setSize(file.getSize());
        setResumable(cl.rest("0") == 350);
        setRangeEnd((int)(Object)getSize() - 1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSite(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyStrings(){ return null; }
	public MyHelperClass putAuth(MyHelperClass o0, Authentication o1){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass promptAuthentication(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass rest(String o0){ return null; }}

class Authentication {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUser(){ return null; }}

class FTPAuthentication {

}

class FTPFile {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getTimestamp(){ return null; }}

class FTPClient {

}
