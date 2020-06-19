import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13940356 {
public static MyHelperClass prepad(String o0, int o1, char o2){ return null; }
//public MyHelperClass prepad(String o0, int o1, char o2){ return null; }

    public static String md5(String s)  throws Throwable {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte[] md5sum = digest.digest();
            BigInteger bigInt = new BigInteger(1, md5sum);
            String output = bigInt.toString(16);
            return(String)(Object) prepad(output, 32, '0');
        } catch (NoSuchAlgorithmException e) {
            System.err.println("No MD5 algorithm. we are sunk.");
            return s;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
