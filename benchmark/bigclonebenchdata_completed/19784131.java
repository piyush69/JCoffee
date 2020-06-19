import java.io.*;
import java.lang.*;
import java.util.*;



class c19784131 {

    public static String getMD5Hash(String original) {
        StringBuffer sb = new StringBuffer();
        try {
            StringReader sr = null;
            int crypt_byte = 0;
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.reset();
            md.update(original.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            sr = new StringReader(new String(digest, "ISO8859_1"));
            while ((crypt_byte = sr.read()) != -1) {
                String hexString = Integer.toHexString(crypt_byte);
                if (crypt_byte < 16) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
        } catch (UncheckedIOException nsae) {
        } catch (IOException ioe) {
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
