
import java.io.UncheckedIOException;


class c20547900 {

    public static String md5(String source) {
        MessageDigest md;
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(source.getBytes());
            byte[] digested =(byte[])(Object) md.digest();
            for (int i = 0; i < digested.length; i++) {
                pw.printf("%02x", digested[i]);
            }
            pw.flush();
            return sw.getBuffer().toString();
        } catch (UncheckedIOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class StringWriter {

public MyHelperClass getBuffer(){ return null; }}

class PrintWriter {

PrintWriter(StringWriter o0){}
	PrintWriter(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass printf(String o0, byte o1){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
