import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6753786 {

    public static String hash(String value)  throws Throwable {
        MessageDigest md = null;
        try {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            md = MessageDigest.getInstance((String)(Object)HASH_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException((String)(Object)e);
        }
        try {
            MyHelperClass INPUT_ENCODING = new MyHelperClass();
            md.update(value.getBytes((String)(Object)INPUT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            throw new CryptoException((String)(Object)e);
        }
        return (String)(Object)new BASE64Encoder().encode(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CryptoException extends Exception{
	public CryptoException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
