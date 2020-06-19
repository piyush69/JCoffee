import java.io.*;
import java.lang.*;
import java.util.*;



class c9766291 {

    public static String getHash(String password, String salt) {
        try {
            MessageDigest messageDigest = null;
            MyHelperClass SHA_512 = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance(SHA_512);
            messageDigest.reset();
            messageDigest.update(salt.getBytes("UTF-8"));
            messageDigest.update(password.getBytes("UTF-8"));
            byte[] input =(byte[])(Object) messageDigest.digest();
            for (int i = 0; i < 1000; i++) {
                messageDigest.reset();
                input =(byte[])(Object) messageDigest.digest(input);
            }
            Formatter formatter = new Formatter();
            for (byte i : input) {
                formatter.format("%02x", i);
            }
            return formatter.toString();
        } catch (UncheckedIOException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
