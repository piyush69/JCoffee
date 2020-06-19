
import java.io.UncheckedIOException;


class c22854233 {

    public String getMd5() {
        StringBuffer hexString = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.reset();
            MyHelperClass string = new MyHelperClass();
            md5.update(string.getBytes());
            byte[] result =(byte[])(Object) md5.digest();
            for (int i = 0; i < result.length; i++) {
                hexString.append(Integer.toHexString((result[i] & 0xFF) | 0x100).toLowerCase().substring(1, 3));
            }
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
