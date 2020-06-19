import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19660641 {

    public static String MD5_hex(String p)  throws Throwable {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(p.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            String ret = hash.toString(16);
            return ret;
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("can not create confirmation key", e);
            throw new TechException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class TechException extends Exception{
	public TechException(String errorMessage) { super(errorMessage); }
}
