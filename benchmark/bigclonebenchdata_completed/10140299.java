import java.io.*;
import java.lang.*;
import java.util.*;



class c10140299 {

    protected static byte[] hashPassword(byte[] saltBytes, String plaintextPassword) throws AssertionError {
        MessageDigest digest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException ex) {
            throw (AssertionError) new AssertionError("No MD5 message digest supported.").initCause(ex);
        }
        digest.update(saltBytes);
        try {
            digest.update(plaintextPassword.getBytes("utf-8"));
        } catch (UnsupportedEncodingException ex) {
            throw (AssertionError) new AssertionError("No UTF-8 encoding supported.").initCause(ex);
        }
        byte[] passwordBytes =(byte[])(Object) digest.digest();
        return passwordBytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
