
import java.io.UncheckedIOException;


class c6405249 {

    public static String generateHexadecimalCodedString(String stringToBeCoded) {
        MessageDigest digest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            return null;
        }
        digest.update(stringToBeCoded.getBytes());
        byte[] hashedKey =(byte[])(Object) digest.digest();
        final int radix = 16;
        String result = "";
        for (byte b : hashedKey) {
            int unsignedByte = b + 128;
            result += Integer.toString(unsignedByte, radix);
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
