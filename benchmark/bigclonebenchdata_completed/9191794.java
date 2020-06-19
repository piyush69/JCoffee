import java.io.*;
import java.lang.*;
import java.util.*;



class c9191794 {
public static MyHelperClass encodeHex(byte[] o0){ return null; }
//public MyHelperClass encodeHex(byte[] o0){ return null; }

public static String md5(String text) {
        MessageDigest msgDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new IllegalStateException("System doesn't support MD5 algorithm.");
        }
        try {
            MyHelperClass AlipayConfig = new MyHelperClass();
            msgDigest.update(text.getBytes((String)(Object)AlipayConfig.CharSet));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("System doesn't support your  EncodingException.");
        }
        byte[] bytes =(byte[])(Object) msgDigest.digest();
        String md5Str = new String((String)(Object)encodeHex(bytes));
        return md5Str;
    }
}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CharSet;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
