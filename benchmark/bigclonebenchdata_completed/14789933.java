import java.io.*;
import java.lang.*;
import java.util.*;



class c14789933 {

    public static String stringToHash(String text) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
        } catch (UncheckedIOException e) {
            throw new IllegalStateException("Should not happened: SHA-1 algorithm is missing.");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Should not happened: Could not encode text bytes '" + text + "' to iso-8859-1.");
        }
        return new String((String)(Object)Base64.encodeBase64(md.digest()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}
