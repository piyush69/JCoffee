import java.io.*;
import java.lang.*;
import java.util.*;



class c6317842 {

    public static String MD5(String str, String encoding) {
        MessageDigest messageDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        messageDigest.reset();
        try {
            messageDigest.update(str.getBytes(encoding));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] byteArray =(byte[])(Object) messageDigest.digest();
        StringBuffer md5StrBuff = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1) md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i])); else md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
        }
        return md5StrBuff.toString();
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
