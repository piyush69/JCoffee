import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16038356 {
public static MyHelperClass Hex;
//public MyHelperClass Hex;

    public static String md5hash(String text) {
        java.security.MessageDigest md;
        try {
            md = java.security.MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(text.getBytes());
        byte[] md5bytes = md.digest();
        return new String((String)(Object)Hex.encodeHex(md5bytes));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeHex(byte[] o0){ return null; }}
