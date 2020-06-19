import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18292115 {
public static MyHelperClass pad(String o0, int o1, char o2){ return null; }
//public MyHelperClass pad(String o0, int o1, char o2){ return null; }

    public static String hashString(String password)  throws Throwable {
        String hashword = null;
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA");
            sha.update(password.getBytes("UTF-8"));
            BigInteger hash = new BigInteger(1, sha.digest());
            hashword = hash.toString(16);
        } catch (NoSuchAlgorithmException nsae) {
            MyHelperClass log = new MyHelperClass();
            log.error(nsae);
        } catch (UnsupportedEncodingException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e);
        }
        return(String)(Object) pad(hashword, 32, '0');
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(UnsupportedEncodingException o0){ return null; }
	public MyHelperClass error(NoSuchAlgorithmException o0){ return null; }}
