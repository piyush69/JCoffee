
import java.io.UncheckedIOException;


class c21032350 {

    public byte[] md5(String clearText) {
        MessageDigest md;
        byte[] digest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(clearText.getBytes());
            digest =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            throw new UnsupportedOperationException(e.toString());
        }
        return digest;
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
