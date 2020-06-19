
import java.io.UncheckedIOException;


class c11046598 {

    private String hash(String clearPassword) {
        MyHelperClass salt = new MyHelperClass();
        if ((int)(Object)salt == 0) return null;
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
        } catch (UncheckedIOException e) {
            throw new AssertionError("Can't find the SHA1 algorithm in the java.security package");
        }
//        MyHelperClass salt = new MyHelperClass();
        String saltString = String.valueOf(salt);
        md.update(saltString.getBytes());
        md.update(clearPassword.getBytes());
        byte[] digestBytes =(byte[])(Object) md.digest();
        StringBuffer digestSB = new StringBuffer();
        for (int i = 0; i < digestBytes.length; i++) {
            int lowNibble = digestBytes[i] & 0x0f;
            int highNibble = (digestBytes[i] >> 4) & 0x0f;
            digestSB.append(Integer.toHexString(highNibble));
            digestSB.append(Integer.toHexString(lowNibble));
        }
        String digestStr = digestSB.toString();
        return digestStr;
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
