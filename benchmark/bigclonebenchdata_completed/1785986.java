
import java.io.UncheckedIOException;


class c1785986 {

    public static String getEncryptedPassword(String clearTextPassword) {
        MyHelperClass StringUtil = new MyHelperClass();
        if ((boolean)(Object)StringUtil.isEmpty(clearTextPassword)) return "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            md.update(clearTextPassword.getBytes());
            return new sun.misc.BASE64Encoder().encode((byte[])(Object)md.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass _log = new MyHelperClass();
            _log.error("Failed to encrypt password.",(NoSuchAlgorithmException)(Object) e);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
