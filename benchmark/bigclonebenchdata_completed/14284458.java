import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14284458 {

    private String md5(String txt) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(txt.getBytes(), 0, txt.length());
            return new BigInteger(1, m.digest()).toString(16);
        } catch (Exception e) {
            return "BAD MD5";
        }
    }

}
