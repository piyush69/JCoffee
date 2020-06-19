
import java.io.UncheckedIOException;


class c14473711 {
public static MyHelperClass byte2hex(byte[] o0){ return null; }
//public MyHelperClass byte2hex(byte[] o0){ return null; }

    public static String str2md5(String str) {
        try {
            MyHelperClass MESSAGE_DIGEST_TYPE = new MyHelperClass();
            MessageDigest alga =(MessageDigest)(Object) MessageDigest.getInstance(MESSAGE_DIGEST_TYPE);
            alga.update(str.getBytes());
            byte[] digesta =(byte[])(Object) alga.digest();
            return(String)(Object) byte2hex(digesta);
        } catch (UncheckedIOException ex) {
            return str;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
