
import java.io.UncheckedIOException;


class c4056444 {
public MyHelperClass log;
	public MyHelperClass byteToString(byte[] o0, int o1){ return null; }

        public final String hashPassword(String password) {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
                md.update(password.getBytes());
                byte[] hash =(byte[])(Object) md.digest();
                return "{SHA}" + byteToString(hash, 60);
            } catch (UncheckedIOException nsae) {
                log.error("Error getting password hash - " + nsae.getMessage());
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
