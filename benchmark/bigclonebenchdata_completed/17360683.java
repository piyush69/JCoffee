
import java.io.UncheckedIOException;


class c17360683 {

    public static String generateMD5(String clear) {
        byte hash[] = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(clear.getBytes());
            hash =(byte[])(Object) md5.digest();
        } catch (UncheckedIOException e) {
        }
        if (hash != null) {
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String tmp = Integer.toHexString(0xFF & hash[i]);
                if (tmp.length() == 1) {
                    tmp = "0" + tmp;
                }
                hexString.append(tmp);
            }
            return hexString.toString();
        } else {
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
