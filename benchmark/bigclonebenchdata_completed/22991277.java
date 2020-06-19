
import java.io.UncheckedIOException;


class c22991277 {
public static MyHelperClass hashToHex(byte[] o0){ return null; }
//public MyHelperClass hashToHex(byte[] o0){ return null; }

    public static final String encryptSHA(String decrypted) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            sha.reset();
            sha.update(decrypted.getBytes());
            byte hash[] =(byte[])(Object) sha.digest();
            sha.reset();
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
