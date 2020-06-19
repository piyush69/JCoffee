
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17724878 {

    public byte[] getDigest(OMProcessingInstruction pi, String digestAlgorithm) throws OMException {
        byte[] digest = new byte[0];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(digestAlgorithm);
            md.update((byte) 0);
            md.update((byte) 0);
            md.update((byte) 0);
            md.update((byte) 7);
            md.update((byte)(Object)pi.getTarget().getBytes("UnicodeBigUnmarked"));
            md.update((byte) 0);
            md.update((byte) 0);
            md.update((byte)(Object)pi.getValue().getBytes("UnicodeBigUnmarked"));
            digest =(byte[])(Object) md.digest();
        } catch (UncheckedIOException e) {
            throw new OMException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new OMException((String)(Object)e);
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }}

class OMProcessingInstruction {

public MyHelperClass getTarget(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class OMException extends Exception{
	public OMException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}
