import java.io.*;
import java.lang.*;
import java.util.*;



class c5551857 {
public static MyHelperClass hex(MyHelperClass o0){ return null; }
//public MyHelperClass hex(MyHelperClass o0){ return null; }

    public static String sha1(String src) {
        MessageDigest md1 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md1 =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            md1.update(src.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return(String)(Object) hex(md1.digest());
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
