
import java.io.UncheckedIOException;


class c7219016 {

    public static String getMD5(String... list) {
        if (list.length == 0) return null;
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        md.reset();
        for (String in : list) md.update(in.getBytes());
        byte[] digest =(byte[])(Object) md.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest.length; ++i) {
            String hex = Integer.toHexString(0xFF & digest[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
