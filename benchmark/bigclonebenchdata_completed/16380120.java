
import java.io.UncheckedIOException;


class c16380120 {
public MyHelperClass MessageDigest;
	public MyHelperClass get_algorithm_name(){ return null; }

//    @Override
    public String compute_hash(String plaintext) {
        MessageDigest d;
        try {
            d =(MessageDigest)(Object) MessageDigest.getInstance(get_algorithm_name());
            d.update(plaintext.getBytes());
            byte[] hash =(byte[])(Object) d.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : hash) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
