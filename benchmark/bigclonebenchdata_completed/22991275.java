
import java.io.UncheckedIOException;


class c22991275 {
public static MyHelperClass hashToHex(byte[] o0){ return null; }
//public MyHelperClass hashToHex(byte[] o0){ return null; }

    public static final String encryptMD5(String decrypted) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(decrypted.getBytes());
            byte hash[] =(byte[])(Object) md5.digest();
            md5.reset();
            return(String)(Object) hashToHex(hash);
        } catch (UncheckedIOException _ex) {
            return null;
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
