import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10715600 {

    public static synchronized String toMD5(String str)  throws Throwable {
        MyHelperClass Nulls = new MyHelperClass();
        Nulls.failIfNull(str, "Cannot create an MD5 encryption form a NULL string");
        String hashword = null;
        try {
            MyHelperClass MD5 = new MyHelperClass();
            MessageDigest md5 = MessageDigest.getInstance((String)(Object)MD5);
            md5.update(str.getBytes());
            BigInteger hash = new BigInteger(1, md5.digest());
            hashword = hash.toString(16);
            MyHelperClass Strings = new MyHelperClass();
            return(String)(Object) Strings.padLeft(hashword, 32, "0");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return hashword;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass padLeft(String o0, int o1, String o2){ return null; }
	public MyHelperClass failIfNull(String o0, String o1){ return null; }}
