
import java.io.UncheckedIOException;


class c6050588 {

    public static String getKeyWithRightLength(final String key, int keyLength) {
        if (keyLength > 0) {
            if (key.length() == keyLength) {
                return key;
            } else {
                MessageDigest md = null;
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
                } catch (UncheckedIOException e) {
                    return "";
                }
                md.update(key.getBytes());
                byte[] hash =(byte[])(Object) md.digest();
                if (keyLength > 20) {
                    byte nhash[] = new byte[keyLength];
                    for (int i = 0; i < keyLength; i++) {
                        nhash[i] = hash[i % 20];
                    }
                    hash = nhash;
                }
                return new String(hash).substring(0, keyLength);
            }
        } else {
            return key;
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
