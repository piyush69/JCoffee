
import java.io.UncheckedIOException;


class c12174403 {

    public static String encryptPass2(String pass) throws UnsupportedEncodingException {
        String passEncrypt;
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException ex) {
        }
        md5.update(pass.getBytes());
        String dis = new String((byte[])(Object)md5.digest(), 10);
        passEncrypt = dis.toString();
        return passEncrypt;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
