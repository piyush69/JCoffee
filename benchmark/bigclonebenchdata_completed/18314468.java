import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18314468 {

    public static String hash(String str) {
        MessageDigest summer;
        try {
            summer = MessageDigest.getInstance("md5");
            summer.update(str.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            return null;
        }
        BigInteger hash = new BigInteger(1, summer.digest());
        String hashword = hash.toString(16);
        return hashword;
    }

}
