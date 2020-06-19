import java.io.*;
import java.lang.*;
import java.util.*;



class c2603514 {
public static MyHelperClass log;
	public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass log;
//	public MyHelperClass convertToHex(byte[] o0){ return null; }

    private static String computeSHA(String input) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(input.getBytes("UTF-8"));
            byte[] code =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(code);
        } catch (UncheckedIOException e) {
            log.error("Algorithm SHA-1 not found!",(UnsupportedEncodingException)(Object) e);
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            log.error("Encoding problem: UTF-8 not supported!", e);
            e.printStackTrace();
            return null;
        }
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
