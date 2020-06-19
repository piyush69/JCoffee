
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6176441 {

    public static boolean verify(String password, String encryptedPassword) {
        MessageDigest digest = null;
        int size = 0;
        String base64 = null;
        if (encryptedPassword.regionMatches(true, 0, "{CRYPT}", 0, 7)) {
            throw new InternalError("Not implemented");
        } else if (encryptedPassword.regionMatches(true, 0, "{SHA}", 0, 5)) {
            size = 20;
            base64 = encryptedPassword.substring(5);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{SSHA}", 0, 6)) {
            size = 20;
            base64 = encryptedPassword.substring(6);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{MD5}", 0, 5)) {
            size = 16;
            base64 = encryptedPassword.substring(5);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        } else if (encryptedPassword.regionMatches(true, 0, "{SMD5}", 0, 6)) {
            size = 16;
            base64 = encryptedPassword.substring(6);
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        } else {
            return false;
        }
        MyHelperClass Base64 = new MyHelperClass();
        byte[] data =(byte[])(Object) Base64.decode(base64.toCharArray());
        byte[] orig = new byte[size];
        System.arraycopy(data, 0, orig, 0, size);
        digest.reset();
        digest.update(password.getBytes());
        if (data.length > size) {
            digest.update(data, size, data.length - size);
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        return(boolean)(Object) MessageDigest.isEqual(digest.digest(), orig);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass decode(char[] o0){ return null; }
	public MyHelperClass isEqual(MyHelperClass o0, byte[] o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
