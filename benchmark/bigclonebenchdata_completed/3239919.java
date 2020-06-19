import java.io.*;
import java.lang.*;
import java.util.*;



class c3239919 {

    public static byte[] getHashedPassword(String password, byte[] randomBytes) {
        byte[] hashedPassword = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(randomBytes);
            messageDigest.update(password.getBytes("UTF-8"));
            hashedPassword =(byte[])(Object) messageDigest.digest();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
