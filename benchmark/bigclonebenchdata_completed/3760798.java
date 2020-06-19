import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3760798 {
public MyHelperClass newPassword;
	public MyHelperClass setUserPassword(byte[] o0){ return null; }
	public MyHelperClass firePropertyChange(String o0, String o1, String o2){ return null; }
	public MyHelperClass getUserPassword(){ return null; }

    public void setNewPassword(String password)  throws Throwable {
        try {
            final MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            MyHelperClass Base64Encoder = new MyHelperClass();
            final String encrypted = "{MD5}" + new String((String)(Object)Base64Encoder.encode(digest.digest()));
            setUserPassword(encrypted.getBytes());
            this.newPassword =(MyHelperClass)(Object) password;
            firePropertyChange("newPassword", "", password);
            firePropertyChange("password",(String)(Object) new byte[0],(String)(Object) getUserPassword());
        } catch (final NoSuchAlgorithmException e) {
            throw new RuntimeException("Can't encrypt user's password", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }}
