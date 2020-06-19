import java.io.*;
import java.lang.*;
import java.util.*;



class c10106969 {
public static MyHelperClass byteArrayToHexString(byte[] o0){ return null; }
//public MyHelperClass byteArrayToHexString(byte[] o0){ return null; }

    public static String md5(String value) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        try {
            messageDigest.update(value.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            messageDigest.update(value.getBytes());
        }
        byte[] bytes =(byte[])(Object) messageDigest.digest();
        return(String)(Object) byteArrayToHexString(bytes);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
