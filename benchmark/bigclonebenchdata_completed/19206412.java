
import java.io.UncheckedIOException;


class c19206412 {

    public static String md5String(String str) {
        try {
            MessageDigest md;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash =(byte[])(Object) md.digest();
            final char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
            StringBuffer res = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                res.append(hexChars[(0xF0 & hash[i]) >> 4]);
                res.append(hexChars[0x0F & hash[i]]);
            }
            return res.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
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
