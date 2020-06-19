import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c6296285 {
public static MyHelperClass LogMgr;
//public MyHelperClass LogMgr;
	public static MyHelperClass convert(byte[] o0){ return null; }
//public MyHelperClass convert(byte[] o0){ return null; }

    public static final String digest(String credentials, String algorithm, String encoding) {
        try {
            MessageDigest md = (MessageDigest) MessageDigest.getInstance(algorithm).clone();
            if (encoding == null) {
                md.update(credentials.getBytes());
            } else {
                md.update(credentials.getBytes(encoding));
            }
            return ((String)(Object)convert(md.digest()));
        } catch (Exception ex) {
            LogMgr.err("Crypto.digest " + ex.toString());
            return credentials;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass err(String o0){ return null; }}
