
import java.io.UncheckedIOException;


class c16164368 {

    public static String getHashedPassword(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            BigInteger hashedInt = new BigInteger(1, digest.digest());
            return String.format("%1$032X", hashedInt);
        } catch (UncheckedIOException nsae) {
            System.err.println(nsae.getMessage());
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BigInteger {

BigInteger(int o0, MyHelperClass o1){}
	BigInteger(){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
