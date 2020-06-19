
import java.io.UncheckedIOException;


class c22768445 {

    public static String hashNative(String password, String algorithm, String prefixKey, boolean useDefaultEncoding) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            if (useDefaultEncoding) {
                digest.update(password.getBytes());
            } else {
                for (char c : password.toCharArray()) {
                    digest.update((byte) (c >> 8));
                    digest.update((byte) c);
                }
            }
            byte[] digestedPassword =(byte[])(Object) digest.digest();
            BASE64Encoder encoder = new BASE64Encoder();
            String encodedDigested =(String)(Object) encoder.encode(digestedPassword);
            return prefixKey + encodedDigested;
        } catch (UncheckedIOException ne) {
            return password;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
