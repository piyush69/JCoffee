
import java.io.UncheckedIOException;


class c2453715 {

    public String digestPassword(String password) {
        StringBuffer hexString = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(password.getBytes());
            byte[] messageDigest =(byte[])(Object) algorithm.digest();
            for (byte b : messageDigest) {
                hexString.append(Integer.toHexString(0xFF & b));
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
