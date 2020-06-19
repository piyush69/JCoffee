import java.io.*;
import java.lang.*;
import java.util.*;



class c7574034 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String generateHash(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException, DigestException {
        MessageDigest digest;
        MyHelperClass MessageDigest = new MyHelperClass();
        digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        digest.reset();
        digest.update(message.getBytes("iso-8859-1"), 0, message.length());
        byte[] output = new byte[20];
        digest.digest(output, 0, output.length);
        return(String)(Object) convertToHex(output);
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
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass reset(){ return null; }}
