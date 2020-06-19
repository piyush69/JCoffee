
import java.io.UncheckedIOException;


class c1415765 {
public static MyHelperClass toHexadecimal(byte[] o0){ return null; }
//public MyHelperClass toHexadecimal(byte[] o0){ return null; }

    public static String getMD5(String _pwd) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(_pwd.getBytes());
            return(String)(Object) toHexadecimal(new String((String)(Object)md.digest()).getBytes());
        } catch (UncheckedIOException x) {
            x.printStackTrace();
            return "";
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
