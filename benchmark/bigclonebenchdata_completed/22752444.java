import java.io.*;
import java.lang.*;
import java.util.*;



class c22752444 {

    public synchronized String encrypt(String plainText) {
        String hash = null;
        try {
            MessageDigest md = null;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            } catch (UncheckedIOException e) {
                throw new NoSuchAlgorithmException();
            }
            try {
                if (plainText != null) md.update(plainText.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new UnsupportedEncodingException();
            }
            byte raw[] =(byte[])(Object) md.digest();
            hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass MessageLog = new MyHelperClass();
            MessageLog.writeErrorMessage(e, this);
        } catch (UnsupportedEncodingException e) {
            MyHelperClass MessageLog = new MyHelperClass();
            MessageLog.writeErrorMessage(e, this);
        }
        MyHelperClass Util = new MyHelperClass();
        return(String)(Object) Util.stripChars(hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeErrorMessage(UnsupportedEncodingException o0, c22752444 o1){ return null; }
	public MyHelperClass stripChars(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass writeErrorMessage(NoSuchAlgorithmException o0, c22752444 o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
	NoSuchAlgorithmException(){}
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
