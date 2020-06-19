import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13067555 {
public static MyHelperClass logger;
	public static MyHelperClass byteArrayToHexString(byte[] o0){ return null; }
//public MyHelperClass logger;
//	public MyHelperClass byteArrayToHexString(byte[] o0){ return null; }

    public static String MD5Digest(String source) {
        MessageDigest digest;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(source.getBytes("UTF8"));
            byte[] hash = digest.digest();
            String strHash =(String)(Object) byteArrayToHexString(hash);
            return strHash;
        } catch (NoSuchAlgorithmException e) {
            String msg = "%s: %s";
            msg = String.format(msg, e.getClass().getName(), e.getMessage());
            logger.error(msg);
            return null;
        } catch (UnsupportedEncodingException e) {
            String msg = "%s: %s";
            msg = String.format(msg, e.getClass().getName(), e.getMessage());
            logger.error(msg);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}
