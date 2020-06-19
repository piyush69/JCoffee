import java.io.*;
import java.lang.*;
import java.util.*;



class c11159237 {

    public static String hash(final String text) {
        try {
            MessageDigest md;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] sha1hash;
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            sha1hash =(byte[])(Object) md.digest();
            MyHelperClass Sha1 = new MyHelperClass();
            return(String)(Object) Sha1.convertToHex(sha1hash);
        } catch (UncheckedIOException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convertToHex(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
