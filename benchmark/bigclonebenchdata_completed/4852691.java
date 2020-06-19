
import java.io.UncheckedIOException;


class c4852691 {
public static MyHelperClass toHex(MyHelperClass o0){ return null; }
public static MyHelperClass MessageDigest;
//	public MyHelperClass toHex(MyHelperClass o0){ return null; }
//public MyHelperClass MessageDigest;

    public static final synchronized String hash(String data) {
        MyHelperClass digest = new MyHelperClass();
        if (digest == null) {
            try {
//                MyHelperClass digest = new MyHelperClass();
                digest = MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException nsae) {
                System.err.println("Failed to load the MD5 MessageDigest. " + "Jive will be unable to function normally.");
                nsae.printStackTrace();
            }
        }
//        MyHelperClass digest = new MyHelperClass();
        digest.update(data.getBytes());
//        MyHelperClass digest = new MyHelperClass();
        return(String)(Object) toHex(digest.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
