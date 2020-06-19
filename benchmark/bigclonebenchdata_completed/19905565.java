import java.io.*;
import java.lang.*;
import java.util.*;



class c19905565 {

    public static String sha1(String in) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        byte[] data = new byte[40];
        try {
            md.update(in.getBytes("iso-8859-1"), 0, in.length());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        data =(byte[])(Object) md.digest();
        MyHelperClass HexidecimalUtilities = new MyHelperClass();
        return(String)(Object) HexidecimalUtilities.convertFromByteArrayToHex(data);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass convertFromByteArrayToHex(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
