import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15678668 {

    public static String hashPassword(String password)  throws Throwable {
        String hashStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            MyHelperClass Charset = new MyHelperClass();
            md5.update(password.getBytes((String)(Object)Charset.defaultCharset()));
            BigInteger hash = new BigInteger(1, md5.digest());
            hashStr = hash.toString(16);
        } catch (NoSuchAlgorithmException e) {
            return password;
        }
        StringBuilder buffer = new StringBuilder(hashStr);
        while (buffer.length() < 32) {
            buffer.insert(0, '0');
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass defaultCharset(){ return null; }}
