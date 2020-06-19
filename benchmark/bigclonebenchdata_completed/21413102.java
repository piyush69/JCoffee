import java.io.*;
import java.lang.*;
import java.util.*;



class c21413102 {

    private static byte[] getHashBytes(String data, String algorithm) {
        MessageDigest md;
        byte[] digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            md.update(data.getBytes("UTF-8"), 0, data.length());
            digest =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
        } catch (UnsupportedEncodingException e) {
        }
        return digest;
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
