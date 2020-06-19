
import java.io.UncheckedIOException;


class c6032985 {

    private byte[] md5Digest(String pPassword) {
        if (pPassword == null) {
            throw new NullPointerException("input null text for hashing");
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(pPassword.getBytes());
            return(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Cannot find MD5 algorithm");
        }
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
