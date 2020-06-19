import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15741989 {

    public String encrypt(String password)  throws Throwable {
        if (password.length() == 40) {
            return password;
        }
        MyHelperClass salt = new MyHelperClass();
        if (salt != null) {
//            MyHelperClass salt = new MyHelperClass();
            password = password + salt;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
        messageDigest.reset();
        messageDigest.update(password.getBytes());
        final byte[] bytes = messageDigest.digest();
        String encrypted = new BigInteger(1, bytes).toString(16);
        if (encrypted.length() < 40) {
            final StringBuilder builder = new StringBuilder(encrypted);
            while (builder.length() < 40) {
                builder.insert(0, '0');
            }
            encrypted = builder.toString();
        }
        return encrypted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
