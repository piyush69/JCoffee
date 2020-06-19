
import java.io.UncheckedIOException;


class c5494012 {

    private String doMessageDigestAndBase64Encoding(String sequence) throws SeguidException {
        if (sequence == null) {
            throw new NullPointerException("You must give a non null sequence");
        }
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            sequence = sequence.trim().toUpperCase();
            messageDigest.update(sequence.getBytes());
            byte[] digest =(byte[])(Object) messageDigest.digest();
            MyHelperClass Base64 = new MyHelperClass();
            String seguid =(String)(Object) Base64.encodeBytes(digest);
            seguid = seguid.replace("=", "");
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isTraceEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.trace("SEGUID " + seguid);
            }
            return seguid;
        } catch (UncheckedIOException e) {
            throw new SeguidException("Exception thrown when calculating Seguid for " + sequence, e.getCause());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBytes(byte[] o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }}

class SeguidException extends Exception{
	public SeguidException(String errorMessage) { super(errorMessage); }
	SeguidException(String o0, Throwable o1){}
	SeguidException(){}
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
