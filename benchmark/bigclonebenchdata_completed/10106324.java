
import java.io.UncheckedIOException;


class c10106324 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public static String md5Encode(String s) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            return(String)(Object) toHexString(md.digest());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return s;
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
