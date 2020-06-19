
import java.io.UncheckedIOException;


class c18631594 {

    public static synchronized String getMD5_Base64(String input) {
        MessageDigest msgDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new IllegalStateException("System doesn't support MD5 algorithm.");
        }
        try {
            msgDigest.update(input.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException ex) {
            throw new IllegalStateException("System doesn't support your  EncodingException.");
        }
        byte[] rawData =(byte[])(Object) msgDigest.digest();
        MyHelperClass Base64 = new MyHelperClass();
        byte[] encoded =(byte[])(Object) Base64.encode(rawData);
        String retValue = new String(encoded);
        return retValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
