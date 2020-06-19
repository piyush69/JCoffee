import java.io.*;
import java.lang.*;
import java.util.*;



class c11261168 {
public static MyHelperClass asHex(MyHelperClass o0){ return null; }
//public MyHelperClass asHex(MyHelperClass o0){ return null; }

    public static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass MessageDigest = new MyHelperClass();
        final MessageDigest digester =(MessageDigest)(Object) MessageDigest.getInstance("sha-256");
        digester.reset();
        digester.update("Carmen Sandiago".getBytes());
        return(String)(Object) asHex(digester.digest(password.getBytes("UTF-8")));
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
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}
