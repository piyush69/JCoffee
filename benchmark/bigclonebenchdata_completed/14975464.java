import java.io.*;
import java.lang.*;
import java.util.*;



class c14975464 {
public MyHelperClass byteToHex(byte[] o0){ return null; }

    public String SHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass SHA1 = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(SHA1);
        MyHelperClass CHAR_SET = new MyHelperClass();
        md.update(text.getBytes((String)(Object)CHAR_SET), 0, text.length());
        byte[] mdbytes =(byte[])(Object) md.digest();
        return(String)(Object) byteToHex(mdbytes);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
