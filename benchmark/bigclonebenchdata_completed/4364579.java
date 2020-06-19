
import java.io.UncheckedIOException;


class c4364579 {

    public static String calcCRC(String phrase) {
        StringBuffer crcCalc = new StringBuffer();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(phrase.getBytes());
            byte[] tabDigest =(byte[])(Object) md.digest();
            for (int i = 0; i < tabDigest.length; i++) {
                String octet = "0" + Integer.toHexString(tabDigest[i]);
                crcCalc.append(octet.substring(octet.length() - 2));
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return crcCalc.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
