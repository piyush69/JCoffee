
import java.io.UncheckedIOException;


class c9918989 {

    private byte[] hash(String data, HashAlg alg) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(alg.toString());
            digest.update(data.getBytes());
            byte[] hash =(byte[])(Object) digest.digest();
            return hash;
        } catch (UncheckedIOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class HashAlg {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
