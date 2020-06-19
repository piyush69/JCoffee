import java.io.*;
import java.lang.*;
import java.util.*;



class c21947196 {

    public synchronized String encrypt(final String pPassword) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        md.update(pPassword.getBytes("UTF-8"));
        final byte raw[] =(byte[])(Object) md.digest();
        MyHelperClass BASE64Encoder = new MyHelperClass();
        return(String)(Object) BASE64Encoder.encodeBuffer(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBuffer(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
