import java.io.*;
import java.lang.*;
import java.util.*;



class c9218164 {

    public static String encode(String text) {
        try {
            byte[] hash = new byte[32];
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(text.getBytes("UTF-8"), 0, text.length());
            hash =(byte[])(Object) md.digest();
            MyHelperClass MD5 = new MyHelperClass();
            return(String)(Object) MD5.toHex(hash);
        } catch (UncheckedIOException ex) {
            return ex.getMessage();
        } catch (UnsupportedEncodingException ex) {
            return ex.getMessage();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toHex(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
