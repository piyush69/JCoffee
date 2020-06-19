import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2241900 {

    public static String hashMD5(String entrada) {
        MessageDigest m;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(entrada.getBytes(), 0, entrada.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
