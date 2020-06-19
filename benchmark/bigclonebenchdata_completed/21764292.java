
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21764292 {

    private static byte[] sha2(String... data) {
        byte[] digest = new byte[32];
        StringBuilder buffer = new StringBuilder();
        for (String s : data) {
            buffer.append(s);
        }
        MessageDigest sha256 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha256 =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        } catch (UncheckedIOException ex) {
            assert false;
        }
        sha256.update(buffer.toString().getBytes());
        try {
            sha256.digest(digest, 0, digest.length);
        } catch (UncheckedIOException ex) {
            assert false;
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class DigestException extends Exception{
	public DigestException(String errorMessage) { super(errorMessage); }
}
