import java.io.*;
import java.lang.*;
import java.util.*;



class c1042184 {

    public static String scramble(String text) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("UTF-8"));
            StringBuffer sb = new StringBuffer();
            for (byte b :(byte[])(Object) (Object[])(Object)md.digest()) sb.append(Integer.toString(b & 0xFF, 16));
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (UncheckedIOException e) {
            return null;
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
