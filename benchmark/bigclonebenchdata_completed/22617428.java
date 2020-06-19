
import java.io.UncheckedIOException;


class c22617428 {
public static MyHelperClass toHexString(byte[] o0, int o1, int o2){ return null; }
//public MyHelperClass toHexString(byte[] o0, int o1, int o2){ return null; }

    public static String digestString(String data) {
        String result = null;
        if (data != null) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest _md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                _md.update(data.getBytes());
                byte[] _digest =(byte[])(Object) _md.digest();
                String _ds =(String)(Object) toHexString(_digest, 0, _digest.length);
                result = _ds;
            } catch (UncheckedIOException e) {
                result = null;
            }
        }
        return result;
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
