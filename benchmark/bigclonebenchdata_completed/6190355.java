import java.io.*;
import java.lang.*;
import java.util.*;



class c6190355 {
public static MyHelperClass encodeBase64(byte[] o0){ return null; }
//public MyHelperClass encodeBase64(byte[] o0){ return null; }

    public static String hashPassword(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes("UTF-8"));
            byte[] bytes =(byte[])(Object) md.digest();
            String result =(String)(Object) encodeBase64(bytes);
            return result.trim();
        } catch (UncheckedIOException nsae) {
            throw new IllegalStateException(nsae.getMessage());
        } catch (UnsupportedEncodingException uee) {
            throw new IllegalStateException(uee.getMessage());
        }
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
