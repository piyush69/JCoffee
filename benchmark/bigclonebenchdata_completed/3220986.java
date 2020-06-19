
import java.io.UncheckedIOException;


class c3220986 {
public static MyHelperClass byteToBase64(MyHelperClass o0){ return null; }
//public MyHelperClass byteToBase64(MyHelperClass o0){ return null; }

    public static String calculateHash(String password) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.reset();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        md.update(password.getBytes());
        return(String)(Object) byteToBase64(md.digest());
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
