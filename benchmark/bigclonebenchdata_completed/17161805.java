import java.io.*;
import java.lang.*;
import java.util.*;



class c17161805 {

    private String encode(String plaintext) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(plaintext.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            return(String)(Object) (new BASE64Encoder()).encode(raw);
        } catch (UncheckedIOException e) {
            throw new IllegalStateException("Error encoding: " + e);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Error encoding: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
