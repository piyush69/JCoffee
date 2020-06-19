import java.io.*;
import java.lang.*;
import java.util.*;



class c12962189 {
public MyHelperClass Logger;

    private boolean verifyPassword(String password, byte[] hash) {
        boolean returnValue = false;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            msgDigest.update(password.getBytes("UTF-8"));
            byte[] digest =(byte[])(Object) msgDigest.digest();
            returnValue = Arrays.equals(hash, digest);
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AuthentificationState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AuthentificationState.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
        }
        return returnValue;
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
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class AuthentificationState {

}
