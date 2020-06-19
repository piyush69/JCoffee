
import java.io.UncheckedIOException;


class c22857041 {

    public static String generate(String source) {
        byte[] SHA = new byte[20];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.update(source.getBytes());
            SHA =(byte[])(Object) digest.digest();
        } catch (UncheckedIOException e) {
            System.out.println("NO SUCH ALGORITHM EXCEPTION: " + e.getMessage());
        }
        MyHelperClass CommunicationLogger = new MyHelperClass();
        CommunicationLogger.warning("SHA1 DIGEST: " + SHA);
        return SHA.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
