import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16167361 {

    public long getMD5Hash(String str) {
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        m.update(str.getBytes(), 0, str.length());
        return (long)(Object)new BigInteger(1, m.digest()).longValue();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BigInteger {

BigInteger(int o0, byte[] o1){}
	BigInteger(){}
	public MyHelperClass longValue(){ return null; }}
