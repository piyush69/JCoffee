
import java.io.UncheckedIOException;


class c3633154 {

    public static String getHash(String userName, String pass) {
        String hash = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(userName.getBytes());
            MyHelperClass ISOUtil = new MyHelperClass();
            hash =(String)(Object) ISOUtil.hexString(md.digest(pass.getBytes())).toLowerCase();
        } catch (UncheckedIOException e) {
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass hexString(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
