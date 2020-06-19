import java.io.*;
import java.lang.*;
import java.util.*;



class c17391463 {

    public String hash(String plaintext, String salt, int iterations) throws EncryptionException {
        byte[] bytes = null;
        try {
            MyHelperClass hashAlgorithm = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(hashAlgorithm);
            digest.reset();
            MyHelperClass ESAPI = new MyHelperClass();
            digest.update((byte[])(Object)ESAPI.securityConfiguration().getMasterSalt());
            MyHelperClass encoding = new MyHelperClass();
            digest.update(salt.getBytes((String)(Object)encoding));
//            MyHelperClass encoding = new MyHelperClass();
            digest.update(plaintext.getBytes((String)(Object)encoding));
            bytes =(byte[])(Object) digest.digest();
            for (int i = 0; i < iterations; i++) {
                digest.reset();
                bytes =(byte[])(Object) digest.digest(bytes);
            }
//            MyHelperClass ESAPI = new MyHelperClass();
            String encoded =(String)(Object) ESAPI.encoder().encodeForBase64(bytes, false);
            return encoded;
        } catch (UncheckedIOException e) {
            MyHelperClass hashAlgorithm = new MyHelperClass();
            throw new EncryptionException("Internal error", "Can't find hash algorithm " + hashAlgorithm,(NoSuchAlgorithmException)(Object) e);
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass encoding = new MyHelperClass();
            throw new EncryptionException("Internal error", "Can't find encoding for " + encoding, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMasterSalt(){ return null; }
	public MyHelperClass encodeForBase64(byte[] o0, boolean o1){ return null; }
	public MyHelperClass encoder(){ return null; }
	public MyHelperClass securityConfiguration(){ return null; }}

class EncryptionException extends Exception{
	public EncryptionException(String errorMessage) { super(errorMessage); }
	EncryptionException(String o0, String o1, NoSuchAlgorithmException o2){}
	EncryptionException(){}
	EncryptionException(String o0, String o1, UnsupportedEncodingException o2){}
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
