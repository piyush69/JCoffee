import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20019846 {

    public static byte[] downloadHttpFile(String url) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) throw new IOException("Invalid HTTP response: " + responseCode + " for url " + conn.getURL());
        InputStream in = conn.getInputStream();
        try {
            MyHelperClass Utilities = new MyHelperClass();
            return(byte[])(Object) Utilities.getInputBytes(in);
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputBytes(InputStream o0){ return null; }}
