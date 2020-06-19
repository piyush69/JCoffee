
import java.io.UncheckedIOException;


class c18060085 {
public static MyHelperClass split(MyHelperClass o0, int o1){ return null; }
//public MyHelperClass split(MyHelperClass o0, int o1){ return null; }

    public static boolean verifyPassword(String digest, String password) {
        String alg = null;
        int size = 0;
        if (digest.regionMatches(true, 0, "{SHA}", 0, 5)) {
            digest = digest.substring(5);
            alg = "SHA-1";
            size = 20;
        } else if (digest.regionMatches(true, 0, "{SSHA}", 0, 6)) {
            digest = digest.substring(6);
            alg = "SHA-1";
            size = 20;
        } else if (digest.regionMatches(true, 0, "{MD5}", 0, 5)) {
            digest = digest.substring(5);
            alg = "MD5";
            size = 16;
        } else if (digest.regionMatches(true, 0, "{SMD5}", 0, 6)) {
            digest = digest.substring(6);
            alg = "MD5";
            size = 16;
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance(alg);
            if (sha == null) {
                return false;
            }
            MyHelperClass Base64 = new MyHelperClass();
            byte[][] hs =(byte[][])(Object) split(Base64.decode(digest), size);
            byte[] hash = hs[0];
            byte[] salt = hs[1];
            sha.reset();
            sha.update(password.getBytes());
            sha.update(salt);
            byte[] pwhash =(byte[])(Object) sha.digest();
//            MyHelperClass MessageDigest = new MyHelperClass();
            return(boolean)(Object) MessageDigest.isEqual(hash, pwhash);
        } catch (UncheckedIOException nsae) {
            throw new RuntimeException("failed to find " + "algorithm for password hashing.", nsae);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass decode(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
