import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2440033 {
public MyHelperClass m_bfish;

    public  void Blowfish(String password)  throws Throwable {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
        m_bfish =(MyHelperClass)(Object) new BlowfishCBC(digest.digest(), 0);
        digest.reset();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BlowfishCBC {

BlowfishCBC(byte[] o0, int o1){}
	BlowfishCBC(){}}
