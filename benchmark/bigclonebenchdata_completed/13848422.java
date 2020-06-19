
import java.io.UncheckedIOException;


class c13848422 {

    public static byte[] generatePasswordHash(String s) {
        byte[] password = { 00 };
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(s.getBytes());
            password =(byte[])(Object) md5.digest();
            return password;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return password;
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
