
import java.io.UncheckedIOException;


class c17954700 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static String getPasswordHash(String password) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] byteData =(byte[])(Object) md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Unknow error in hashing password",(NoSuchAlgorithmException)(Object) e);
            return "Unknow error, check system log";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
