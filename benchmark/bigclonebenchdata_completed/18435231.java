
import java.io.UncheckedIOException;


class c18435231 {

    public String getSHA1Hex(String original) {
        MessageDigest digest;
        String result = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            digest =(MessageDigest)(Object) MessageDigest.getInstance("sha1");
            digest.reset();
            digest.update(original.getBytes());
            byte[] dig =(byte[])(Object) digest.digest();
            String hexStr = "";
            for (int i = 0; i < dig.length; i++) {
                hexStr += Integer.toString((dig[i] & 0xff) + 0x100, 16).substring(1);
            }
            result = hexStr;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return result;
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
