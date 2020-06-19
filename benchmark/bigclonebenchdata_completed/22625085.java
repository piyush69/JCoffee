import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22625085 {
public MyHelperClass bufferToHex(byte[] o0, int o1, int o2){ return null; }

//    @Transient
    private String md5sum(String text)  throws Throwable {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.reset();
            md.update(text.getBytes());
            byte messageDigest[] = md.digest();
            return(String)(Object) bufferToHex(messageDigest, 0, messageDigest.length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Transient {

}
