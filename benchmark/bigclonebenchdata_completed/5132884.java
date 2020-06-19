
import java.io.UncheckedIOException;


class c5132884 {

    public byte[] encryptMsg(String encryptString) {
        byte[] encryptByte = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(encryptString.getBytes());
            encryptByte =(byte[])(Object) messageDigest.digest();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        return encryptByte;
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
