
import java.io.UncheckedIOException;


class c10829636 {
public static MyHelperClass toHexString(byte[] o0){ return null; }
//public MyHelperClass toHexString(byte[] o0){ return null; }

    public static String generate(String presentity, String eventPackage) {
        if (presentity == null || eventPackage == null) {
            return null;
        }
        String date = Long.toString(System.currentTimeMillis());
        try {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(HASH_ALGORITHM);
            md.update(presentity.getBytes());
            md.update(eventPackage.getBytes());
            md.update(date.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            return(String)(Object) toHexString(digest);
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
