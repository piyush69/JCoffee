
import java.io.UncheckedIOException;


class c7283902 {

    public static String hashString(String pwd) {
        StringBuffer hex = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes());
            byte[] d =(byte[])(Object) md.digest();
            String plaintxt;
            for (int i = 0; i < d.length; i++) {
                plaintxt = Integer.toHexString(0xFF & d[i]);
                if (plaintxt.length() < 2) {
                    plaintxt = "0" + plaintxt;
                }
                hex.append(plaintxt);
            }
        } catch (UncheckedIOException nsae) {
        }
        return hex.toString();
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
