import java.io.*;
import java.lang.*;
import java.util.*;



class c10193598 {

    public static String encodePassword(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDiegest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            messageDiegest.update(password.getBytes("UTF-8"));
            return(String)(Object) Base64.encodeToString(messageDiegest.digest(), false);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Exception while encoding password");
            throw new Error(e);
        } catch (UnsupportedEncodingException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Exception while encoding password");
            throw new Error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeToString(MyHelperClass o0, boolean o1){ return null; }}
