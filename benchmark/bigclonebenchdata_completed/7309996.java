
import java.io.UncheckedIOException;


class c7309996 {

    public static final String md5(String name) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e.getMessage());
        }
        md.reset();
        md.update(name.getBytes());
        byte b[] =(byte[])(Object) md.digest();
        String encoded = "";
        for (int i = 0; i < b.length; i++) {
            int b2 = (int) b[i] % 16;
            if (b2 < 0) b2 += 16;
            int b1 = (int) b[i];
            if (b1 < 0) b1 += 16 * 16;
            b1 -= b2;
            b1 /= 16;
            if (b1 <= 9) encoded += (char) ((int) '0' + (int) b1); else encoded += (char) ((int) 'a' + (int) b1 - (int) 10);
            if (b2 <= 9) encoded += (char) ((int) '0' + (int) b2); else encoded += (char) ((int) 'a' + (int) b2 - (int) 10);
        }
        return encoded;
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
