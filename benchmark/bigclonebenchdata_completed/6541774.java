import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6541774 {

    private static String digest(String val)  throws Throwable {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(val.trim().getBytes());
            byte[] digest = md.digest();
            StringBuffer buf = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b);
                int length = hexString.length();
                if (length > 2) {
                    hexString = hexString.substring(length - 2, length);
                } else if (length < 2) {
                    hexString = "0" + hexString;
                }
                buf.append(hexString);
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new EnerjyException("Could not create digest: MD5", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EnerjyException extends Exception{
	public EnerjyException(String errorMessage) { super(errorMessage); }
	EnerjyException(){}
	EnerjyException(String o0, NoSuchAlgorithmException o1){}
}
