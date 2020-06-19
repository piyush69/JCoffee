import java.io.*;
import java.lang.*;
import java.util.*;



class c20881388 {

    public static String md5(String str) {
        if (str == null) {
            System.err.println("Stringx.md5 (String) : null string.");
            return "";
        }
        String rt = "";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(str.getBytes("gb2312"));
            byte[] bt =(byte[])(Object) md5.digest();
            String s = null;
            int l = 0;
            for (int i = 0; i < bt.length; i++) {
                s = Integer.toHexString(bt[i]);
                l = s.length();
                if (l > 2) s = s.substring(l - 2, l); else if (l == 1) s = "0" + s;
                rt += s;
            }
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return rt;
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
