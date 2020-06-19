
import java.io.UncheckedIOException;


class c4959517 {
public static MyHelperClass Base64;
//public MyHelperClass Base64;

    public static String openldapDigestMd5(final String password) {
        String base64;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            base64 =(String)(Object) Base64.encodeBytes(digest.digest());
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        MyHelperClass OPENLDAP_MD5_PREFIX = new MyHelperClass();
        return OPENLDAP_MD5_PREFIX + base64;
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
