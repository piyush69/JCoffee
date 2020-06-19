import java.io.*;
import java.lang.*;
import java.util.*;



class c7981028 {
public static MyHelperClass byteToHexString(byte[] o0){ return null; }
//public MyHelperClass byteToHexString(byte[] o0){ return null; }

    public static String getEncryptedPwd(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] pwd = null;
        SecureRandom random = new SecureRandom();
        MyHelperClass SALT_LENGTH = new MyHelperClass();
        byte[] salt = new byte[(int)(Object)SALT_LENGTH];
        random.nextBytes(salt);
        MessageDigest md = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(salt);
        md.update(password.getBytes("UTF-8"));
        byte[] digest =(byte[])(Object) md.digest();
//        MyHelperClass SALT_LENGTH = new MyHelperClass();
        pwd = new byte[digest.length + (int)(Object)SALT_LENGTH];
//        MyHelperClass SALT_LENGTH = new MyHelperClass();
        System.arraycopy(salt, 0, pwd, 0,(int)(Object) SALT_LENGTH);
//        MyHelperClass SALT_LENGTH = new MyHelperClass();
        System.arraycopy(digest, 0, pwd,(int)(Object) SALT_LENGTH, digest.length);
        return(String)(Object) byteToHexString(pwd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class SecureRandom {

public MyHelperClass nextBytes(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
