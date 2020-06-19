
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15347323 {
public static MyHelperClass DEFAULT_ALGORITHM;
public static MyHelperClass MessageDigest;
	public static MyHelperClass Base64Encoder;
//public MyHelperClass MessageDigest;
//	public MyHelperClass Base64Encoder;
//	public MyHelperClass DEFAULT_ALGORITHM;

    public static String hash(String in, String algorithm) {
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isBlank(algorithm)) algorithm =(String)(Object) DEFAULT_ALGORITHM;
        try {
            MyHelperClass md = new MyHelperClass();
            md = MessageDigest.getInstance(algorithm);
        } catch (UncheckedIOException nsae) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("No such algorithm exception",(NoSuchAlgorithmException)(Object) nsae);
        }
        MyHelperClass md = new MyHelperClass();
        md.reset();
//        MyHelperClass md = new MyHelperClass();
        md.update(in.getBytes());
        String out = null;
        try {
//            MyHelperClass md = new MyHelperClass();
            out =(String)(Object) Base64Encoder.encode(md.digest());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error converting to Base64 ",(NoSuchAlgorithmException)(Object) e);
        }
        if (out.endsWith("\n")) out = out.substring(0, out.length() - 1);
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
