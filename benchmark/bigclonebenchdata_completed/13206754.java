import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13206754 {

    public static String md5Encrypt(String valueToEncrypted) {
        String encryptedValue = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(valueToEncrypted.getBytes());
            BigInteger hash = new BigInteger(1, digest.digest());
            encryptedValue = hash.toString(16);
        } catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return encryptedValue;
    }

}
