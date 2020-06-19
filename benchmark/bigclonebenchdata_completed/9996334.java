
import java.io.UncheckedIOException;


class c9996334 {
public MyHelperClass toHex(byte[] o0){ return null; }

    public String generateToken(String code) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            md.update(code.getBytes());
            byte[] bytes =(byte[])(Object) md.digest();
            return(String)(Object) toHex(bytes);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("SHA1 missing");
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
