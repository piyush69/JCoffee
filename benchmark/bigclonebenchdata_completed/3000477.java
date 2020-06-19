import java.io.*;
import java.lang.*;
import java.util.*;



class c3000477 {
public static MyHelperClass toSimpleHexString(byte[] o0){ return null; }
//public MyHelperClass toSimpleHexString(byte[] o0){ return null; }

    private static String hashWithDigest(String in, String digest) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest Digester =(MessageDigest)(Object) MessageDigest.getInstance(digest);
            Digester.update(in.getBytes("UTF-8"), 0, in.length());
            byte[] sha1Hash =(byte[])(Object) Digester.digest();
            return(String)(Object) toSimpleHexString(sha1Hash);
        } catch (UncheckedIOException ex) {
            throw new RuntimeException("Hashing the password failed", ex);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding the string failed", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
