
import java.io.UncheckedIOException;


class c11810425 {

    private static String createBoundary(int number) {
        MessageDigest digest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        digest.update(String.valueOf(Math.random()).getBytes());
        digest.update(String.valueOf(System.currentTimeMillis()).getBytes());
        digest.update(String.valueOf(digest.hashCode()).getBytes());
        byte[] bytes =(byte[])(Object) digest.digest();
        String paddedNumber = Integer.toString(number);
        paddedNumber = ("0000000000".substring(0, 10 - paddedNumber.length()) + paddedNumber);
        StringBuffer buffer = new StringBuffer();
        buffer.append("---------------------------------=__");
        for (int i = 0; i < 8; i++) {
            String hex = Integer.toHexString((bytes[i] & 0xff) + 0x100).substring(1);
            buffer.append(hex);
        }
        buffer.append('_');
        buffer.append(paddedNumber);
        return buffer.toString();
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
