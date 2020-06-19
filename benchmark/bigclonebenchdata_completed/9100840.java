
import java.io.UncheckedIOException;


class c9100840 {

    public static String encodeMD5(String value) {
        String result = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            BASE64Encoder encoder = new BASE64Encoder();
            md.update(value.getBytes());
            byte[] raw =(byte[])(Object) md.digest();
            result =(String)(Object) encoder.encode(raw);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
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

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
