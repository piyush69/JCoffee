
import java.io.UncheckedIOException;


class c21513130 {

    public static String hashMD5(String passw) {
        String passwHash = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(passw.getBytes());
            byte[] result =(byte[])(Object) md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                String tmpStr = "0" + Integer.toHexString((0xff & result[i]));
                sb.append(tmpStr.substring(tmpStr.length() - 2));
            }
            passwHash = sb.toString();
        } catch (UncheckedIOException ecc) {
            MyHelperClass log = new MyHelperClass();
            log.error("Errore algoritmo " + ecc);
        }
        return passwHash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
