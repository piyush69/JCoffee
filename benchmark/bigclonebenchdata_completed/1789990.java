import java.io.*;
import java.lang.*;
import java.util.*;



class c1789990 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    public String getHash(final String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        final MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        byte[] md5hash;
        digest.update(password.getBytes("utf-8"), 0, password.length());
        md5hash =(byte[])(Object) digest.digest();
        return(String)(Object) convertToHex(md5hash);
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
