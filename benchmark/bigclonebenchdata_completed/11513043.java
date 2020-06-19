import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11513043 {

    public String hash(String password)  throws Throwable {
        MessageDigest sha1Digest;
        try {
            sha1Digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass NestedException = new MyHelperClass();
            throw(Throwable)(Object) NestedException.wrap(e);
        }
        sha1Digest.update(password.getBytes());
        StringBuilder retval = new StringBuilder("sha1:");
        retval.append(new String((String)(Object)Base64.encodeBase64(sha1Digest.digest())));
        return retval.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass wrap(NoSuchAlgorithmException o0){ return null; }}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}
