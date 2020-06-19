import java.io.*;
import java.lang.*;
import java.util.*;



class c13031531 {
public MyHelperClass log;

    protected String getOldHash(String text) {
        String hash = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(text.getBytes("UTF-8"));
            byte[] digestedBytes =(byte[])(Object) md.digest();
            MyHelperClass HexUtils = new MyHelperClass();
            hash =(String)(Object) HexUtils.convert(digestedBytes);
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "Error creating SHA password hash:" + e.getMessage());
            hash = text;
        } catch (UnsupportedEncodingException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "UTF-8 not supported!?!");
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass convert(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
