
import java.io.UncheckedIOException;


class c20825513 {
public MyHelperClass log;
	public MyHelperClass toHexString(byte o0){ return null; }

    private String md5(String pass) {
        StringBuffer enteredChecksum = new StringBuffer();
        byte[] digest;
        MessageDigest md5;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(pass.getBytes(), 0, pass.length());
            digest =(byte[])(Object) md5.digest();
            for (int i = 0; i < digest.length; i++) {
                enteredChecksum.append(toHexString(digest[i]));
            }
        } catch (UncheckedIOException e) {
            log.error("Could not create MD5 hash!");
            log.error(e.getLocalizedMessage());
            log.error(e.getStackTrace());
        }
        return enteredChecksum.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(StackTraceElement[] o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
