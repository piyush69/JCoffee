import java.io.*;
import java.lang.*;
import java.util.*;



class c12887758 {

    public static String getSignature(String s) {
        try {
            final AsciiEncoder coder = new AsciiEncoder();
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            msgDigest.update(s.getBytes("UTF-8"));
            final byte[] digest =(byte[])(Object) msgDigest.digest();
            return(String)(Object) coder.encode(digest);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class AsciiEncoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
