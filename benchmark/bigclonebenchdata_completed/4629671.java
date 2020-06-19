import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4629671 {
public static MyHelperClass byteToHexString(byte[] o0){ return null; }
//public MyHelperClass byteToHexString(byte[] o0){ return null; }

    public static String hexMD5(String value)  throws Throwable {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(value.getBytes("utf-8"));
            byte[] digest = messageDigest.digest();
            return(String)(Object) byteToHexString(digest);
        } catch (Exception ex) {
            throw new UnexpectedException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UnexpectedException extends Exception{
	public UnexpectedException(String errorMessage) { super(errorMessage); }
}
