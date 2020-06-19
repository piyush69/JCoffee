import java.io.*;
import java.lang.*;
import java.util.*;



class c1771590 {

    public static String buildUserPassword(String password) {
        String result = "";
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(password.getBytes("UTF8"));
            byte[] hash =(byte[])(Object) md.digest();
            for (int i = 0; i < hash.length; i++) {
                int hexValue = hash[i] & 0xFF;
                if (hexValue < 16) {
                    result = result + "0";
                }
                result = result + Integer.toString(hexValue, 16);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Users'password MD5 Digest: " + result);
        } catch (UncheckedIOException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ex.getMessage());
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
