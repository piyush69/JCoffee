import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10104168 {
public static MyHelperClass logger;
	public static MyHelperClass encode(String o0, String o1, String o2){ return null; }
	public static MyHelperClass getHashString(byte[] o0){ return null; }
//public MyHelperClass logger;
//	public MyHelperClass getHashString(byte[] o0){ return null; }
//	public MyHelperClass encode(String o0, String o1, String o2){ return null; }

    public static String calculateHash(String data, String algorithm)  throws Throwable {
        if (data == null) {
            return null;
        }
        MyHelperClass INTERNAL = new MyHelperClass();
        algorithm = (algorithm == null ? INTERNAL : algorithm.toUpperCase());
        MyHelperClass PLAIN = new MyHelperClass();
        if (algorithm.equals(PLAIN)) {
            return data;
        }
        if (algorithm.startsWith("{RSA}")) {
            return(String)(Object) encode(data, algorithm.substring(5), "RSA");
        }
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(data.getBytes("UTF-8"));
            return(String)(Object) getHashString(md.digest());
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage());
            return null;
        } catch (NoSuchAlgorithmException nsae) {
            logger.error(nsae.getMessage());
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}
