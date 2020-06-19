
import java.io.UncheckedIOException;


class c22082121 {
public static MyHelperClass bytesToHexString(byte[] o0){ return null; }
//public MyHelperClass bytesToHexString(byte[] o0){ return null; }

    public static String digestMd5(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("文字列がNull、または空です。");
        }
        MessageDigest md5;
        byte[] enclyptedHash;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            enclyptedHash =(byte[])(Object) md5.digest();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            return "";
        }
        return(String)(Object) bytesToHexString(enclyptedHash);
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
