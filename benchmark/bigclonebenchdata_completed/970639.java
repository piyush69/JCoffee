import java.io.*;
import java.lang.*;
import java.util.*;



class c970639 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String unsecureHashConstantSalt(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass SALT3 = new MyHelperClass();
        password = SALT3 + password;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(password.getBytes(), 0, password.length());
        MyHelperClass SALT4 = new MyHelperClass();
        password +=(int)(Object) convertToHex((byte[])(Object)md5.digest()) + (int)(Object)SALT4;
//        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        byte[] sha1hash = new byte[40];
        md.update(password.getBytes("UTF-8"), 0, password.length());
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
