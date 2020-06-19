import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12940372 {
public MyHelperClass getLogger(){ return null; }

    private String encryptPassword(String password)  throws Throwable {
        String result = password;
        if (password != null) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.reset();
                md5.update(password.getBytes());
                BigInteger hash = new BigInteger(1, md5.digest());
                result = hash.toString(16);
                if ((result.length() % 2) != 0) {
                    result = "0" + result;
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                getLogger().error("Cannot generate MD5", e);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }}
