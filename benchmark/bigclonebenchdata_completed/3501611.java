import java.io.*;
import java.lang.*;
import java.util.*;



class c3501611 {
public MyHelperClass convertToHex(byte[] o0){ return null; }

    char[] DigestCalcHA1(String algorithm, String userName, String realm, String password, String nonce, String clientNonce) throws SaslException {
        byte[] hash;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(userName.getBytes("UTF-8"));
            md.update(":".getBytes("UTF-8"));
            md.update(realm.getBytes("UTF-8"));
            md.update(":".getBytes("UTF-8"));
            md.update(password.getBytes("UTF-8"));
            hash =(byte[])(Object) md.digest();
            if ("md5-sess".equals(algorithm)) {
                md.update(hash);
                md.update(":".getBytes("UTF-8"));
                md.update(nonce.getBytes("UTF-8"));
                md.update(":".getBytes("UTF-8"));
                md.update(clientNonce.getBytes("UTF-8"));
                hash =(byte[])(Object) md.digest();
            }
        } catch (UncheckedIOException e) {
            throw new SaslException("No provider found for MD5 hash",(NoSuchAlgorithmException)(Object) e);
        } catch (UnsupportedEncodingException e) {
            throw new SaslException("UTF-8 encoding not supported by platform.", e);
        }
        return(char[])(Object) convertToHex(hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class SaslException extends Exception{
	public SaslException(String errorMessage) { super(errorMessage); }
	SaslException(String o0, NoSuchAlgorithmException o1){}
	SaslException(String o0, UnsupportedEncodingException o1){}
	SaslException(){}
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
