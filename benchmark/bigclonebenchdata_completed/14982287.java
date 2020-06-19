import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14982287 {
public MyHelperClass NULL;
public MyHelperClass ftpPort;
public MyHelperClass ftpHostname;
	public MyHelperClass ftpPassword;
	public MyHelperClass Log;
	public MyHelperClass ftpUsername;
	public MyHelperClass ftpClient;
	public MyHelperClass TAG;
	public MyHelperClass FTPReply;

    public void connect() throws SocketException, IOException {
        MyHelperClass TAG = new MyHelperClass();
        Log.i(TAG, "Test attempt login to " + ftpHostname + " as " + ftpUsername);
        FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
        ftpClient = new FTPClient();
        ftpClient.connect(this.ftpHostname, this.ftpPort);
        ftpClient.login(ftpUsername, ftpPassword);
        int reply =(int)(Object) ftpClient.getReplyCode();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            String error = "Login failure (" + reply + ") : " + ftpClient.getReplyString();
            Log.e(TAG, error);
            throw new IOException(error);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
