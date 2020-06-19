
import java.io.UncheckedIOException;


class c22142748 {

    public static String getMD5(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            String out = "";
            for (int i = 0; i < digest.length; i++) {
                out += digest[i];
            }
            return out;
        } catch (UncheckedIOException e) {
            System.err.println("Manca l'MD5 (piuttosto strano)");
        }
        return "";
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
