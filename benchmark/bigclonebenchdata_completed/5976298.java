import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5976298 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static String generateMD5(String str)  throws Throwable {
        String hashword = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            hashword = hash.toString(16);
        } catch (NoSuchAlgorithmException nsae) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, null, nsae);
        }
        return hashword;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, NoSuchAlgorithmException o2){ return null; }}
