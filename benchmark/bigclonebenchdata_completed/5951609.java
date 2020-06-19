import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5951609 {
public MyHelperClass toHex(byte[] o0){ return null; }

    public void testCryptHash() {
        MyHelperClass Log = new MyHelperClass();
        Log.v("Test", "[*] testCryptHash()");
        String testStr = "Hash me";
        byte messageDigest[];
        MessageDigest digest = null;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(testStr.getBytes());
            messageDigest = digest.digest();
            digest.digest(testStr.getBytes());
            digest = java.security.MessageDigest.getInstance("SHA1");
            digest.update(testStr.getBytes());
            messageDigest = digest.digest();
            digest = null;
            digest = java.security.MessageDigest.getInstance("SHA1");
            MyHelperClass imei = new MyHelperClass();
            digest.update((byte)(Object)imei.getBytes());
            messageDigest = digest.digest();
            MyHelperClass hashedImei = new MyHelperClass();
            hashedImei = this.toHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass v(String o0, String o1){ return null; }
	public MyHelperClass getBytes(){ return null; }}
