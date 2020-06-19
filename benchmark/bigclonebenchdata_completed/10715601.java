import java.io.*;
import java.lang.*;
import java.util.*;



class c10715601 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static synchronized String toSHA1(String str) {
        MyHelperClass Nulls = new MyHelperClass();
        Nulls.failIfNull(str, "Cannot create an SHA1 encryption form a NULL string");
        try {
            MessageDigest md;
            MyHelperClass SHA1 = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(SHA1);
            byte[] sha1hash = new byte[40];
            MyHelperClass ISO_CHARSET = new MyHelperClass();
            md.update(str.getBytes((String)(Object)ISO_CHARSET), 0, str.length());
            sha1hash =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(sha1hash);
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass failIfNull(String o0, String o1){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
