import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3435856 {

    public static byte[] encrypt(String string) {
        java.security.MessageDigest messageDigest = null;
        try {
            messageDigest = java.security.MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException exc) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal(exc);
            throw new RuntimeException();
        }
        messageDigest.reset();
        messageDigest.update(string.getBytes());
        return messageDigest.digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(NoSuchAlgorithmException o0){ return null; }}
