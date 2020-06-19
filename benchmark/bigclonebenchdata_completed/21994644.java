import java.io.*;
import java.lang.*;
import java.util.*;



class c21994644 {

    public synchronized String encrypt(String plaintext) {
        if (plaintext == null || plaintext.equals("")) {
            return plaintext;
        }
        String hash = null;
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e.getMessage());
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            hash =(String)(Object) Base64.encodeBase64String(raw).replaceAll("\r\n", "");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBase64String(byte[] o0){ return null; }}
