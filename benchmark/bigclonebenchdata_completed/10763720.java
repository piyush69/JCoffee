import java.io.*;
import java.lang.*;
import java.util.*;



class c10763720 {

    public String plainStringToMD5(String input) {
        MessageDigest md = null;
        byte[] byteHash = null;
        StringBuffer resultString = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.throwing(getClass().getName(), "plainStringToMD5",(NoSuchAlgorithmException)(Object) e);
        }
        md.reset();
        try {
            md.update(input.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
        }
        byteHash =(byte[])(Object) md.digest();
        for (int i = 0; i < byteHash.length; i++) {
            resultString.append(Integer.toHexString(0xF0 & byteHash[i]).charAt(0));
            resultString.append(Integer.toHexString(0x0F & byteHash[i]));
        }
        return (resultString.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass throwing(String o0, String o1, NoSuchAlgorithmException o2){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
