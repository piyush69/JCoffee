import java.io.*;
import java.lang.*;
import java.util.*;



class c10742462 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String md5(String string) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException exception) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.warn(exception.getMessage());
        }
        byte[] md5hash = new byte[32];
        try {
            md.update(string.getBytes("iso-8859-1"), 0, string.length());
        } catch (UnsupportedEncodingException exception) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.warn(exception.getMessage());
        }
        md5hash =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(md5hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
