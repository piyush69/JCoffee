
import java.io.UncheckedIOException;


class c12863885 {

    private static String md5(String input) {
        String res = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest cript =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            cript.reset();
            cript.update(input.getBytes());
            byte[] md5 =(byte[])(Object) cript.digest();
            String tmp = "";
            for (int i = 0; i < md5.length; i++) {
                tmp = (Integer.toHexString(0xFF & md5[i]));
                if (tmp.length() == 1) {
                    res += "0" + tmp;
                } else {
                    res += tmp;
                }
            }
        } catch (UncheckedIOException ex) {
            MyHelperClass Log4k = new MyHelperClass();
            Log4k.error(pdfPrinter.class.getName(), ex.getMessage());
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, String o1){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class pdfPrinter {

}
