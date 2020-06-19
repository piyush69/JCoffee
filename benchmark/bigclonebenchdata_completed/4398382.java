import java.io.*;
import java.lang.*;
import java.util.*;



class c4398382 {

    public static String digest(String algorithm, String text) {
        MessageDigest mDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            mDigest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            MyHelperClass ENCODING = new MyHelperClass();
            mDigest.update(text.getBytes((String)(Object)ENCODING));
        } catch (UncheckedIOException nsae) {
            MyHelperClass _log = new MyHelperClass();
            _log.error((UnsupportedEncodingException)(Object)nsae,(UnsupportedEncodingException)(Object) nsae);
        } catch (UnsupportedEncodingException uee) {
            MyHelperClass _log = new MyHelperClass();
            _log.error(uee, uee);
        }
        byte[] raw =(byte[])(Object) mDigest.digest();
        BASE64Encoder encoder = new BASE64Encoder();
        return(String)(Object) encoder.encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(UnsupportedEncodingException o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(NoSuchAlgorithmException o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
