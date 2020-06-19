import java.io.*;
import java.lang.*;
import java.util.*;



class c10453631 {
public MyHelperClass log(){ return null; }

    public synchronized String encrypt(String plaintext) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UncheckedIOException e) {
            log().error("failed to encrypt the password.",(UnsupportedEncodingException)(Object) e);
            throw new RuntimeException("failed to encrypt the password.", e);
        } catch (UnsupportedEncodingException e) {
            log().error("failed to encrypt the password.", e);
            throw new RuntimeException("failed to encrypt the password.", e);
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
