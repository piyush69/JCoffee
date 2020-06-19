import java.io.*;
import java.lang.*;
import java.util.*;



class c2520215 {

    public synchronized String encrypt(String plaintext) {
        if (plaintext == null) plaintext = "";
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash = "";
        try {
            MyHelperClass Base64Encoder = new MyHelperClass();
            hash =(String)(Object) Base64Encoder.encode(raw);
        } catch (UncheckedIOException e1) {
            System.err.println("Error encoding password using Jboss Base64Encoder");
            e1.printStackTrace();
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
