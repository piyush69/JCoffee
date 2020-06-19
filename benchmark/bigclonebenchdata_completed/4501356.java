import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4501356 {
public static MyHelperClass removeWhitespaces(String o0){ return null; }
//public MyHelperClass removeWhitespaces(String o0){ return null; }

    static String calculateProfileDiffDigest(String profileDiff, boolean normaliseWhitespace) throws Exception {
        if (normaliseWhitespace) {
            profileDiff =(String)(Object) removeWhitespaces(profileDiff);
        }
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(profileDiff.getBytes());
        return (String)(Object)new BASE64Encoder().encode(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
