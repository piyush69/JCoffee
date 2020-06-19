import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3931480 {

    public final String encrypt(final String plaintext, final String salt)  throws Throwable {
        if (plaintext == null) {
            throw new NullPointerException();
        }
        if (salt == null) {
            throw new NullPointerException();
        }
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA");
            md.update((plaintext + salt).getBytes("UTF-8"));
            return (String)(Object)new BASE64Encoder().encode(md.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptionException((String)(Object)e);
        } catch (UnsupportedEncodingException e) {
            throw new EncryptionException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class EncryptionException extends Exception{
	public EncryptionException(String errorMessage) { super(errorMessage); }
}
