import java.io.*;
import java.lang.*;
import java.util.*;



class c15396083 {

    public static String digest(String algorithm, String text) {
        MessageDigest mDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            mDigest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            MyHelperClass ENCODING = new MyHelperClass();
            mDigest.update(text.getBytes((String)(Object)ENCODING));
        } catch (UncheckedIOException nsae) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.error(Encryptor.class, nsae.getMessage(),(NoSuchAlgorithmException)(Object) nsae);
        } catch (UnsupportedEncodingException uee) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.error(Encryptor.class, uee.getMessage(), uee);
        }
        byte raw[] =(byte[])(Object) mDigest.digest();
        return(String)(Object) (new BASE64Encoder()).encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Class<Encryptor> o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass error(Class<Encryptor> o0, String o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Encryptor {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
