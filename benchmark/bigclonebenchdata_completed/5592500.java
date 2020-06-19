import java.io.*;
import java.lang.*;
import java.util.*;



class c5592500 {

    public static synchronized String encrypt(String plaintext) throws SinaduraCoreException {
        MessageDigest md = null;
        String hash = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            try {
                MyHelperClass CHARSET_UTF8 = new MyHelperClass();
                md.update(plaintext.getBytes((String)(Object)CHARSET_UTF8));
            } catch (UnsupportedEncodingException e) {
                throw new SinaduraCoreException(e.getMessage(), e);
            }
            byte raw[] =(byte[])(Object) md.digest();
            hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        } catch (UncheckedIOException e) {
            throw new SinaduraCoreException(e.getMessage(),(UnsupportedEncodingException)(Object) e);
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class SinaduraCoreException extends Exception{
	public SinaduraCoreException(String errorMessage) { super(errorMessage); }
	SinaduraCoreException(){}
	SinaduraCoreException(String o0, UnsupportedEncodingException o1){}
	SinaduraCoreException(String o0, NoSuchAlgorithmException o1){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
