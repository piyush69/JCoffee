
import java.io.UncheckedIOException;


class c4798330 {

    public static String MD5(String source) {
        MyHelperClass logger = new MyHelperClass();
        logger.info(source);
        String result = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(source.getBytes());
            byte[] bytes =(byte[])(Object) digest.digest();
            MyHelperClass EncodeUtils = new MyHelperClass();
            result =(String)(Object) EncodeUtils.hexEncode(bytes);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.info(result);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass hexEncode(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
