import java.io.*;
import java.lang.*;
import java.util.*;



class c23541000 {

    public static boolean matchPassword(String prevPassStr, String newPassword) throws NoSuchAlgorithmException, java.io.IOException, java.io.UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        byte[] seed = new byte[12];
        byte[] prevPass = new sun.misc.BASE64Decoder().decodeBuffer(prevPassStr);
        System.arraycopy(prevPass, 0, seed, 0, 12);
        md.update(seed);
        md.update(newPassword.getBytes("UTF8"));
        byte[] digestNewPassword =(byte[])(Object) md.digest();
        byte[] choppedPrevPassword = new byte[prevPass.length - 12];
        System.arraycopy(prevPass, 12, choppedPrevPassword, 0, prevPass.length - 12);
        boolean isMatching = Arrays.equals(digestNewPassword, choppedPrevPassword);
        return isMatching;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
