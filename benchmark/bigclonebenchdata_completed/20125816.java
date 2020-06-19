
import java.io.UncheckedIOException;


class c20125816 {
public static MyHelperClass getHexString(MyHelperClass o0){ return null; }
//public MyHelperClass getHexString(MyHelperClass o0){ return null; }
public static MyHelperClass saltPassword(String o0){ return null; }
//public MyHelperClass saltPassword(String o0){ return null; }

    public static String getHash(String password) {
        if (password == null || password.length() == 0) {
            return null;
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            password =(String)(Object) saltPassword(password);
            digest.update(password.getBytes());
            String result =(String)(Object) getHexString(digest.digest());
            return result;
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
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
