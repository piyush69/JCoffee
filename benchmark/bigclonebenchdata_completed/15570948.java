
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15570948 {
public MyHelperClass getLog(){ return null; }

    private String generate(String value) throws Exception {
        String resStr = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(value.getBytes("utf-8"), 0, value.length());
            byte[] result =(byte[])(Object) md.digest();
            MyHelperClass FTGenerate = new MyHelperClass();
            resStr =(String)(Object) FTGenerate.convertToHex(result);
            md.reset();
        } catch (UncheckedIOException nae) {
            this.getLog().severe("Hash no funcionando");
            nae.printStackTrace();
            throw new Exception("Hash no funcionando");
        } catch (ArithmeticException ee) {
            this.getLog().severe("Encoding no funcionando");
            ee.printStackTrace();
            throw new Exception("Encoding no funcionando");
        }
        return resStr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass convertToHex(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}
