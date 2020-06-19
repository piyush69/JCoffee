
import java.io.UncheckedIOException;


class c16556717 {
public static MyHelperClass CofaxToolsUtil;
//public MyHelperClass CofaxToolsUtil;

    public static String getSHADigest(String password) {
        String digest = null;
        MessageDigest sha = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            sha.reset();
            sha.update(password.getBytes());
            byte[] pwhash =(byte[])(Object) sha.digest();
            MyHelperClass Base64 = new MyHelperClass();
            digest = "{SHA}" + new String((String)(Object)Base64.encode(pwhash));
        } catch (UncheckedIOException nsae) {
            MyHelperClass id = new MyHelperClass();
            CofaxToolsUtil.log("Algorithme SHA-1 non supporte a la creation du hashage" + nsae + id);
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
