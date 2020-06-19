import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8372919 {

    private String MD5(String s)  throws Throwable {
        MyHelperClass Log = new MyHelperClass();
        Log.d("MD5", "Hashing '" + s + "'");
        String hash = "";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            hash = new BigInteger(1, m.digest()).toString(16);
//            MyHelperClass Log = new MyHelperClass();
            Log.d("MD5", "Hash: " + hash);
        } catch (Exception e) {
//            MyHelperClass Log = new MyHelperClass();
            Log.e("MD5", e.getMessage());
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}
