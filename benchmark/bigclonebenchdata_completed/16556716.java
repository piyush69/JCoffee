
import java.io.UncheckedIOException;


class c16556716 {
public static MyHelperClass id;
	public static MyHelperClass CofaxToolsUtil;
	public static MyHelperClass Base64;
	public static MyHelperClass concatenate(byte[] o0, byte[] o1){ return null; }
//public MyHelperClass Base64;
//	public MyHelperClass CofaxToolsUtil;
//	public MyHelperClass id;
//	public MyHelperClass concatenate(byte[] o0, byte[] o1){ return null; }

    public static String getSSHADigest(String password, String salt) {
        String digest = null;
        MessageDigest sha = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            sha.reset();
            sha.update(password.getBytes());
            sha.update(salt.getBytes());
            byte[] pwhash =(byte[])(Object) sha.digest();
            digest = "{SSHA}" + new String((String)(Object)Base64.encode(concatenate(pwhash, salt.getBytes())));
        } catch (UncheckedIOException nsae) {
            CofaxToolsUtil.log("Algorithme SHA-1 non supporte a la creation du hashage" + nsae + id);
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
