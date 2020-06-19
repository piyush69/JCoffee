import java.io.*;
import java.lang.*;
import java.util.*;



class c22284204 {

    public String crypt(String suppliedPassword) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(suppliedPassword.getBytes());
        String encriptedPassword = null;
        try {
            encriptedPassword = new String((byte[])(Object)Base64.encode(md.digest()), "ASCII");
        } catch (UnsupportedEncodingException e) {
        }
        return encriptedPassword;
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

public static MyHelperClass encode(MyHelperClass o0){ return null; }}
