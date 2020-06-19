import java.io.*;
import java.lang.*;
import java.util.*;



class c4228617 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public static String createHash(String seed) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Can't happen!", e);
        }
        try {
            MyHelperClass CHARSET = new MyHelperClass();
            md.update(seed.getBytes((String)(Object)CHARSET));
//            MyHelperClass CHARSET = new MyHelperClass();
            md.update(String.valueOf(System.currentTimeMillis()).getBytes((String)(Object)CHARSET));
            return(String)(Object) toHexString(md.digest());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Can't happen!", e);
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
