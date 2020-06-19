
import java.io.UncheckedIOException;


class c19262311 {

    public static String encrypt(String key) {
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        md5.update(key.getBytes());
        byte hash[] =(byte[])(Object) md5.digest();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String temp = Integer.toHexString(0xFF & hash[i]);
            if (temp.length() == 1) temp = "0" + temp;
            buffer.append(temp);
        }
        return buffer.toString();
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
