
import java.io.UncheckedIOException;


class c16556715 {
public MyHelperClass split(MyHelperClass o0, int o1){ return null; }
public MyHelperClass CofaxToolsUtil;

    public boolean checkPassword(String password, String digest) {
        boolean passwordMatch = false;
        MessageDigest sha = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            if (digest.regionMatches(true, 0, "{SHA}", 0, 5)) {
                digest = digest.substring(5);
            } else if (digest.regionMatches(true, 0, "{SSHA}", 0, 6)) {
                digest = digest.substring(6);
            }
            MyHelperClass Base64 = new MyHelperClass();
            byte[][] hs =(byte[][])(Object) split(Base64.decode(digest.getBytes()), 20);
            byte[] hash = hs[0];
            byte[] salt = hs[1];
            sha.reset();
            sha.update(password.getBytes());
            sha.update(salt);
            byte[] pwhash =(byte[])(Object) sha.digest();
//            MyHelperClass MessageDigest = new MyHelperClass();
            if ((boolean)(Object)MessageDigest.isEqual(hash, pwhash)) {
                passwordMatch = true;
            }
        } catch (UncheckedIOException nsae) {
            MyHelperClass id = new MyHelperClass();
            CofaxToolsUtil.log("Algorithme SHA-1 non supporte a la verification du password" + nsae + id);
        }
        return passwordMatch;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass decode(byte[] o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, byte[] o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
