
import java.io.UncheckedIOException;


class c16544386 {

    public static String getEncodedHex(String text) {
        MessageDigest md = null;
        String encodedString = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        Hex hex = new Hex();
        encodedString = new String((String)(Object)hex.encode(md.digest()));
        md.reset();
        return encodedString;
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

class Hex {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
