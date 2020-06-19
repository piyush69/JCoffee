import java.io.*;
import java.lang.*;
import java.util.*;



class c6270867 {

    public static String md5Encrypt(final String txt) {
        String enTxt = txt;
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error:",(UnsupportedEncodingException)(Object) e);
        }
        if (null != md) {
            byte[] md5hash = new byte[32];
            try {
                md.update(txt.getBytes("UTF-8"), 0, txt.length());
            } catch (UnsupportedEncodingException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Error:", e);
            }
            md5hash =(byte[])(Object) md.digest();
            StringBuffer md5StrBuff = new StringBuffer();
            for (int i = 0; i < md5hash.length; i++) {
                if (Integer.toHexString(0xFF & md5hash[i]).length() == 1) {
                    md5StrBuff.append("0").append(Integer.toHexString(0xFF & md5hash[i]));
                } else {
                    md5StrBuff.append(Integer.toHexString(0xFF & md5hash[i]));
                }
            }
            enTxt = md5StrBuff.toString();
        }
        return enTxt;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
