
import java.io.UncheckedIOException;


class c3067994 {

    private String hashMD5(String strToHash) throws Exception {
        try {
            byte[] bHash = new byte[strToHash.length() * 2];
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(strToHash.getBytes("UTF-16LE"));
            bHash =(byte[])(Object) md.digest();
            StringBuffer hexString = new StringBuffer();
            for (byte element : bHash) {
                String strTemp = Integer.toHexString(element);
                hexString.append(strTemp.replaceAll("f", ""));
            }
            return hexString.toString();
        } catch (UncheckedIOException duu) {
            throw new Exception("NoSuchAlgorithmException: " + duu.getMessage());
        }
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
