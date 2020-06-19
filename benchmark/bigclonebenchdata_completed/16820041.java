import java.io.*;
import java.lang.*;
import java.util.*;



class c16820041 {

    public static String encodePassword(String _originalPassword) {
        MessageDigest md = null;
        String encodedPassword = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update(_originalPassword.getBytes("UTF-8"));
            encodedPassword =(String)(Object) (new BASE64Encoder()).encode(md.digest());
        } catch (UncheckedIOException _e) {
            _e.printStackTrace();
        } catch (UnsupportedEncodingException _e) {
            _e.printStackTrace();
        }
        return encodedPassword;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
