import java.io.*;
import java.lang.*;
import java.util.*;



class c11018793 {

    public static boolean checkEncryptedPassword(String md5key, String passwordAccount, String encryptedPassword, int passwdenc) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass Constants = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(Constants.ALGORITHM);
        switch(passwdenc) {
            case 1:
                md.update((md5key + encryptedPassword).getBytes("8859_1"));
                return md.digest().equals(passwordAccount.getBytes("8859_1"));
            case 2:
                md.update((encryptedPassword + md5key).getBytes("8859_1"));
                return md.digest().equals(passwordAccount.getBytes("8859_1"));
            default:
                return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ALGORITHM;
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}
