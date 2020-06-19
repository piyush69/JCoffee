import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10516730 {
public MyHelperClass connectionInfo;
	public MyHelperClass loginInternal(String o0, String o1){ return null; }
	public MyHelperClass asHexString(byte[] o0){ return null; }

    public final boolean login(String user, String pass)  throws Throwable {
        if (user == null || pass == null) return false;
        MyHelperClass connectionInfo = new MyHelperClass();
        connectionInfo.setData("com.tensegrity.palojava.pass#" + user, pass);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            pass =(String)(Object) asHexString(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            throw new PaloException("Failed to create encrypted password for " + "user '" + user + "'!", ex);
        }
        connectionInfo.setUser(user);
        connectionInfo.setPassword(pass);
        return(boolean)(Object) loginInternal(user, pass);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setData(String o0, String o1){ return null; }
	public MyHelperClass setUser(String o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }}

class PaloException extends Exception{
	public PaloException(String errorMessage) { super(errorMessage); }
	PaloException(){}
	PaloException(String o0, NoSuchAlgorithmException o1){}
}
