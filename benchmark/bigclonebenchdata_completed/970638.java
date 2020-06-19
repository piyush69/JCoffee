import java.io.*;
import java.lang.*;
import java.util.*;



class c970638 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    private static String hashPassword(String password, String customsalt) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass SALT1 = new MyHelperClass();
        password = SALT1 + password;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(password.getBytes(), 0, password.length());
        MyHelperClass SALT2 = new MyHelperClass();
        password +=(int)(Object) convertToHex((byte[])(Object)md5.digest()) + (int)(Object)SALT2 + customsalt;
//        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        byte[] sha1hash = new byte[40];
        md.update(password.getBytes("UTF-8"), 0, password.length());
        sha1hash =(byte[])(Object) md.digest();
        return convertToHex(sha1hash) + "|" + customsalt;
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
