import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c489862 {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        String text = "YUMyfj";
        md.update(text.getBytes(), 0, text.length());
        System.out.println(new BigInteger(1, md.digest()).toString(16).toString());
    }

}
