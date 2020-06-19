
import java.io.UncheckedIOException;


class c18967837 {

    public static String encrypt(String text) {
        final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        String result = "";
        MessageDigest digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(text.getBytes());
            byte[] hash =(byte[])(Object) digest.digest();
            char buffer[] = new char[hash.length * 2];
            for (int i = 0, x = 0; i < hash.length; i++) {
                buffer[x++] = HEX_CHARS[(hash[i] >>> 4) & 0xf];
                buffer[x++] = HEX_CHARS[hash[i] & 0xf];
            }
            result = new String(buffer);
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

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
