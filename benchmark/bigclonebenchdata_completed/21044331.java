import java.io.*;
import java.lang.*;
import java.util.*;



class c21044331 {

    private static byte[] getKey(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MyHelperClass Constants = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance(Constants.HASH_FUNCTION);
//        MyHelperClass Constants = new MyHelperClass();
        messageDigest.update(password.getBytes((String)(Object)Constants.ENCODING));
        byte[] hashValue =(byte[])(Object) messageDigest.digest();
//        MyHelperClass Constants = new MyHelperClass();
        int keyLengthInbytes =(int)(Object) Constants.ENCRYPTION_KEY_LENGTH / 8;
        byte[] result = new byte[keyLengthInbytes];
        System.arraycopy(hashValue, 0, result, 0, keyLengthInbytes);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPTION_KEY_LENGTH;
	public MyHelperClass HASH_FUNCTION;
	public MyHelperClass ENCODING;
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}
