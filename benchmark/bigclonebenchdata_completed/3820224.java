import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3820224 {

    private String hashString(String key) {
        MessageDigest digest;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(key.getBytes());
            byte[] hash = digest.digest();
            BigInteger bi = new BigInteger(1, hash);
            MyHelperClass KERNEL_VERSION = new MyHelperClass();
            return String.format("%0" + (hash.length << 1) + "X", bi) + KERNEL_VERSION;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "" + key.hashCode();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BigInteger {

BigInteger(int o0, byte[] o1){}
	BigInteger(){}}
