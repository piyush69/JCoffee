
import java.io.UncheckedIOException;


class c20474021 {

    public static byte[] createAuthenticator(ByteBuffer data, String secret) {
        assert(boolean)(Object) data.isDirect() == false : "must not a direct ByteBuffer";
        int pos =(int)(Object) data.position();
        MyHelperClass RadiusPacket = new MyHelperClass();
        if (pos < (int)(Object)RadiusPacket.MIN_PACKET_LENGTH) {
            System.err.println("packet too small");
            return null;
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            byte[] arr =(byte[])(Object) data.array();
            md5.reset();
            md5.update(arr, 0, pos);
            md5.update(secret.getBytes());
            return(byte[])(Object) md5.digest();
        } catch (UncheckedIOException nsaex) {
            throw new RuntimeException("Could not access MD5 algorithm, fatal error");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MIN_PACKET_LENGTH;
public MyHelperClass getInstance(String o0){ return null; }}

class ByteBuffer {

public MyHelperClass array(){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass isDirect(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
