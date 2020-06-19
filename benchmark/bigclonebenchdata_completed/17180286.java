import java.io.*;
import java.lang.*;
import java.util.*;



class c17180286 {

    public static String encodePassword(String plainTextPassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        StringBuffer sb = new StringBuffer();
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        messageDigest.update(plainTextPassword.getBytes("UTF-8"));
        byte[] digestBytes =(byte[])(Object) messageDigest.digest();
        String hex = null;
        for (int i = 0; i < digestBytes.length; i++) {
            hex = Integer.toHexString(0xFF & digestBytes[i]);
            if (hex.length() < 2) sb.append("0");
            sb.append(hex);
        }
        return new String(sb);
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
