
import java.io.UncheckedIOException;


class c6056798 {

    public static String toMD5(String seed) {
        MessageDigest md5 = null;
        StringBuffer temp_sb = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(seed.getBytes());
            byte[] array =(byte[])(Object) md5.digest();
            temp_sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                int b = array[i] & 0xFF;
                if (b < 0x10) temp_sb.append('0');
                temp_sb.append(Integer.toHexString(b));
            }
        } catch (UncheckedIOException err) {
            err.printStackTrace();
        }
        return temp_sb.toString();
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
