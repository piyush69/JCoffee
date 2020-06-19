
import java.io.UncheckedIOException;


class c22530929 {
public static MyHelperClass bytes2hexStr(byte[] o0){ return null; }
//public MyHelperClass bytes2hexStr(byte[] o0){ return null; }

    public static String md5Encode(String pass) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] result =(byte[])(Object) md.digest();
            return(String)(Object) bytes2hexStr(result);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("La librería java.security no implemente MD5");
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
