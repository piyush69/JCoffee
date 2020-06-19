import java.io.*;
import java.lang.*;
import java.util.*;



class c15896100 {
public MyHelperClass Logger;
	public MyHelperClass Level;
	public MyHelperClass convToHex(byte[] o0){ return null; }

    public String SHA1(String text) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] sha1hash = new byte[40];
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            sha1hash =(byte[])(Object) md.digest();
            return(String)(Object) convToHex(sha1hash);
        } catch (UncheckedIOException ex) {
            Logger.getLogger(CMessageDigestFile.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CMessageDigestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
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

class CMessageDigestFile {

}
