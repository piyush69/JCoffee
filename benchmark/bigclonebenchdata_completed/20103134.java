import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20103134 {

    public static String base64HashedString(String v)  throws Throwable {
        String base64HashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(v.getBytes());
            String hashedPassword = new String(md.digest());
            sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
            base64HashedPassword = enc.encode(hashedPassword.getBytes());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new NSForwardException(e, "Couldn't find the SHA hash algorithm; perhaps you do not have the SunJCE security provider installed properly?");
        }
        return base64HashedPassword;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NSForwardException extends Exception{
	public NSForwardException(String errorMessage) { super(errorMessage); }
	NSForwardException(){}
	NSForwardException(NoSuchAlgorithmException o0, String o1){}
}
