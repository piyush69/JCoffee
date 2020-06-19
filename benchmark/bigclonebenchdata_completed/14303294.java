import java.io.*;
import java.lang.*;
import java.util.*;



class c14303294 {
public MyHelperClass bytesToHex(byte[] o0){ return null; }

    public String getServerHash(String passwordHash, String PasswordSalt) throws PasswordHashingException {
        byte[] hash;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(PasswordSalt.getBytes("UTF-16"));
            hash =(byte[])(Object) digest.digest(passwordHash.getBytes("UTF-16"));
            return(String)(Object) bytesToHex(hash);
        } catch (UncheckedIOException ex) {
            throw new PasswordHashingException("Current environment does not supply needed security algorithms. Please update Java");
        } catch (UnsupportedEncodingException ex) {
            throw new PasswordHashingException("Current environment does not supply needed character encoding. Please update Java");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class PasswordHashingException extends Exception{
	public PasswordHashingException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
