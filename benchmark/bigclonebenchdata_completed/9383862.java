import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9383862 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static String md5It(String data) {
        MessageDigest digest;
        String output = "";
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(data.getBytes());
            byte[] hash = digest.digest();
            for (byte b : hash) {
                output = output + String.format("%02X", b);
            }
        } catch (NoSuchAlgorithmException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }}
