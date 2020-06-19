
import java.io.UncheckedIOException;


class c23668213 {
public static MyHelperClass hexValue(MyHelperClass o0){ return null; }
//public MyHelperClass hexValue(MyHelperClass o0){ return null; }

    public static String encryptPassword(String password) {
        if (password == null) return null;
        MessageDigest digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Algorithm not found",(NoSuchAlgorithmException)(Object) e);
            return null;
        }
        digest.reset();
        digest.update(password.getBytes());
        return(String)(Object) hexValue(digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
