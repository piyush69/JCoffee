import java.io.*;
import java.lang.*;
import java.util.*;



class c11018792 {

    public static String encryptePassword(String md5key, String passwordAccount, String encryptedPassword, int passwdenc) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MyHelperClass Constants = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(Constants.ALGORITHM);
        switch(passwdenc) {
            case 1:
                md.update((md5key + encryptedPassword).getBytes("8859_1"));
                break;
            case 2:
                md.update((encryptedPassword + md5key).getBytes("8859_1"));
                break;
            default:
                return null;
        }
        return new String((String)(Object)md.digest());
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
