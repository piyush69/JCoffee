import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9526428 {

    public static String hashPassword(String password)  throws Throwable {
        String passwordHash = "";
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            sha1.reset();
            sha1.update(password.getBytes());
            Base64 encoder = new Base64();
            passwordHash = new String((String)(Object)encoder.encode(sha1.digest()));
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass LoggerFactory = new MyHelperClass();
            LoggerFactory.getLogger(UmsAuthenticationProcessingFilter.class.getClass()).error("Failed to generate password hash: " + e.getMessage());
        }
        return passwordHash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getLogger(Class o0){ return null; }}

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}

class UmsAuthenticationProcessingFilter {

}
