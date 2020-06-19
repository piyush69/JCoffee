import java.io.*;
import java.lang.*;
import java.util.*;



class c7082101 {

    public byte[] computeMD5(String plainText) throws GException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException ex) {
            throw new GException("The MD5 hash algorithm is not available.",(NoSuchAlgorithmException)(Object) ex);
        }
        try {
            md.update(plainText.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            throw new GException("The UTF-8 encoding is not supported.", ex);
        }
        return(byte[])(Object) md.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class GException extends Exception{
	public GException(String errorMessage) { super(errorMessage); }
	GException(String o0, NoSuchAlgorithmException o1){}
	GException(String o0, UnsupportedEncodingException o1){}
	GException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
