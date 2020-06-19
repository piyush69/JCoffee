
import java.io.UncheckedIOException;


class c8416636 {

    private static byte[] Md5f(String plainText) {
        byte[] ab = new byte[16];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] =(byte[])(Object) md.digest();
            ab = b;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return ab;
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
