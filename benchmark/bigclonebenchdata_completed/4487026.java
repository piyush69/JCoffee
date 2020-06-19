
import java.io.UncheckedIOException;


class c4487026 {

    private String md5(String s) {
        StringBuffer hexString = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] =(byte[])(Object) digest.digest();
            hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String hashPart = Integer.toHexString(0xFF & messageDigest[i]);
                if (hashPart.length() == 1) {
                    hashPart = "0" + hashPart;
                }
                hexString.append(hashPart);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e(this.getClass().getSimpleName(), "MD5 algorithm not present");
        }
        return hexString != null ? hexString.toString() : null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
