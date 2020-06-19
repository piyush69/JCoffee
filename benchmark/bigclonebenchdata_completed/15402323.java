
import java.io.UncheckedIOException;


class c15402323 {

    public static String getMd5Hash(String text) {
        StringBuffer result = new StringBuffer(32);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(text.getBytes());
            Formatter f = new Formatter(result);
            byte[] digest =(byte[])(Object) md5.digest();
            for (int i = 0; i < digest.length; i++) {
                f.format("%02x", new Object[] { new Byte(digest[i]) });
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
	public MyHelperClass format(String o0, Object[] o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
