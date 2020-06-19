import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3569939 {
public MyHelperClass NULL;
public MyHelperClass password;
	public MyHelperClass FTPReply;
public MyHelperClass username;
	public MyHelperClass isConnected;
	public MyHelperClass ftp;

    public void connect() throws Throwable, FTPException {
        try {
            FTPClient ftp =(FTPClient)(Object) NULL; //new FTPClient();
            ftp = new FTPClient();
            MyHelperClass host = new MyHelperClass();
            ftp.connect(host);
//            MyHelperClass ftp = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                ftp.login(this.username, this.password);
            } else {
                ftp.disconnect();
                throw new FTPException("Não foi possivel se conectar no servidor FTP");
            }
            isConnected =(MyHelperClass)(Object) true;
        } catch (Exception ex) {
            throw new FTPException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
