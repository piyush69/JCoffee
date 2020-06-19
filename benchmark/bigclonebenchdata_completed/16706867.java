import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16706867 {
public MyHelperClass setEncodedDigest(MyHelperClass o0){ return null; }
public MyHelperClass log;
	public MyHelperClass encodeFromBytes(byte[] o0){ return null; }
	public MyHelperClass formatAsHexString(byte[] o0){ return null; }

    private void prepareDigestFromTextArea() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MyHelperClass log = new MyHelperClass();
        log.println("\nCalculating digest ...\n");
        java.security.MessageDigest md5 = java.security.MessageDigest.getInstance("MD5");
        MyHelperClass dataArea = new MyHelperClass();
        md5.update((byte)(Object)dataArea.getText().getBytes("UTF8"));
        byte[] digest = md5.digest();
        log.println("digest:\n" + formatAsHexString(digest));
        log.println("Done.");
        setEncodedDigest(encodeFromBytes(digest));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}
