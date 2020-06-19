
import java.io.UncheckedIOException;


class c16301846 {

    public static String getMd5Digest(String pInput) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest lDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            lDigest.update(pInput.getBytes());
            BigInteger lHashInt = new BigInteger(1, lDigest.digest());
            return String.format("%1$032x", lHashInt).toLowerCase();
        } catch (UncheckedIOException lException) {
            throw new RuntimeException(lException);
        }
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
