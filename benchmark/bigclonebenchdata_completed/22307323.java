import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22307323 {

    public static String cryptSha(String target) throws Throwable, NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(target.getBytes("UTF-16"));
        MyHelperClass key = new MyHelperClass();
        BigInteger res = new BigInteger(1, md.digest((byte[])(Object)key.getBytes()));
        return res.toString(16);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }}
