import java.io.*;
import java.lang.*;
import java.util.*;



class c14075761 {

    private static String md5(String digest, String data) throws IOException {
        MessageDigest messagedigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messagedigest =(MessageDigest)(Object) MessageDigest.getInstance(digest);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        messagedigest.update(data.getBytes("ISO-8859-1"));
        byte[] bytes =(byte[])(Object) messagedigest.digest();
        StringBuilder stringbuffer = new StringBuilder(bytes.length * 2);
        for (int j = 0; j < bytes.length; j++) {
            int k = bytes[j] >>> 4 & 0x0f;
MyHelperClass[] hexChars = new MyHelperClass[5];
            stringbuffer.append(hexChars[k]);
            k = bytes[j] & 0x0f;
//            MyHelperClass hexChars = new MyHelperClass();
            stringbuffer.append(hexChars[k]);
        }
        return stringbuffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] hexChars;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
