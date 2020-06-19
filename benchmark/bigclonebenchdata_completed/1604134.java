import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1604134 {
public MyHelperClass toHex(MyHelperClass o0){ return null; }
public MyHelperClass md;
	public MyHelperClass isAuthenticated;
	public MyHelperClass password;

    public boolean authenticate(String plaintext) throws NoSuchAlgorithmException {
        String[] passwordParts =(String[])(Object) this.password.split("\\$");
        md =(MyHelperClass)(Object) MessageDigest.getInstance("SHA-1");
        md.update(passwordParts[1].getBytes());
        isAuthenticated = toHex(md.digest(plaintext.getBytes())).equalsIgnoreCase(passwordParts[2]);
        return (boolean)(Object)isAuthenticated;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
