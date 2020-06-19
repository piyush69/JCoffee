import java.io.*;
import java.lang.*;
import java.util.*;



class c11270196 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static String encipherAMessage(String message) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha1 =(MessageDigest)(Object) MessageDigest.getInstance(java.util.ResourceBundle.getBundle("com/jjcp/resources/Strings").getString("SHA1"));
            sha1.update(message.getBytes(java.util.ResourceBundle.getBundle("com/jjcp/resources/Strings").getString("UTF-16LE")));
            byte[] digest =(byte[])(Object) sha1.digest();
            BASE64Encoder base64encoder = new BASE64Encoder();
            String cipherTextB64 =(String)(Object) base64encoder.encode(digest);
            return cipherTextB64;
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(SelectorView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(SelectorView.class.getName()).log(Level.SEVERE,(Object)(Object) null,(NoSuchAlgorithmException)(Object) ex);
        }
        return "";
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

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class SelectorView {

}
