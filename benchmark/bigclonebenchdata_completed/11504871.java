import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11504871 {
public static MyHelperClass getString(byte[] o0){ return null; }
//public MyHelperClass getString(byte[] o0){ return null; }

    public static String encrypt(String password) throws NoSuchAlgorithmException {
        java.security.MessageDigest d = null;
        d = java.security.MessageDigest.getInstance("MD5");
        d.reset();
        d.update(password.getBytes());
        byte[] cr = d.digest();
        return(String)(Object) getString(cr).toLowerCase();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toLowerCase(){ return null; }}
