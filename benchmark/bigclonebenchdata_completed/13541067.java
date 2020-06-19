
import java.io.UncheckedIOException;


class c13541067 {
public MyHelperClass Base64;

    private String digestMd5(final String password) {
        String base64;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            base64 =(String)(Object) Base64.encodeBytes(digest.digest());
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        return "{MD5}" + base64;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBytes(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
