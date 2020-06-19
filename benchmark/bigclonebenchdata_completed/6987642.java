
import java.io.UncheckedIOException;


class c6987642 {

    public static String encodePassword(String password) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            String encodedPassword = new String((byte[])(Object)md.digest(),(int)(Object) new Base64Provider().charsetForName("x-base64"));
            return encodedPassword;
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64Provider {

public MyHelperClass charsetForName(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
