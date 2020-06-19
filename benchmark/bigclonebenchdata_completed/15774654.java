import java.io.*;
import java.lang.*;
import java.util.*;



class c15774654 {
public static MyHelperClass MessageDigest;
//public MyHelperClass MessageDigest;

    public static synchronized String getMD5_Base64(final String input) {
        MyHelperClass isInited = new MyHelperClass();
        if ((boolean)(Object)isInited == false) {
//            MyHelperClass isInited = new MyHelperClass();
            isInited =(MyHelperClass)(Object) true;
            try {
                MyHelperClass digest = new MyHelperClass();
                digest = MessageDigest.getInstance("MD5");
            } catch (Exception ex) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Cannot get MessageDigest. Application may fail to run correctly.", ex);
            }
        }
        MyHelperClass digest = new MyHelperClass();
        if (digest == null) {
            return input;
        }
        try {
//            MyHelperClass digest = new MyHelperClass();
            digest.update(input.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Assertion: This should never occur.");
        }
//        MyHelperClass digest = new MyHelperClass();
        byte[] rawData =(byte[])(Object) digest.digest();
        byte[] encoded =(byte[])(Object) Base64.encode(rawData);
        String retValue = new String(encoded);
        return retValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }}
