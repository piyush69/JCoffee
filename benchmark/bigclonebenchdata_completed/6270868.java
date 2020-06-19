import java.io.*;
import java.lang.*;
import java.util.*;



class c6270868 {

    public static String shaEncrypt(final String txt) {
        String enTxt = txt;
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error:",(UnsupportedEncodingException)(Object) e);
        }
        if (null != md) {
            byte[] shahash = new byte[32];
            try {
                md.update(txt.getBytes("UTF-8"), 0, txt.length());
            } catch (UnsupportedEncodingException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Error:", e);
            }
            shahash =(byte[])(Object) md.digest();
            StringBuffer md5StrBuff = new StringBuffer();
            for (int i = 0; i < shahash.length; i++) {
                if (Integer.toHexString(0xFF & shahash[i]).length() == 1) {
                    md5StrBuff.append("0").append(Integer.toHexString(0xFF & shahash[i]));
                } else {
                    md5StrBuff.append(Integer.toHexString(0xFF & shahash[i]));
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
