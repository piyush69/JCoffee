import java.io.*;
import java.lang.*;
import java.util.*;



class c20761751 {

    public static String encryptPassword(String password) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error((NoSuchAlgorithmException)(Object)e);
        }
        try {
            md.update(password.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e);
        }
        return(String)(Object) (new BASE64Encoder()).encode(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(NoSuchAlgorithmException o0){ return null; }
	public MyHelperClass error(UnsupportedEncodingException o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
