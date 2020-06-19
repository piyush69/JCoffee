
import java.io.UncheckedIOException;


class c14691829 {

    public static String getMD5Hash(String in) {
        StringBuffer result = new StringBuffer(32);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(in.getBytes());
            Formatter f = new Formatter(result);
            for (byte b :(byte[])(Object) (Object[])(Object)md5.digest()) {
                f.format("%02x", b);
            }
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Formatter {

Formatter(StringBuffer o0){}
	Formatter(){}
	public MyHelperClass format(String o0, byte o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
