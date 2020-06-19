import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2911006 {

    protected String encrypt(String text)  throws Throwable {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA");
            md.update(text.getBytes("UTF-8"));
            byte raw[] = md.digest();
            String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
            return hash;
        } catch (Exception ex) {
            throw new TiiraException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class TiiraException extends Exception{
	public TiiraException(String errorMessage) { super(errorMessage); }
}
