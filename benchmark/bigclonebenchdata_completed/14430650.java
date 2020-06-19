
import java.io.UncheckedIOException;


class c14430650 {

    private String computeHash(String str) {
        StringBuffer hexBuffer = new StringBuffer();
        byte[] bytes;
        int i;
        try {
            MyHelperClass hashAlgorithmName = new MyHelperClass();
            MessageDigest hashAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance(hashAlgorithmName);
            hashAlgorithm.reset();
            hashAlgorithm.update(str.getBytes());
            bytes =(byte[])(Object) hashAlgorithm.digest();
        } catch (UncheckedIOException e) {
            return null;
        }
        for (i = 0; i < bytes.length; i++) hexBuffer.append(((bytes[i] >= 0 && bytes[i] <= 15) ? "0" : "") + Integer.toHexString(bytes[i] & 0xFF));
        return hexBuffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
