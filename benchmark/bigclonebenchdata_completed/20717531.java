
import java.io.UncheckedIOException;


class c20717531 {

    public static String encrypt(String plainText) {
        MyHelperClass TextUtils = new MyHelperClass();
        if ((boolean)(Object)TextUtils.isEmpty(plainText)) {
            plainText = "";
        }
        StringBuilder text = new StringBuilder();
        for (int i = plainText.length() - 1; i >= 0; i--) {
            text.append(plainText.charAt(i));
        }
        plainText = text.toString();
        MessageDigest mDigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            mDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        } catch (UncheckedIOException e) {
            return plainText;
        }
        mDigest.update(plainText.getBytes());
        byte d[] =(byte[])(Object) mDigest.digest();
        StringBuffer hash = new StringBuffer();
        for (int i = 0; i < d.length; i++) {
            hash.append(Integer.toHexString(0xFF & d[i]));
        }
        return hash.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
