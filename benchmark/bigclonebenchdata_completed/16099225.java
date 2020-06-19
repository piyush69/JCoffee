import java.io.*;
import java.lang.*;
import java.util.*;



class c16099225 {
public static MyHelperClass convertToHex(MyHelperClass o0){ return null; }
//public MyHelperClass convertToHex(MyHelperClass o0){ return null; }

    public static String digest(String text, String algorithm, String charsetName) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            md.update(text.getBytes(charsetName), 0, text.length());
            return(String)(Object) convertToHex(md.digest());
        } catch (UncheckedIOException e) {
            throw new RuntimeException("unexpected exception: " + e, e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("unexpected exception: " + e, e);
        }
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
