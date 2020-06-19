import java.io.*;
import java.lang.*;
import java.util.*;



class c21902615 {

    public static String encrypt(String plaintext) throws EncryptionException {
        if (plaintext == null) {
            throw new EncryptionException();
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(plaintext.getBytes("UTF-8"));
            return(String)(Object) Base64.encodeBytes(md.digest());
        } catch (UncheckedIOException e) {
            throw new EncryptionException((String)(Object)e);
        } catch (UnsupportedEncodingException e) {
            throw new EncryptionException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class EncryptionException extends Exception{
	public EncryptionException(String errorMessage) { super(errorMessage); }
	EncryptionException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass encodeBytes(MyHelperClass o0){ return null; }}
