
import java.io.UncheckedIOException;


class c12264242 {

    public static String generateSHA1(final String data) {
        final StringBuilder hash = new StringBuilder(40);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest sha1 =(MessageDigest)(Object) MessageDigest.getInstance("sha1");
            sha1.update(data.getBytes());
            final byte[] digest =(byte[])(Object) sha1.digest();
            for (byte aDigest : digest) {
                String hex = Integer.toHexString(aDigest);
                if (hex.length() == 1) {
                    hex = "0" + hex;
                }
                hex = hex.substring(hex.length() - 2);
                hash.append(hex);
            }
        } catch (UncheckedIOException e) {
        }
        return hash.toString();
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
