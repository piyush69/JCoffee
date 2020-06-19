
import java.io.UncheckedIOException;


class c8320469 {
public static MyHelperClass hex(MyHelperClass o0){ return null; }
//public MyHelperClass hex(MyHelperClass o0){ return null; }

    public static String md5(String text) {
        String encrypted = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            encrypted =(String)(Object) hex(md.digest());
        } catch (UncheckedIOException nsaEx) {
        }
        return encrypted;
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
