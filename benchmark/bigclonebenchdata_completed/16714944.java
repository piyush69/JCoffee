import java.io.*;
import java.lang.*;
import java.util.*;



class c16714944 {
public static MyHelperClass ALGORITHM;
	public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass ALGORITHM;
//	public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String MD5(String text) throws ProducteevSignatureException {
        try {
            MessageDigest md;
            MyHelperClass ALGORITHM = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(ALGORITHM);
            byte[] md5hash;
            md.update(text.getBytes("utf-8"), 0, text.length());
            md5hash =(byte[])(Object) md.digest();
            return(String)(Object) convertToHex(md5hash);
        } catch (UncheckedIOException nsae) {
            throw new ProducteevSignatureException("No such algorithm : " + ALGORITHM,(UnsupportedEncodingException)(Object) nsae);
        } catch (UnsupportedEncodingException e) {
            throw new ProducteevSignatureException("No such algorithm : " + ALGORITHM, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ProducteevSignatureException extends Exception{
	public ProducteevSignatureException(String errorMessage) { super(errorMessage); }
	ProducteevSignatureException(String o0, UnsupportedEncodingException o1){}
	ProducteevSignatureException(){}
	ProducteevSignatureException(String o0, NoSuchAlgorithmException o1){}
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
