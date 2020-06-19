import java.io.*;
import java.lang.*;
import java.util.*;



class c7893892 {

    public static String md5EncodeString(String s) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (s == null) return null;
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isBlank(s)) return "";
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        algorithm.reset();
        algorithm.update(s.getBytes("UTF-8"));
        byte messageDigest[] =(byte[])(Object) algorithm.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < messageDigest.length; i++) {
            String hex = Integer.toHexString(0xFF & messageDigest[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}
