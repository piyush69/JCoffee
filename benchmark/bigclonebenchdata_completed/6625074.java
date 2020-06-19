import java.io.*;
import java.lang.*;
import java.util.*;



class c6625074 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;
	public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String SHA1(String text) {
        byte[] sha1hash = new byte[40];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            sha1hash =(byte[])(Object) md.digest();
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Converter.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
        }
        return(String)(Object) convertToHex(sha1hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Converter {

}
