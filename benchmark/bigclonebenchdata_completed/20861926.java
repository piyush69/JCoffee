
import java.io.UncheckedIOException;


class c20861926 {
public static MyHelperClass LOG;
//public MyHelperClass LOG;

    public static String getMd5Password(final String password) {
        String response = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(password.getBytes());
            final byte[] md5Byte =(byte[])(Object) algorithm.digest();
            final StringBuffer buffer = new StringBuffer();
            for (final byte b : md5Byte) {
                if ((b <= 15) && (b >= 0)) {
                    buffer.append("0");
                }
                buffer.append(Integer.toHexString(0xFF & b));
            }
            response = buffer.toString();
        } catch (final UncheckedIOException e) {
            LOG.error("No digester MD5 found in classpath!",(NoSuchAlgorithmException)(Object) e);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
