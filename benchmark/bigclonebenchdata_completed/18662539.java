import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18662539 {
public MyHelperClass url;
	public MyHelperClass speedTimer;
	public MyHelperClass ftp;
	public MyHelperClass getFile(){ return null; }

//    @Override
    public void start()  throws Throwable {
        try {
            FTPClient ftp = NULL; //new FTPClient();
            ftp = new FTPClient();
            ftp.connect(this.url.getHost(),(int)(Object) this.url.getPort() == -1 ? this.url.getDefaultPort() : this.url.getPort());
            String username = "anonymous";
            String password = "";
            if (this.url.getUserInfo() != null) {
                username = this.url.getUserInfo().split(":")[0];
                password = this.url.getUserInfo().split(":")[1];
            }
            ftp.login(username, password);
            long startPos = 0;
            if ((boolean)(Object)getFile().exists()) startPos = getFile().length(); else getFile().createNewFile();
            ftp.download(this.url.getPath(), getFile(), startPos, new FTPDTImpl());
            ftp.disconnect(true);
        } catch (Exception ex) {
            ex.printStackTrace();
            speedTimer.cancel();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0){ return null; }
	public MyHelperClass getDefaultPort(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getUserInfo(){ return null; }
	public MyHelperClass download(MyHelperClass o0, MyHelperClass o1, long o2, FTPDTImpl o3){ return null; }
	public MyHelperClass disconnect(boolean o0){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass cancel(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class FTPClient {

}

class FTPDTImpl {

}
