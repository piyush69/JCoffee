
import java.io.UncheckedIOException;


class c20499484 {

    private static byte[] getLoginHashSHA(final char[] password, final int seed) throws GGException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest hash =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            hash.update(new String(password).getBytes());
            MyHelperClass GGUtils = new MyHelperClass();
            hash.update((byte[])(Object)GGUtils.intToByte(seed));
            return(byte[])(Object) hash.digest();
        } catch (final UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("SHA1 algorithm not usable",(NoSuchAlgorithmException)(Object) e);
            throw new GGException("SHA1 algorithm not usable!",(NoSuchAlgorithmException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass intToByte(int o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class GGException extends Exception{
	public GGException(String errorMessage) { super(errorMessage); }
	GGException(String o0, NoSuchAlgorithmException o1){}
	GGException(){}
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
