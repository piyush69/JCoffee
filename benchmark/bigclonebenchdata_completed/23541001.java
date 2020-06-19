import java.io.*;
import java.lang.*;
import java.util.*;



class c23541001 {

    public static String encodePassword(String password, byte[] seed) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (seed == null) {
            seed = new byte[12];
            MyHelperClass secureRandom = new MyHelperClass();
            secureRandom.nextBytes(seed);
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(seed);
        md.update(password.getBytes("UTF8"));
        byte[] digest =(byte[])(Object) md.digest();
        byte[] storedPassword = new byte[digest.length + 12];
        System.arraycopy(seed, 0, storedPassword, 0, 12);
        System.arraycopy(digest, 0, storedPassword, 12, digest.length);
        return new sun.misc.BASE64Encoder().encode(storedPassword);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextBytes(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
