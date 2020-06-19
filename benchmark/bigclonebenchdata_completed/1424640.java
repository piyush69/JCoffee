import java.io.*;
import java.lang.*;
import java.util.*;



class c1424640 {

    public static String encrypt(String plaintext) throws NoSuchAlgorithmException {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("unable to encrypt password" + e.getMessage());
            throw new NoSuchAlgorithmException(e.getMessage());
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("unable to encrypt password" + e.getMessage());
            throw new NoSuchAlgorithmException(e.getMessage());
        }
        byte raw[] =(byte[])(Object) md.digest();
        return(String)(Object) (new BASE64Encoder()).encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
