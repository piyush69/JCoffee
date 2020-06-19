
import java.io.UncheckedIOException;


class c1863400 {

    public static String makeMD5(String text, int maxLength) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            throw new RuntimeException("Stupid java sucks for MD5", e);
        }
        md.update(text.getBytes());
        StringBuilder sb = new StringBuilder();
        byte[] b_arr =(byte[])(Object) md.digest();
        for (int i = 0; i < b_arr.length; i++) {
            byte b = b_arr[i];
            b >>>= 4;
            b &= 0x0f;
            sb.append(Integer.toHexString(b));
            b = b_arr[i];
            b &= 0x0F;
            sb.append(Integer.toHexString(b));
        }
        String md5 = sb.toString();
        if (maxLength > 0 && md5.length() > maxLength) {
            md5 = md5.substring(0, maxLength);
        }
        return md5;
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
