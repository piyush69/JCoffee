
import java.io.UncheckedIOException;


class c3259164 {

    public static String getMd5(String str) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            final byte b[] =(byte[])(Object) md.digest();
            int i;
            final StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (final UncheckedIOException e) {
            e.printStackTrace();
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
