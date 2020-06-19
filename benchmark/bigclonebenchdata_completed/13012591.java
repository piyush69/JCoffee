import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13012591 {

    protected String getPasswordHash(String password)  throws Throwable {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("MD5 algorithm not found", e);
            throw new ServiceException((String)(Object)e);
        }
        md.update(password.getBytes());
        byte[] hash = md.digest();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            buf.append(Integer.toHexString(hash[i] & 0xff));
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}
