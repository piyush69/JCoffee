import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9456659 {

    public static String getHash(String text)  throws Throwable {
        if (text == null) return null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            byte[] hashedTextBytes = md.digest();
            BigInteger hashedTextBigInteger = new BigInteger(1, hashedTextBytes);
            String hashedTextString = hashedTextBigInteger.toString(16);
            return hashedTextString;
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.warning(e.toString());
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }}
