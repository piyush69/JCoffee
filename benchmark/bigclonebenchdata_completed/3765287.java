import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3765287 {
public MyHelperClass setSecretKey(String o0){ return null; }

    private void initializeSecretKey() {
        MyHelperClass SystemClock = new MyHelperClass();
        String baseKey = "" + SystemClock.currentThreadTimeMillis() + new Random().nextInt();
        MessageDigest digest;
        String secretKey;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.reset();
            digest.update(baseKey.getBytes());
            byte messageDigest[] = digest.digest();
            int len = messageDigest.length;
            StringBuilder sb = new StringBuilder(len << 1);
            for (int i = 0; i < len; i++) {
                sb.append(Character.forDigit((messageDigest[i] & 0xf0) >> 4, 16));
                sb.append(Character.forDigit(messageDigest[i] & 0x0f, 16));
            }
            secretKey = sb.substring(0, 32);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        this.setSecretKey(secretKey);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass currentThreadTimeMillis(){ return null; }}
