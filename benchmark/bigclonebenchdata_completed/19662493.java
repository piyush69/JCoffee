
import java.io.UncheckedIOException;


class c19662493 {
public static MyHelperClass bytes2hexStr(byte[] o0){ return null; }
//public MyHelperClass bytes2hexStr(byte[] o0){ return null; }

    private static String md5Encode(String pass) {
        String string;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] result =(byte[])(Object) md.digest();
            string =(String)(Object) bytes2hexStr(result);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("La libreria java.security no implemente MD5");
        }
        return string;
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
