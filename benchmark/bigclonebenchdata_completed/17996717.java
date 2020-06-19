import java.io.*;
import java.lang.*;
import java.util.*;



class c17996717 {

    public byte[] getHash(String plaintext) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        digest.reset();
        MyHelperClass salt = new MyHelperClass();
        digest.update(salt.getBytes("UTF-8"));
        return(byte[])(Object) digest.digest(plaintext.getBytes("UTF-8"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass reset(){ return null; }}
