
import java.io.UncheckedIOException;


class c5600261 {

    private String calculateMD5(String value) {
        String finalString = new String("");
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5Alg =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5Alg.reset();
            md5Alg.update(value.getBytes());
            byte messageDigest[] =(byte[])(Object) md5Alg.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String hex = Integer.toHexString(0xFF & messageDigest[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            finalString = hexString.toString();
        } catch (UncheckedIOException exc) {
            throw new RuntimeException("Hashing error happened:", exc);
        }
        return finalString;
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
