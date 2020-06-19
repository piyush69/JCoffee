
import java.io.UncheckedIOException;


class c17334846 {

    static String encodeEmailAsUserId(String email) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(email.toLowerCase().getBytes());
            StringBuilder builder = new StringBuilder();
            builder.append("1");
            for (byte b :(byte[])(Object) (Object[])(Object)md5.digest()) {
                builder.append(String.format("%02d", new Object[] { Integer.valueOf(b & 0xFF) }));
            }
            return builder.toString().substring(0, 20);
        } catch (UncheckedIOException ex) {
        }
        return "";
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
