import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3469470 {
public static MyHelperClass hexDigit(byte o0){ return null; }
//public MyHelperClass hexDigit(byte o0){ return null; }

    public static String encrypt(String text) {
        char[] toEncrypt = text.toCharArray();
        StringBuffer hexString = new StringBuffer();
        try {
            MessageDigest dig = MessageDigest.getInstance("MD5");
            dig.reset();
            String pw = "";
            for (int i = 0; i < toEncrypt.length; i++) {
                pw += toEncrypt[i];
            }
            dig.update(pw.getBytes());
            byte[] digest = dig.digest();
            int digestLength = digest.length;
            for (int i = 0; i < digestLength; i++) {
                hexString.append(hexDigit(digest[i]));
            }
        } catch (java.security.NoSuchAlgorithmException ae) {
            ae.printStackTrace();
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
