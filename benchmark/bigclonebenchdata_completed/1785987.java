
import java.io.UncheckedIOException;


class c1785987 {

    public static String hashSourceCode(String source) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(source.getBytes());
            return new sun.misc.BASE64Encoder().encode((byte[])(Object)md.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass _log = new MyHelperClass();
            _log.error("Failed to generate hashcode.",(NoSuchAlgorithmException)(Object) e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
