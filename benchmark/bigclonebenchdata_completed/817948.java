
import java.io.UncheckedIOException;


class c817948 {
public MyHelperClass Base64;

    private boolean keysMatch(String keyNMinusOne, String keyN) {
        boolean match = false;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(keyNMinusOne.getBytes());
            byte[] hashedBytes =(byte[])(Object) digest.digest();
            String encodedHashedKey = new String((String)(Object)Base64.encode(hashedBytes));
            match = encodedHashedKey.equals(keyN);
        } catch (UncheckedIOException e) {
        }
        return match;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
