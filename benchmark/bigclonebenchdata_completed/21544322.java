
import java.io.UncheckedIOException;


class c21544322 {

    public static String generate(String source) {
        byte[] SHA = new byte[20];
        String SHADigest = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.update(source.getBytes());
            SHA =(byte[])(Object) digest.digest();
            for (int i = 0; i < SHA.length; i++) SHADigest += (char) SHA[i];
        } catch (UncheckedIOException e) {
            System.out.println("NO SUCH ALGORITHM EXCEPTION: " + e.getMessage());
        }
        return SHADigest;
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
