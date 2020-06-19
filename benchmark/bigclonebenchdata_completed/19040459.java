
import java.io.UncheckedIOException;


class c19040459 {

    public static String getMD5(final String text) {
        if (null == text) return null;
        final MessageDigest algorithm;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        algorithm.reset();
        algorithm.update(text.getBytes());
        final byte[] digest =(byte[])(Object) algorithm.digest();
        final StringBuffer hexString = new StringBuffer();
        for (byte b : digest) {
            String str = Integer.toHexString(0xFF & b);
            str = str.length() == 1 ? '0' + str : str;
            hexString.append(str);
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
