import java.io.*;
import java.lang.*;
import java.util.*;



class c21694489 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String mdFive(String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        byte[] array = new byte[32];
        md.update(string.getBytes("iso-8859-1"), 0, string.length());
        array =(byte[])(Object) md.digest();
        return(String)(Object) convertToHex(array);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}
