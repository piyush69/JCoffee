import java.io.*;
import java.lang.*;
import java.util.*;



class c4928349 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    private static String getHashString(String text, String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass AssertUtility = new MyHelperClass();
        AssertUtility.notNull(text);
//        MyHelperClass AssertUtility = new MyHelperClass();
        AssertUtility.notNullAndNotSpace(algorithm);
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        md.update(text.getBytes("UTF-8"), 0, text.length());
        byte[] hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNullAndNotSpace(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass notNull(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}
