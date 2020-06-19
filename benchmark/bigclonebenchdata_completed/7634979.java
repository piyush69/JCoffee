import java.io.*;
import java.lang.*;
import java.util.*;



class c7634979 {

            protected final String H(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                digest.update(data.getBytes("UTF8"));
                byte[] bytes =(byte[])(Object) digest.digest();
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < bytes.length; i++) {
                    int aByte = bytes[i];
                    if (aByte < 0) aByte += 256;
                    if (aByte < 16) sb.append('0');
                    sb.append(Integer.toHexString(aByte));
                }
                return sb.toString();
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}
