
import java.io.UncheckedIOException;


class c21489106 {
public static MyHelperClass byteArrayToHex(byte[] o0){ return null; }
//public MyHelperClass byteArrayToHex(byte[] o0){ return null; }

    public static String calculate(String message, String algorithm, boolean base64) throws IllegalArgumentException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        } catch (UncheckedIOException e) {
            String error = "'" + algorithm + "' is not a supported MessageDigest algorithm.";
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(error,(NoSuchAlgorithmException)(Object) e);
            throw new IllegalArgumentException(error);
        }
        md.update(message.getBytes());
        byte[] digestData =(byte[])(Object) md.digest();
        String digest = null;
        if (base64) {
            Base64Encoder enc = new Base64Encoder();
            enc.translate(digestData);
            digest = new String((String)(Object)enc.getCharArray());
        } else {
            digest =(String)(Object) byteArrayToHex(digestData);
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64Encoder {

public MyHelperClass getCharArray(){ return null; }
	public MyHelperClass translate(byte[] o0){ return null; }}
