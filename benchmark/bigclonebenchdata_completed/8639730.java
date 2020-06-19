
import java.io.UncheckedIOException;


class c8639730 {
public static MyHelperClass dumpBytes(byte[] o0){ return null; }
//public MyHelperClass dumpBytes(byte[] o0){ return null; }

    public static String md5encrypt(String toEncrypt) {
        if (toEncrypt == null) {
            throw new IllegalArgumentException("null is not a valid password to encrypt");
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(toEncrypt.getBytes());
            byte[] hash =(byte[])(Object) md.digest();
            return new String((String)(Object)dumpBytes(hash));
        } catch (UncheckedIOException nsae) {
            return toEncrypt;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
