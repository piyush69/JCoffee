import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1097146 {

    public static String getMessageDigest(String input) {
        if (input == null) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Returning SHA-1 null value for null input");
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(input.getBytes("UTF-8"));
            byte[] bytes = md.digest();
            return (String)(Object)new BASE64Encoder().encode(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
