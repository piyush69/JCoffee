import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14843583 {

    public static String encryptSHA(String pwd) throws NoSuchAlgorithmException {
        MessageDigest d = java.security.MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(pwd.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        return(String)(Object) encoder.encode(d.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
