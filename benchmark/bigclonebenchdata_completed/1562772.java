import java.io.*;
import java.lang.*;
import java.util.*;



class c1562772 {

    private String getCoded(String pass) {
        String passSecret = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            m.update(pass.getBytes("UTF8"));
            byte s[] =(byte[])(Object) m.digest();
            for (int i = 0; i < s.length; i++) {
                passSecret += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
            }
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return passSecret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
