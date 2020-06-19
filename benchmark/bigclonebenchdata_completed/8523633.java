import java.io.*;
import java.lang.*;
import java.util.*;



class c8523633 {

    private String endcodePassword(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        md.update(password.getBytes("UTF-8"));
        byte raw[] =(byte[])(Object) md.digest();
        Base64 base64 = new Base64();
        String hash = new String((String)(Object)base64.encode(raw));
        return hash;
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

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}
