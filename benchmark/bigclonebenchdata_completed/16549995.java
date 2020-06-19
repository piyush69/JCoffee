import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16549995 {

    public static String mysqlPasswordHash(String string)  throws Throwable {
        try {
            MyHelperClass HashAlgorithms = new MyHelperClass();
            MessageDigest digest = MessageDigest.getInstance((String)(Object)HashAlgorithms.SHA1);
            try {
                digest.update(string.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            byte[] encodedPassword = digest.digest();
            digest.update(encodedPassword);
            encodedPassword = digest.digest();
            String hash = new BigInteger(1, encodedPassword).toString(16).toUpperCase();
            while (hash.length() < 40) {
                hash = "0" + hash;
            }
            return "*" + hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHA1;
}
