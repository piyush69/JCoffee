
import java.io.UncheckedIOException;


class c22739188 {

    public static String getHash(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            digest.update(password.getBytes());
            return new String((String)(Object)digest.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Hashing algorithm not found");
            return password;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
