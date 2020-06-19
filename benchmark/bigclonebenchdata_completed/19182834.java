import java.io.*;
import java.lang.*;
import java.util.*;



class c19182834 {

    public synchronized String encrypt(String password) {
        try {
            MessageDigest md = null;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            byte[] hash =(byte[])(Object) (new Base64()).encode(raw);
            return new String(hash);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Algorithm SHA-1 is not supported", e.getCause());
            return null;
        } catch (UnsupportedEncodingException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("UTF-8 encoding is not supported");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
