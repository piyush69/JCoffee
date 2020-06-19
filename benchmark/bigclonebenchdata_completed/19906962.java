import java.io.*;
import java.lang.*;
import java.util.*;



class c19906962 {
public static MyHelperClass logger;
	public static MyHelperClass encrypt64(byte[] o0){ return null; }
//public MyHelperClass logger;
//	public MyHelperClass encrypt64(byte[] o0){ return null; }

    public static String encrypt(String unencryptedString) {
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isBlank(unencryptedString)) {
            throw new IllegalArgumentException("Cannot encrypt a null or empty string");
        }
        MessageDigest md = null;
        MyHelperClass Environment = new MyHelperClass();
        String encryptionAlgorithm =(String)(Object) Environment.getValue(Environment.PROP_ENCRYPTION_ALGORITHM);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(encryptionAlgorithm);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("JDK does not support the " + encryptionAlgorithm + " encryption algorithm.  Weaker encryption will be attempted.");
        }
        if (md == null) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (UncheckedIOException e) {
                throw new UnsupportedOperationException("JDK does not support the SHA-1 or SHA-512 encryption algorithms");
            }
//            MyHelperClass Environment = new MyHelperClass();
            Environment.setValue(Environment.PROP_ENCRYPTION_ALGORITHM, "SHA-1");
            try {
//                MyHelperClass Environment = new MyHelperClass();
                Environment.saveConfiguration();
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.info("Failure while saving encryption algorithm property",(WikiException)(Object) e);
            }
        }
        try {
            md.update(unencryptedString.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            return(String)(Object) encrypt64(raw);
        } catch (UncheckedIOException e) {
            logger.error("Encryption failure",(GeneralSecurityException)(Object) e);
            throw new IllegalStateException("Failure while encrypting value");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Unsupporting encoding UTF-8");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROP_ENCRYPTION_ALGORITHM;
public MyHelperClass setValue(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass info(String o0, WikiException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass saveConfiguration(){ return null; }
	public MyHelperClass error(String o0, GeneralSecurityException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass getValue(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class WikiException extends Exception{
	public WikiException(String errorMessage) { super(errorMessage); }
}

class GeneralSecurityException extends Exception{
	public GeneralSecurityException(String errorMessage) { super(errorMessage); }
}
