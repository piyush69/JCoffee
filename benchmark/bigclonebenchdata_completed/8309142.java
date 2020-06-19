import java.io.*;
import java.lang.*;
import java.util.*;



class c8309142 {

    public boolean check(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        MyHelperClass username = new MyHelperClass();
        md.update((byte)(Object)username.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass realm = new MyHelperClass();
        md.update((byte)(Object)realm.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        md.update(password.getBytes("ISO-8859-1"));
        byte[] ha1 =(byte[])(Object) md.digest();
        MyHelperClass Hex = new MyHelperClass();
        String hexHa1 = new String((String)(Object)Hex.encodeHex(ha1));
        md.reset();
        MyHelperClass method = new MyHelperClass();
        md.update((byte)(Object)method.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass uri = new MyHelperClass();
        md.update((byte)(Object)uri.getBytes("ISO-8859-1"));
        byte[] ha2 =(byte[])(Object) md.digest();
//        MyHelperClass Hex = new MyHelperClass();
        String hexHa2 = new String((String)(Object)Hex.encodeHex(ha2));
        md.reset();
        md.update(hexHa1.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass nonce = new MyHelperClass();
        md.update((byte)(Object)nonce.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass nc = new MyHelperClass();
        md.update((byte)(Object)nc.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass cnonce = new MyHelperClass();
        md.update((byte)(Object)cnonce.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        MyHelperClass qop = new MyHelperClass();
        md.update((byte)(Object)qop.getBytes("ISO-8859-1"));
        md.update((byte) ':');
        md.update(hexHa2.getBytes("ISO-8859-1"));
        byte[] digest =(byte[])(Object) md.digest();
//        MyHelperClass Hex = new MyHelperClass();
        String hexDigest = new String((String)(Object)Hex.encodeHex(digest));
        MyHelperClass response = new MyHelperClass();
        return (hexDigest.equalsIgnoreCase((String)(Object)response));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeHex(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}
