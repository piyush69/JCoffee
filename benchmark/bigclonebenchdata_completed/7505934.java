
import java.io.UncheckedIOException;


class c7505934 {

    public static byte[] generateAuthId(String userName, String password) {
        byte[] ret = new byte[16];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            String str = userName + password;
            messageDigest.update(str.getBytes());
            ret =(byte[])(Object) messageDigest.digest();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
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
