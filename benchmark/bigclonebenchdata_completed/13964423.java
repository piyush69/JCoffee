import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13964423 {

    private String signMethod()  throws Throwable {
        MyHelperClass API = new MyHelperClass();
        String str =(String)(Object) API.SHARED_SECRET;
        MyHelperClass parameters = new MyHelperClass();
        Vector<String> v = new Vector<String>((int)(Object)parameters.keySet());
        Collections.sort(v);
        for (String key : v) {
//            MyHelperClass parameters = new MyHelperClass();
            str += key + parameters.get(key);
        }
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes(), 0, str.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHARED_SECRET;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}
