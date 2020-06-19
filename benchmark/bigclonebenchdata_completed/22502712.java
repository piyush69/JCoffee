import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22502712 {
public static MyHelperClass Log;
	public static MyHelperClass toNumeric(String o0, boolean o1, boolean o2){ return null; }
//public MyHelperClass Log;
//	public MyHelperClass toNumeric(String o0, boolean o1, boolean o2){ return null; }

    public static String crypt(String passwd, boolean pad) {
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            sha.update(passwd.getBytes());
            String c = new String(sha.digest());
            return(String)(Object) toNumeric(c, pad, true);
        } catch (java.security.NoSuchAlgorithmException e) {
            Log.error(Login.class, "couldn't crypt()", e);
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Class<Login> o0, String o1, NoSuchAlgorithmException o2){ return null; }}

class Login {

}
