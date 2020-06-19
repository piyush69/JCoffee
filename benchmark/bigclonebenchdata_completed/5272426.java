
import java.io.UncheckedIOException;


class c5272426 {
public static MyHelperClass encodeHex(MyHelperClass o0){ return null; }
//public MyHelperClass encodeHex(MyHelperClass o0){ return null; }

    public static final String hash(String data) {
        MessageDigest digest = null;
        if (digest == null) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException nsae) {
                System.err.println("Failed to load the MD5 MessageDigest. " + "Jive will be unable to function normally.");
                nsae.printStackTrace();
            }
        }
        digest.update(data.getBytes());
        return(String)(Object) encodeHex(digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
