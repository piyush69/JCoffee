
import java.io.UncheckedIOException;


class c8143340 {
public static MyHelperClass encodeHex(MyHelperClass o0){ return null; }
//public MyHelperClass encodeHex(MyHelperClass o0){ return null; }

    private static String digest(String buffer) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(buffer.getBytes());
            MyHelperClass key = new MyHelperClass();
            return new String((String)(Object)encodeHex(md5.digest(key)));
        } catch (UncheckedIOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
