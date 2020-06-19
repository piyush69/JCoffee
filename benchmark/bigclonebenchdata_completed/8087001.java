import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8087001 {
public static MyHelperClass keys;
	public static MyHelperClass generatedIterStackHashKey(String o0){ return null; }
	public static MyHelperClass getStackTrace(Exception o0){ return null; }
//public MyHelperClass keys;
//	public MyHelperClass generatedIterStackHashKey(String o0){ return null; }
//	public MyHelperClass getStackTrace(Exception o0){ return null; }

    public static String generateStackHashKey() {
        Exception e = null;
        try {
            throw new Exception();
        } catch (Exception ex) {
            e = ex;
        }
        MessageDigest digest;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update((byte)(Object)getStackTrace(e).getBytes());
            byte[] hash = digest.digest();
            String rtn =(String)(Object) Base64.encode(new String(hash));
            if ((boolean)(Object)keys.contains(rtn)) {
                return(String)(Object) generatedIterStackHashKey(rtn);
            }
            keys.add(rtn);
            return rtn;
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Base64 {

public static MyHelperClass encode(String o0){ return null; }}
