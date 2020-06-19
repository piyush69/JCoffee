import java.io.*;
import java.lang.*;
import java.util.*;



class c7330695 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    static final String md5(String text) throws RtmApiException {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            byte[] md5hash = new byte[32];
            md.update(text.getBytes("UTF-8"), 0, text.length());
            md5hash =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(md5hash);
        } catch (UncheckedIOException e) {
            throw new RtmApiException("Md5 error: NoSuchAlgorithmException - " + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new RtmApiException("Md5 error: UnsupportedEncodingException - " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class RtmApiException extends Exception{
	public RtmApiException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
