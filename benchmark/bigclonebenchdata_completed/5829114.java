import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5829114 {
public MyHelperClass log;

    private final String encryptPassword(String pass) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Error while obtaining decript algorithm", e);
            throw new RuntimeException("AccountData.encryptPassword()");
        }
        try {
            md.update(pass.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.WARNING, "Problem with decript algorithm occured.", e);
            throw new RuntimeException("AccountData.encryptPassword()");
        }
        return (String)(Object)new BASE64Encoder().encode(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, UnsupportedEncodingException o2){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
