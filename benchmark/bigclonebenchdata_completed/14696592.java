
import java.io.UncheckedIOException;


class c14696592 {

    public static String hashClientPassword(String algorithm, String password, String salt) throws IllegalArgumentException, DruidSafeRuntimeException {
        if (algorithm == null) {
            throw new IllegalArgumentException("THE ALGORITHM MUST NOT BE NULL");
        }
        if (password == null) {
            throw new IllegalArgumentException("THE PASSWORD MUST NOT BE NULL");
        }
        if (salt == null) {
            salt = "";
        }
        String result = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            md.update(password.getBytes());
            md.update(salt.getBytes());
            MyHelperClass SecurityHelper = new MyHelperClass();
            result =(String)(Object) SecurityHelper.byteArrayToHexString(md.digest());
        } catch (UncheckedIOException e) {
            throw new DruidSafeRuntimeException((String)(Object)e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass byteArrayToHexString(MyHelperClass o0){ return null; }}

class DruidSafeRuntimeException extends Exception{
	public DruidSafeRuntimeException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
