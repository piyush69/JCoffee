import java.io.*;
import java.lang.*;
import java.util.*;



class c3134513 {
public static MyHelperClass SALT_LENGTH;
	public static MyHelperClass MessageDigest;
	public static MyHelperClass hexStringToByte(String o0){ return null; }
//public MyHelperClass SALT_LENGTH;
//	public MyHelperClass MessageDigest;
//	public MyHelperClass hexStringToByte(String o0){ return null; }

    public static boolean validPassword(String password, String passwordInDb) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] pwdInDb =(byte[])(Object) hexStringToByte(passwordInDb);
        byte[] salt = new byte[(int)(Object)SALT_LENGTH];
        System.arraycopy(pwdInDb, 0, salt, 0,(int)(Object) SALT_LENGTH);
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(salt);
        md.update(password.getBytes("UTF-8"));
        byte[] digest =(byte[])(Object) md.digest();
        byte[] digestInDb = new byte[pwdInDb.length - (int)(Object)SALT_LENGTH];
        System.arraycopy(pwdInDb,(int)(Object) SALT_LENGTH, digestInDb, 0, digestInDb.length);
        if (Arrays.equals(digest, digestInDb)) {
            return true;
        } else {
            return false;
        }
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
