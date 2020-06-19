import java.io.*;
import java.lang.*;
import java.util.*;



class c14832930 {

    private static String format(String check) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        check = check.replaceAll(" ", "");
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(check.getBytes("ISO-8859-1"));
        byte[] end =(byte[])(Object) md5.digest();
        String digest = "";
        for (int i = 0; i < end.length; i++) {
            digest += ((end[i] & 0xff) < 16 ? "0" : "") + Integer.toHexString(end[i] & 0xff);
        }
        return digest;
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
