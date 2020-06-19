
import java.io.UncheckedIOException;


class c20208819 {

    private static final String hash(String input, String algorithm) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest dig =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            dig.update(input.getBytes());
            StringBuffer result = new StringBuffer();
            byte[] digest =(byte[])(Object) dig.digest();
            String[] hex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
            for (int i = 0; i < digest.length; i++) {
                int u = digest[i];
                u &= 0x000000FF;
                int highCount = u / 16;
                int lowCount = u - (highCount * 16);
                result.append(hex[highCount]);
                result.append(hex[lowCount]);
            }
            return result.toString();
        } catch (UncheckedIOException e) {
            return null;
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
