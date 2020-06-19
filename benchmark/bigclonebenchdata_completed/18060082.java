
import java.io.UncheckedIOException;


class c18060082 {
public static MyHelperClass Base64;
	public static MyHelperClass concatenate(byte[] o0, byte[] o1){ return null; }
	public static MyHelperClass fromHex(String o0){ return null; }
//public MyHelperClass Base64;
//	public MyHelperClass concatenate(byte[] o0, byte[] o1){ return null; }
//	public MyHelperClass fromHex(String o0){ return null; }

    public static String generateDigest(String password, String saltHex, String alg) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance(alg);
            byte[] salt = new byte[0];
            if (saltHex != null) {
                salt =(byte[])(Object) fromHex(saltHex);
            }
            String label = null;
            if (alg.startsWith("SHA")) {
                label = (salt.length <= 0) ? "{SHA}" : "{SSHA}";
            } else if (alg.startsWith("MD5")) {
                label = (salt.length <= 0) ? "{MD5}" : "{SMD5}";
            }
            sha.reset();
            sha.update(password.getBytes());
            sha.update(salt);
            byte[] pwhash =(byte[])(Object) sha.digest();
            StringBuffer digest = new StringBuffer(label);
            digest.append(Base64.encode(concatenate(pwhash, salt)).toCharArray());
            return digest.toString();
        } catch (UncheckedIOException nsae) {
            throw new RuntimeException("failed to find " + "algorithm for password hashing.", nsae);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
