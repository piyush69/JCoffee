import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23161666 {
public MyHelperClass NULL;
public MyHelperClass port;
public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass hostname;
	public MyHelperClass Level;
	public MyHelperClass client;
	public MyHelperClass Logger;
	public MyHelperClass setupActiveFolder(){ return null; }

    private boolean createFTPConnection()  throws Throwable {
        FTPClient client =(FTPClient)(Object) NULL; //new FTPClient();
        client = new FTPClient();
        System.out.println("Client created");
        try {
            client.connect(this.hostname, this.port);
            System.out.println("Connected: " + this.hostname + ", " + this.port);
            client.login(username, password);
            System.out.println("Logged in: " + this.username + ", " + this.password);
            this.setupActiveFolder();
            return true;
        } catch (IllegalStateException ex) {
            Logger.getLogger(FTPProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArithmeticException ex) {
            Logger.getLogger(FTPProject.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IllegalStateException)(Object) ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(FTPProject.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IllegalStateException)(Object) ex);
        } catch (ArrayStoreException ex) {
            Logger.getLogger(FTPProject.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IllegalStateException)(Object) ex);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IllegalStateException o2){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, FTPIllegalReplyException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, FTPException o2){ return null; }}

class FTPProject {

}

class FTPIllegalReplyException extends Exception{
	public FTPIllegalReplyException(String errorMessage) { super(errorMessage); }
}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }}
