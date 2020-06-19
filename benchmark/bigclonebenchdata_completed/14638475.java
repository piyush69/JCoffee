import java.io.*;
import java.lang.*;
import java.util.*;



class c14638475 {

    public static String md5String(String string) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            msgDigest.update(string.getBytes("UTF-8"));
            byte[] digest =(byte[])(Object) msgDigest.digest();
            String result = "";
            for (int i = 0; i < digest.length; i++) {
                int value = digest[i];
                if (value < 0) value += 256;
                result += Integer.toHexString(value);
            }
            return result;
        } catch (UnsupportedEncodingException error) {
            throw new IllegalArgumentException(error);
        } catch (UncheckedIOException error) {
            throw new IllegalArgumentException(error);
        }
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
