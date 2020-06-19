import java.io.*;
import java.lang.*;
import java.util.*;



class c2732151 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String compute(String text) {
        try {
            MessageDigest md;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            byte[] md5hash = new byte[32];
            md.update(text.getBytes("UTF-8"), 0, text.length());
            md5hash =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(md5hash);
        } catch (UncheckedIOException nax) {
            RuntimeException rx = new IllegalStateException();
            rx.initCause(rx);
            throw rx;
        } catch (UnsupportedEncodingException uex) {
            RuntimeException rx = new IllegalStateException();
            rx.initCause(uex);
            throw rx;
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
