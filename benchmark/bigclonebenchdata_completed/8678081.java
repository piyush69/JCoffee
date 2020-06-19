
import java.io.UncheckedIOException;


class c8678081 {

    public static String encrypt(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            digest.update(password.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return(String)(Object) encoder.encode(digest.digest());
        } catch (UncheckedIOException ns) {
            ns.printStackTrace();
            return password;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
