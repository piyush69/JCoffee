import java.io.*;
import java.lang.*;
import java.util.*;



class c5537139 {

    public static String getDigest(String seed, byte[] code) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(seed.getBytes("UTF-8"));
            byte[] passwordMD5Byte =(byte[])(Object) md.digest(code);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < passwordMD5Byte.length; i++) sb.append(Integer.toHexString(passwordMD5Byte[i] & 0XFF));
            return sb.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass log = new MyHelperClass();
            log.error((NoSuchAlgorithmException)(Object)e);
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            MyHelperClass log = new MyHelperClass();
            log.error(e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(NoSuchAlgorithmException o0){ return null; }
	public MyHelperClass error(UnsupportedEncodingException o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
