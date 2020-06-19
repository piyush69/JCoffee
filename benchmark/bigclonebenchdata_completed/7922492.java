import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7922492 {

    protected String calcAuthResponse(String challenge) throws Throwable, NoSuchAlgorithmException {
        MyHelperClass securityPolicy = new MyHelperClass();
        MessageDigest md = MessageDigest.getInstance(securityPolicy);
        md.update(challenge.getBytes());
        MyHelperClass password = new MyHelperClass();
        for (int i = 0, n = password.length; i < n; i++) {
            MyHelperClass password = new MyHelperClass();
            md.update((byte) password[i]);
        }
        byte[] digest = md.digest();
        StringBuffer digestText = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            int v = (digest[i] < 0) ? digest[i] + 256 : digest[i];
            String hex = Integer.toHexString(v);
            if (hex.length() == 1) {
                digestText.append("0");
            }
            digestText.append(hex);
        }
        return digestText.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
