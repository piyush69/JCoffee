
import java.io.UncheckedIOException;


class c10173088 {

    public static void main(String[] args) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha1 =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            sha1.update("Test".getBytes());
            byte[] digest =(byte[])(Object) sha1.digest();
            for (int i = 0; i < digest.length; i++) {
                System.err.print(Integer.toHexString(0xFF & digest[i]));
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
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
