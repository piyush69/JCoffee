import java.io.*;
import java.lang.*;
import java.util.*;



class c14616047 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String md5(final String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        MyHelperClass FOUR_BYTES = new MyHelperClass();
        byte[] md5hash = new byte[(int)(Object)FOUR_BYTES];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md5hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(md5hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}
