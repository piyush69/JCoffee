
import java.io.UncheckedIOException;


class c5933082 {

    public String encryptPassword(String password) {
        StringBuffer encPasswd = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            mdAlgorithm.update(password.getBytes());
            byte[] digest =(byte[])(Object) mdAlgorithm.digest();
            for (int i = 0; i < digest.length; i++) {
                password = Integer.toHexString(255 & digest[i]);
                if (password.length() < 2) {
                    password = "0" + password;
                }
                encPasswd.append(password);
            }
        } catch (UncheckedIOException ex) {
        }
        return encPasswd.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
