import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18820148 {

    public static String MD5ToString(String md5) {
        String hashword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(md5.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            hashword = hash.toString(16);
        } catch (NoSuchAlgorithmException nsae) {
        }
        return hashword;
    }

}
