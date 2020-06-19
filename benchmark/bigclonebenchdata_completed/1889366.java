
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1889366 {

    public String hash(String password) {
        MessageDigest digest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        } catch (UncheckedIOException ex) {
            MyHelperClass log = new MyHelperClass();
            log.info("No sha-256 available");
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (UncheckedIOException e) {
//                MyHelperClass log = new MyHelperClass();
                log.fatal("sha-1 is not available",(NoSuchAlgorithmException)(Object) e);
                throw new RuntimeException("Couldn't get a hash algorithm from Java");
            }
        }
        try {
            digest.reset();
            MyHelperClass salt = new MyHelperClass();
            digest.update((salt + password).getBytes("UTF-8"));
            byte hash[] =(byte[])(Object) digest.digest();
            MyHelperClass Base64 = new MyHelperClass();
            return new String((String)(Object)Base64.encodeBase64(hash, false));
        } catch (Throwable t) {
            throw new RuntimeException("Couldn't hash password");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBase64(byte[] o0, boolean o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass fatal(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
