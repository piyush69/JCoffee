
import java.io.UncheckedIOException;


class c9561059 {

    private static byte[] createHash(EHashType hashType, String string) {
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance(hashType.getJavaHashType());
            md.reset();
            md.update(string.getBytes());
            byte[] byteResult =(byte[])(Object) md.digest();
            return byteResult;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class EHashType {

public MyHelperClass getJavaHashType(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
