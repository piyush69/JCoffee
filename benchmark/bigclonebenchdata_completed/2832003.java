
import java.io.UncheckedIOException;


class c2832003 {

    public static String computeDigest(String str, String alg) {
        MessageDigest currentAlgorithm = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            currentAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance(alg);
        } catch (UncheckedIOException e) {
            return str;
        }
        currentAlgorithm.reset();
        currentAlgorithm.update(str.getBytes());
        byte[] hash =(byte[])(Object) currentAlgorithm.digest();
        String d = "";
        int usbyte = 0;
        for (int i = 0; i < hash.length; i++) {
            usbyte = hash[i] & 0xFF;
            if (usbyte < 16) d += "0" + Integer.toHexString(usbyte); else d += Integer.toHexString(usbyte);
        }
        return d.toUpperCase();
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
