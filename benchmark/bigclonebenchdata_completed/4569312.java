
import java.io.UncheckedIOException;


class c4569312 {

    public static String getMD5(String s) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(s.toLowerCase().getBytes());
            MyHelperClass HexString = new MyHelperClass();
            return(String)(Object) HexString.bufferToHex(md5.digest());
        } catch (UncheckedIOException e) {
            System.err.println("Error grave al inicializar MD5");
            e.printStackTrace();
            return "!!";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass bufferToHex(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
