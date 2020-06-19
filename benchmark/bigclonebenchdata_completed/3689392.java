import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3689392 {

    public static String encrypt(String plaintext) throws Exception {
        MyHelperClass XML = new MyHelperClass();
        String algorithm =(String)(Object) XML.get("security.algorithm");
        if (algorithm == null) algorithm = "SHA-1";
        MessageDigest md = MessageDigest.getInstance(algorithm);
        md.update(plaintext.getBytes("UTF-8"));
        return (String)(Object)new BASE64Encoder().encode(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
