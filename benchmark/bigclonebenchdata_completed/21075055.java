import java.io.*;
import java.lang.*;
import java.util.*;



class c21075055 {

    public String digest(String algorithm, String text) {
        MessageDigest digester = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digester =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            MyHelperClass Digester = new MyHelperClass();
            digester.update(text.getBytes((String)(Object)Digester.ENCODING));
        } catch (UncheckedIOException nsae) {
            MyHelperClass _log = new MyHelperClass();
            _log.error((UnsupportedEncodingException)(Object)nsae,(UnsupportedEncodingException)(Object) nsae);
        } catch (UnsupportedEncodingException uee) {
            MyHelperClass _log = new MyHelperClass();
            _log.error(uee, uee);
        }
        byte[] bytes =(byte[])(Object) digester.digest();
        MyHelperClass _BASE_64 = new MyHelperClass();
        if ((boolean)(Object)_BASE_64) {
            return(String)(Object) Base64.encode(bytes);
        } else {
            MyHelperClass Hex = new MyHelperClass();
            return new String((String)(Object)Hex.encodeHex(bytes));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCODING;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeHex(byte[] o0){ return null; }
	public MyHelperClass error(UnsupportedEncodingException o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass error(NoSuchAlgorithmException o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }}
