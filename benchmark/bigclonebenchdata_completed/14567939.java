
import java.io.UncheckedIOException;


class c14567939 {
public static MyHelperClass d(String o0){ return null; }
//public MyHelperClass d(String o0){ return null; }

    private static byte[] baseHash(String name, String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.reset();
            digest.update(name.toLowerCase().getBytes());
            digest.update(password.getBytes());
            return(byte[])(Object) digest.digest();
        } catch (UncheckedIOException ex) {
            d("MD5 algorithm not found!");
            throw new RuntimeException("MD5 algorithm not found! Unable to authenticate");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
