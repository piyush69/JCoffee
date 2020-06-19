import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5610546 {
public static MyHelperClass Log;
//public MyHelperClass Log;

    public static String md5(String text)  throws Throwable {
        String hashed = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(text.getBytes(), 0, text.length());
            hashed = new BigInteger(1, digest.digest()).toString(16);
        } catch (Exception e) {
            MyHelperClass ctGlobal = new MyHelperClass();
            Log.e(ctGlobal.tag, "ctCommon.md5: " + e.toString());
        }
        return hashed;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass tag;
public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}
