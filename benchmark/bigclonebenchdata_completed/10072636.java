import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10072636 {
public MyHelperClass m_bfish;
	public MyHelperClass Log;

    public  void Blowfish(String password)  throws Throwable {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes());
        } catch (Exception e) {
            Log.error(e.getMessage(), e);
        }
        m_bfish =(MyHelperClass)(Object) new BlowfishCBC(digest.digest(), 0);
        digest.reset();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }}

class BlowfishCBC {

BlowfishCBC(byte[] o0, int o1){}
	BlowfishCBC(){}}
