import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9796161 {

    public static String getMD5(String s)  throws Throwable {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            return "" + new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("MD5 is not supported !!!");
        }
        return s;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}
