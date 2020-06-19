import java.io.*;
import java.lang.*;
import java.util.*;



class c7574033 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String generateHashSE(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException, DigestException {
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        byte[] hashSHA256 = new byte[32];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md.digest(hashSHA256, 0, text.length());
        return(String)(Object) convertToHex(hashSHA256);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class DigestException extends Exception{
	public DigestException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
