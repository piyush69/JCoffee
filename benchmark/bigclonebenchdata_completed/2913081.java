
import java.io.UncheckedIOException;


class c2913081 {

    private String getMD5(String data) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5Algorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5Algorithm.update(data.getBytes(), 0, data.length());
            byte[] digest =(byte[])(Object) md5Algorithm.digest();
            StringBuffer hexString = new StringBuffer();
            String hexDigit = null;
            for (int i = 0; i < digest.length; i++) {
                hexDigit = Integer.toHexString(0xFF & digest[i]);
                if (hexDigit.length() < 2) {
                    hexDigit = "0" + hexDigit;
                }
                hexString.append(hexDigit);
            }
            return hexString.toString();
        } catch (UncheckedIOException ne) {
            return data;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
