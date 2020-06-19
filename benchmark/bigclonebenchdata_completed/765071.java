import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c765071 {

    public static void testString(String string, String expected)  throws Throwable {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes(), 0, string.length());
            String result = toString(md.digest());
            System.out.println(expected);
            System.out.println(result);
            if (!expected.equals(result)) System.out.println("NOT EQUAL!");
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Object {

public MyHelperClass toString(byte[] o0){ return null; }}
