import java.io.*;
import java.lang.*;
import java.util.*;



class c17347452 {

    public static byte[] SHA1(String... strings) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            digest.reset();
            for (String string : strings) {
                digest.update(string.getBytes("UTF-8"));
            }
            return(byte[])(Object) digest.digest();
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e.toString(), e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.toString(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
