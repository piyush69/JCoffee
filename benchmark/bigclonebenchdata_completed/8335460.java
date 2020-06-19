
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8335460 {

    public static String encrypt(String password, String algorithm, byte[] salt) {
        StringBuffer buffer = new StringBuffer();
        MessageDigest digest = null;
        int size = 0;
        if ("CRYPT".equalsIgnoreCase(algorithm)) {
            throw new InternalError("Not implemented");
        } else if ("SHA".equalsIgnoreCase(algorithm) || "SSHA".equalsIgnoreCase(algorithm)) {
            size = 20;
            if (salt != null && salt.length > 0) {
                buffer.append("{SSHA}");
            } else {
                buffer.append("{SHA}");
            }
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        } else if ("MD5".equalsIgnoreCase(algorithm) || "SMD5".equalsIgnoreCase(algorithm)) {
            size = 16;
            if (salt != null && salt.length > 0) {
                buffer.append("{SMD5}");
            } else {
                buffer.append("{MD5}");
            }
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException e) {
                throw new InternalError("Invalid algorithm");
            }
        }
        int outSize = size;
        digest.reset();
        digest.update(password.getBytes());
        if (salt != null && salt.length > 0) {
            digest.update(salt);
            outSize += salt.length;
        }
        byte[] out = new byte[outSize];
        System.arraycopy(digest.digest(), 0, out, 0, size);
        if (salt != null && salt.length > 0) {
            System.arraycopy(salt, 0, out, size, salt.length);
        }
        MyHelperClass Base64 = new MyHelperClass();
        buffer.append(Base64.encode(out));
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
