
import java.io.UncheckedIOException;


class c16338011 {
public MyHelperClass exit(){ return null; }

    protected byte[] getHashedID(String ID) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(ID.getBytes());
            byte[] digest =(byte[])(Object) md5.digest();
            MyHelperClass WLDB_ID_SIZE = new MyHelperClass();
            byte[] bytes = new byte[(int)(Object)WLDB_ID_SIZE];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = digest[i];
            }
            return bytes;
        } catch (UncheckedIOException exception) {
            System.err.println("Java VM is not compatible");
            exit();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
