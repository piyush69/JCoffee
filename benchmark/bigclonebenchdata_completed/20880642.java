import java.io.*;
import java.lang.*;
import java.util.*;



class c20880642 {

    public static String getHash(String password, String salt) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Entering getHash with password = " + password + "\n and salt = " + salt);
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-512");
        digest.reset();
        digest.update(salt.getBytes());
        byte[] input =(byte[])(Object) digest.digest(password.getBytes("UTF-8"));
        String hashResult = String.valueOf(input);
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("Exiting getHash with hasResult of " + hashResult);
        return hashResult;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}
