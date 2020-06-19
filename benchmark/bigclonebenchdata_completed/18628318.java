import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18628318 {

    public static String generateDigest(String message, String DigestAlgorithm) {
        try {
            MessageDigest md = MessageDigest.getInstance(DigestAlgorithm);
            md.update(message.getBytes(), 0, message.length());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException nsae) {
            return null;
        }
    }

}
