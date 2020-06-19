import java.io.*;
import java.lang.*;
import java.util.*;



class c5851660 {
public static MyHelperClass toHex(byte[] o0){ return null; }
//public MyHelperClass toHex(byte[] o0){ return null; }

    public static String genetateSHA256(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes("UTF-8"));
        byte[] passWd =(byte[])(Object) md.digest();
        String hex =(String)(Object) toHex(passWd);
        return hex;
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
