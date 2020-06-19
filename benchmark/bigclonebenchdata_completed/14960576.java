import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14960576 {

    public static String encrypt(String text)  throws Throwable {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            throw new WebDocRuntimeException((String)(Object)ex);
        }
        md.update(text.getBytes());
        BigInteger hash = new BigInteger(1, md.digest());
        MyHelperClass HEX = new MyHelperClass();
        return hash.toString((int)(Object)HEX);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class WebDocRuntimeException extends Exception{
	public WebDocRuntimeException(String errorMessage) { super(errorMessage); }
}
