import java.io.*;
import java.lang.*;
import java.util.*;



class c17190057 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    private static String encode(final String input) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.reset();
        md.update(input.getBytes("UTF-8"));
        return(String)(Object) toHexString(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}
