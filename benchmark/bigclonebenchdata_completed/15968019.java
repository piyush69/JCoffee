
import java.io.UncheckedIOException;


class c15968019 {
public static MyHelperClass toHexString(byte[] o0){ return null; }
//public MyHelperClass toHexString(byte[] o0){ return null; }

    public static String createHash(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            return(String)(Object) toHexString(digest);
        } catch (UncheckedIOException nsae) {
            System.out.println(nsae.getMessage());
        }
        return "";
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
