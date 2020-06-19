import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13746035 {

    public static final String Digest(String credentials, String algorithm, String encoding) {
        try {
            MessageDigest md = (MessageDigest) MessageDigest.getInstance(algorithm).clone();
            if (encoding == null) {
                md.update(credentials.getBytes());
            } else {
                md.update(credentials.getBytes(encoding));
            }
            MyHelperClass HexUtils = new MyHelperClass();
            return ((String)(Object)HexUtils.convert(md.digest()));
        } catch (Exception ex) {
            MyHelperClass log = new MyHelperClass();
            log.error(ex);
            return credentials;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass convert(byte[] o0){ return null; }}
