
import java.io.UncheckedIOException;


class c13024208 {

    public static String CreateHash(String s) {
        String str = s.toString();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        StringBuffer hexString = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash =(byte[])(Object) md.digest();
            for (int i = 0; i < hash.length; i++) {
                if ((0xff & hash[i]) < 0x10) {
                    hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
                } else {
                    hexString.append(Integer.toHexString(0xFF & hash[i]));
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return (hexString.toString());
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
