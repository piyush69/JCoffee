import java.io.*;
import java.lang.*;
import java.util.*;



class c13994043 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String calculateSHA1(String data, String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        data += key;
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        byte[] sha1hash = new byte[40];
        md.update(data.getBytes("iso-8859-1"), 0, data.length());
        sha1hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(sha1hash);
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
