import java.io.*;
import java.lang.*;
import java.util.*;



class c12408144 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String generateSHA1Digest(String text) {
        try {
            MessageDigest md;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] sha1hash = new byte[40];
            md.update(text.getBytes("UTF-8"), 0, text.length());
            sha1hash =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(sha1hash);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
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
