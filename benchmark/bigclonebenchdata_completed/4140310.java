import java.io.*;
import java.lang.*;
import java.util.*;



class c4140310 {

    public boolean verify(final char[] password, final String encryptedPassword) {
        MessageDigest digest = null;
        int size = 0;
        String base64 = null;
        if (encryptedPassword.regionMatches(true, 0, "{SHA}", 0, 5)) {
            size = 20;
            base64 = encryptedPassword.substring(5);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (final UncheckedIOException e) {
                throw new IllegalStateException("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{SSHA}", 0, 6)) {
            size = 20;
            base64 = encryptedPassword.substring(6);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (final UncheckedIOException e) {
                throw new IllegalStateException("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{MD5}", 0, 5)) {
            size = 16;
            base64 = encryptedPassword.substring(5);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (final UncheckedIOException e) {
                throw new IllegalStateException("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{SMD5}", 0, 6)) {
            size = 16;
            base64 = encryptedPassword.substring(6);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (final UncheckedIOException e) {
                throw new IllegalStateException("Invalid algorithm");
            }
        } else {
            return false;
        }
        try {
            final byte[] data =(byte[])(Object) Base64.decodeBase64(base64.getBytes("UTF-8"));
            final byte[] orig = new byte[size];
            System.arraycopy(data, 0, orig, 0, size);
            digest.reset();
            digest.update(new String(password).getBytes("UTF-8"));
            if (data.length > size) {
                digest.update(data, size, data.length - size);
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            return(boolean)(Object) MessageDigest.isEqual(digest.digest(), orig);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 Unsupported");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEqual(MyHelperClass o0, byte[] o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public static MyHelperClass decodeBase64(byte[] o0){ return null; }}
