import java.io.*;
import java.lang.*;
import java.util.*;



class c12128591 {
public static MyHelperClass encodeHex(MyHelperClass o0){ return null; }
public static MyHelperClass MessageDigest;
//	public MyHelperClass encodeHex(MyHelperClass o0){ return null; }
//public MyHelperClass MessageDigest;

    public static final synchronized String hash(String data) {
        MyHelperClass digest = new MyHelperClass();
        if (digest == null) {
            try {
//                MyHelperClass digest = new MyHelperClass();
                digest = MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException nsae) {
                MyHelperClass log = new MyHelperClass();
                log.error("Failed to load the MD5 MessageDigest. " + "Jive will be unable to function normally.",(NoSuchAlgorithmException)(Object) nsae);
            }
        }
        try {
//            MyHelperClass digest = new MyHelperClass();
            digest.update(data.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e);
        }
//        MyHelperClass digest = new MyHelperClass();
        return(String)(Object) encodeHex(digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(UnsupportedEncodingException o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
