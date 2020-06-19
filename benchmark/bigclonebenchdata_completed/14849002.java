import java.io.*;
import java.lang.*;
import java.util.*;



class c14849002 {

    public synchronized String encrypt(String plaintext) throws PasswordException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new PasswordException(e.getMessage());
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new PasswordException(e.getMessage());
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new Base64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class PasswordException extends Exception{
	public PasswordException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
