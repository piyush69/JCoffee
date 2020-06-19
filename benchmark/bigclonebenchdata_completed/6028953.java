import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6028953 {
public MyHelperClass Log;

    public final int connectAndLogin(Uri u, boolean cwd) throws Throwable, UnknownHostException, IOException, InterruptedException {
        MyHelperClass ftp = new MyHelperClass();
        if ((boolean)(Object)ftp.isLoggedIn()) {
            if (cwd) {
                String path =(String)(Object) u.getPath();
//                MyHelperClass ftp = new MyHelperClass();
                if (path != null) ftp.setCurrentDir(path);
            }
            MyHelperClass WAS_IN = new MyHelperClass();
            return(int)(Object) WAS_IN;
        }
        int port =(int)(Object) u.getPort();
        if (port == -1) port = 21;
        String host =(String)(Object) u.getHost();
//        MyHelperClass ftp = new MyHelperClass();
        if ((boolean)(Object)ftp.connect(host, port)) {
            MyHelperClass theUserPass = new MyHelperClass();
            if (theUserPass == null || (boolean)(Object)theUserPass.isNotSet()) theUserPass = new FTPCredentials(u.getUserInfo());
//            MyHelperClass theUserPass = new MyHelperClass();
            if ((boolean)(Object)ftp.login(theUserPass.getUserName(), theUserPass.getPassword())) {
                if (cwd) {
                    String path =(String)(Object) u.getPath();
//                    MyHelperClass ftp = new MyHelperClass();
                    if (path != null) ftp.setCurrentDir(path);
                }
                MyHelperClass LOGGED_IN = new MyHelperClass();
                return(int)(Object) LOGGED_IN;
            } else {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.logout(true);
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
                MyHelperClass TAG = new MyHelperClass();
                Log.w(TAG, "Invalid credentials.");
                MyHelperClass NO_LOGIN = new MyHelperClass();
                return(int)(Object) NO_LOGIN;
            }
        }
        MyHelperClass NO_CONNECT = new MyHelperClass();
        return(int)(Object) NO_CONNECT;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isLoggedIn(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isNotSet(){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass logout(boolean o0){ return null; }
	public MyHelperClass setCurrentDir(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class Uri {

public MyHelperClass getUserInfo(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class FTPCredentials {

FTPCredentials(MyHelperClass o0){}
	FTPCredentials(){}}
