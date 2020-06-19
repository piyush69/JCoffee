import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19121580 {
public static MyHelperClass toHexString(byte[] o0){ return null; }
//public MyHelperClass toHexString(byte[] o0){ return null; }

    public static String toMd5(String s) {
        String res = "";
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();
            res =(String)(Object) toHexString(messageDigest);
        } catch (NoSuchAlgorithmException e) {
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
