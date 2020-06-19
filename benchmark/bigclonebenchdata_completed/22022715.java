
import java.io.UncheckedIOException;


class c22022715 {

    protected static final byte[] digest(String s) {
        byte[] ret = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            ret =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            System.err.println("no message digest algorithm available!");
            System.exit(1);
        }
        return ret;
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
