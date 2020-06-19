import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18695230 {

    public static synchronized String encrypt(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(text.getBytes("UTF-8"));
        byte raw[] = md.digest();
        return (String)(Object)new Base64(-1).encodeToString(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Base64 {

Base64(int o0){}
	Base64(){}
	public MyHelperClass encodeToString(byte[] o0){ return null; }}
