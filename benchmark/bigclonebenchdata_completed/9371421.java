import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9371421 {

    public static String eventHash(String eventstr) {
        try {
            MyHelperClass md = new MyHelperClass();
            if (md == null) {
//                MyHelperClass md = new MyHelperClass();
                md =(MyHelperClass)(Object) MessageDigest.getInstance("MD5");
            }
//            MyHelperClass md = new MyHelperClass();
            md.update(eventstr.getBytes("utf-8"));
//            MyHelperClass md = new MyHelperClass();
            byte[] theDigest =(byte[])(Object) md.digest();
            return (String)(Object)new BASE64Encoder().encode(theDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
