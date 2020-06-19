
import java.io.UncheckedIOException;


class c12760982 {

    public static String MD5Encode(String password) {
        MessageDigest messageDigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            final byte[] digest =(byte[])(Object) messageDigest.digest();
            final StringBuilder buf = new StringBuilder(digest.length * 2);
            final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
            for (int j = 0; j < digest.length; j++) {
                buf.append(HEX_DIGITS[(digest[j] >> 4) & 0x0f]);
                buf.append(HEX_DIGITS[digest[j] & 0x0f]);
            }
            return buf.toString();
        } catch (UncheckedIOException e) {
            return password;
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
