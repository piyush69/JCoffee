import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12428011 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;

    public static String ftpPing(String root, String host, int port, String username, String pw) {
        try {
            FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
            ftpClient = new FTPClient();
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.setRemoteAddr(InetAddress.getByName(host));
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.setControlPort(port);
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.setTimeout(4000);
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.connect();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.login(username, (pw));
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.chdir(root);
            MyHelperClass JobHandler = new MyHelperClass();
            JobHandler.releaseFTPLock();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        try {
            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.quit();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(){ return null; }
	public MyHelperClass chdir(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setRemoteAddr(InetAddress o0){ return null; }
	public MyHelperClass setTimeout(int o0){ return null; }
	public MyHelperClass releaseFTPLock(){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass setControlPort(int o0){ return null; }}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass connect(){ return null; }
	public MyHelperClass chdir(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setRemoteAddr(InetAddress o0){ return null; }
	public MyHelperClass setTimeout(int o0){ return null; }
	public MyHelperClass setControlPort(int o0){ return null; }}
