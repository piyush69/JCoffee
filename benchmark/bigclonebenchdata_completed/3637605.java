import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3637605 {
public MyHelperClass model;
public MyHelperClass login;

    public void actionPerformed(ActionEvent e) {
        String digest = null;
        try {
            MessageDigest m = MessageDigest.getInstance("sha1");
            m.reset();
            String pw = String.copyValueOf((char[])(Object)this.login.getPassword());
            m.update(pw.getBytes());
            byte[] digestByte = m.digest();
            BigInteger bi = new BigInteger(digestByte);
            digest = bi.toString();
            System.out.println(digest);
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }
        this.model.login(this.login.getHost(), this.login.getPort(), this.login.getUser(), digest);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getUser(){ return null; }}

class ActionEvent {

}

class BigInteger {

BigInteger(byte[] o0){}
	BigInteger(){}}
