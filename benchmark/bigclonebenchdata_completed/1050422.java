import java.io.*;
import java.lang.*;
import java.util.*;



class c1050422 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String getSHA1Digest(String inputStr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = null;
        byte[] sha1hash = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        sha1hash = new byte[40];
        md.update(inputStr.getBytes("iso-8859-1"), 0, inputStr.length());
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
