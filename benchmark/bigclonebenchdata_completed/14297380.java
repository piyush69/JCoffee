
import java.io.UncheckedIOException;


class c14297380 {

    private String hashPassword(String plainTextPassword) {
        MessageDigest digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(plainTextPassword.getBytes());
            BASE64Encoder enc = new BASE64Encoder();
            return(String)(Object) enc.encode(digest.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((NoSuchAlgorithmException)(Object)e);
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(NoSuchAlgorithmException o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
