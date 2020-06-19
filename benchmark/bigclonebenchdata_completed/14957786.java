import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14957786 {
public MyHelperClass Level;
	public MyHelperClass logger;
	public MyHelperClass password;

    public void setPassword(String password) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes("UTF-8"));
            byte[] digest = md.digest();
            String encodedPassword =(String)(Object) Base64.encode(digest);
            this.password =(MyHelperClass)(Object) encodedPassword;
        } catch (NoSuchAlgorithmException e) {
            logger.log(Level.SEVERE, "Password creation failed", e);
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            logger.log(Level.SEVERE, "Password creation failed", e);
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, NoSuchAlgorithmException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, UnsupportedEncodingException o2){ return null; }}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }}
