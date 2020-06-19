import java.io.*;
import java.lang.*;
import java.util.*;



class c6095507 {

    private StringBuffer hashPassword(StringBuffer password, String mode) {
        MessageDigest m = null;
        StringBuffer hash = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            m =(MessageDigest)(Object) MessageDigest.getInstance(mode);
            m.update(password.toString().getBytes("UTF8"));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] digest =(byte[])(Object) m.digest();
        for (int i = 0; i < digest.length; i++) {
            String hex = Integer.toHexString(digest[i]);
            if (hex.length() == 1) hex = "0" + hex;
            hex = hex.substring(hex.length() - 2);
            hash.append(hex);
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
