import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2801437 {

    public static String encryptMD5(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            byte[] hash = md5.digest();
            md5.reset();
            MyHelperClass Format = new MyHelperClass();
            return(String)(Object) Format.hashToHex(hash);
        } catch (java.security.NoSuchAlgorithmException nsae0) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass hashToHex(byte[] o0){ return null; }}
