import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4648562 {
public MyHelperClass serverlogger;

    public String Hash(String plain)  throws Throwable {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(plain.getBytes(), 0, plain.length());
            return new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception ex) {
            serverlogger.warn("No such Hash algorithm", ex);
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Exception o1){ return null; }}
