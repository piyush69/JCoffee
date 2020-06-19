import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10095870 {

    public String getMD5String(String par1Str)  throws Throwable {
        try {
            MyHelperClass field_27370_a = new MyHelperClass();
            String s = (new StringBuilder()).append(field_27370_a).append(par1Str).toString();
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes(), 0, s.length());
            return (new BigInteger(1, messagedigest.digest())).toString(16);
        } catch (NoSuchAlgorithmException nosuchalgorithmexception) {
            throw new RuntimeException(nosuchalgorithmexception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
