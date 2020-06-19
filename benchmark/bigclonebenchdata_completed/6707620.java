import java.io.*;
import java.lang.*;
import java.util.*;



class c6707620 {

    private static String getHash(String hash, String clear) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(hash);
            md.update(clear.getBytes("UTF-8"));
            byte[] bytes =(byte[])(Object) md.digest();
            String str = new String();
            for (int i = 0; i < bytes.length; ++i) str += Integer.toHexString(0xF0 & bytes[i]).charAt(0) + Integer.toHexString(0x0F & bytes[i]);
            return str;
        } catch (UncheckedIOException exc) {
        } catch (UnsupportedEncodingException exc) {
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
