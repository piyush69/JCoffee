import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19621772 {
public MyHelperClass password;

    public String gen() {
        String plainText =(String)(Object) this.password;
        MessageDigest mdAlgorithm;
        StringBuffer hexString = new StringBuffer();
        try {
            mdAlgorithm = MessageDigest.getInstance("MD5");
            mdAlgorithm.update(plainText.getBytes());
            byte[] digest = mdAlgorithm.digest();
            for (int i = 0; i < digest.length; i++) {
                plainText = Integer.toHexString(0xFF & digest[i]);
                if (plainText.length() < 2) plainText = "0" + plainText;
                hexString.append(plainText);
            }
        } catch (NoSuchAlgorithmException ex) {
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
