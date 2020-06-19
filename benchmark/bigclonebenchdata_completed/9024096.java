
import java.io.UncheckedIOException;


class c9024096 {
public static MyHelperClass binaryToString(MyHelperClass o0){ return null; }
//public MyHelperClass binaryToString(MyHelperClass o0){ return null; }

    public static final String enCode(String algorithm, String string) {
        MessageDigest md;
        String result = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            md.update(string.getBytes());
            result =(String)(Object) binaryToString(md.digest());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
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
