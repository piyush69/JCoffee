import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3050742 {

    public static String encryptPasswd(String pass)  throws Throwable {
        try {
            if (pass == null || pass.length() == 0) return pass;
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            sha.reset();
            sha.update(pass.getBytes("UTF-8"));
            MyHelperClass Base64OutputStream = new MyHelperClass();
            return(String)(Object) Base64OutputStream.encode(sha.digest());
        } catch (Throwable t) {
            throw new SystemException((String)(Object)t);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
}
