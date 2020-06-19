
import java.io.UncheckedIOException;


class c20789642 {

    private static String getSignature(String data) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            return "FFFFFFFFFFFFFFFF";
        }
        md.update(data.getBytes());
        StringBuffer sb = new StringBuffer();
        byte[] sign =(byte[])(Object) md.digest();
        for (int i = 0; i < sign.length; i++) {
            byte b = sign[i];
            int in = (int) b;
            if (in < 0) in = 127 - b;
            String hex = Integer.toHexString(in).toUpperCase();
            if (hex.length() == 1) hex = "0" + hex;
            sb.append(hex);
        }
        return sb.toString();
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
