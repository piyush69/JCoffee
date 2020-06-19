import java.io.*;
import java.lang.*;
import java.util.*;



class c10816804 {

    public static String md5(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        StringBuffer result = new StringBuffer();
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(input.getBytes("utf-8"));
        byte[] digest =(byte[])(Object) md.digest();
        for (byte b : digest) {
            result.append(String.format("%02X ", b & 0xff));
        }
        return result.toString();
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
