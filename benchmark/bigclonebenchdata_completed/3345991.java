
import java.io.UncheckedIOException;


class c3345991 {
public MyHelperClass toHexString(MyHelperClass o0){ return null; }
public MyHelperClass error(String o0, String o1){ return null; }

    private String calculatePassword(String string) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            MyHelperClass nonce = new MyHelperClass();
            md5.update((byte[])(Object)nonce.getBytes());
            md5.update(string.getBytes());
            return(String)(Object) toHexString(md5.digest());
        } catch (UncheckedIOException e) {
            error("MD5 digest is no supported !!!", "ERROR");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
