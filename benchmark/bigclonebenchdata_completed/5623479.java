import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5623479 {
public static MyHelperClass log;
	public static MyHelperClass getHex(byte[] o0){ return null; }
//public MyHelperClass log;
//	public MyHelperClass getHex(byte[] o0){ return null; }

    public static String getHash(String text)  throws Throwable {
        String ret = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            ret =(String)(Object) getHex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            log.error(e);
            throw new OopsException(e, "Hash Error.");
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(NoSuchAlgorithmException o0){ return null; }}

class OopsException extends Exception{
	public OopsException(String errorMessage) { super(errorMessage); }
	OopsException(){}
	OopsException(NoSuchAlgorithmException o0, String o1){}
}
