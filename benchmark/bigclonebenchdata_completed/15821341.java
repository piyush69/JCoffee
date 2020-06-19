import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15821341 {
public MyHelperClass Base64Encoder;
public MyHelperClass username;
public MyHelperClass password;
	public MyHelperClass authCode;

    public void update()  throws Throwable {
        try {
            String passwordMD5 = new String();
            if (this.password != null &&(int)(Object) this.password.length() > 0) {
                MessageDigest md = MessageDigest.getInstance("md5");
                md.update((byte)(Object)this.password.getBytes());
                byte[] digest = md.digest();
                for (int i = 0; i < digest.length; i++) {
                    passwordMD5 += Integer.toHexString((digest[i] >> 4) & 0xf);
                    passwordMD5 += Integer.toHexString((digest[i] & 0xf));
                }
            }
            this.authCode =(MyHelperClass)(Object) new String((String)(Object)Base64Encoder.encode(new String(this.username + ";" + passwordMD5).getBytes()));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}
