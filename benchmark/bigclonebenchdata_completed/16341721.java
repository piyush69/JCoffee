import java.io.*;
import java.lang.*;
import java.util.*;



class c16341721 {
public MyHelperClass Logger;

    public boolean isPasswordCorrect(String attempt) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(attempt);
            MyHelperClass salt = new MyHelperClass();
            digest.update(salt);
            digest.update(attempt.getBytes("UTF-8"));
            byte[] attemptHash =(byte[])(Object) digest.digest();
            MyHelperClass hash = new MyHelperClass();
            return attemptHash.equals(hash);
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(UserRecord.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(UserRecord.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UserRecord {

}
