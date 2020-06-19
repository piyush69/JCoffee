import java.io.*;
import java.lang.*;
import java.util.*;



class c21898978 {
public static MyHelperClass convertToHexFormat(byte[] o0){ return null; }
//public MyHelperClass convertToHexFormat(byte[] o0){ return null; }

    public static String SHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (text == null || text.length() < 1) {
            return null;
        }
        MyHelperClass TYPE_SHA = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(TYPE_SHA);
        MyHelperClass ENCODE = new MyHelperClass();
        md.update(text.getBytes((String)(Object)ENCODE), 0, text.length());
        byte[] sha1hash = new byte[40];
        sha1hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHexFormat(sha1hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
