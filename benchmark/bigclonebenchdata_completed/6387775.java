import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6387775 {

    public static String hashSHA1(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(value.getBytes());
            BigInteger hash = new BigInteger(1, digest.digest());
            return hash.toString(16);
        } catch (NoSuchAlgorithmException e) {
        }
        return null;
    }

}
