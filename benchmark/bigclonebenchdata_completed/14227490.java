import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14227490 {

    private HttpURLConnection getConnection(String url, int connTimeout, int readTimeout) throws IOException {
        HttpURLConnection con = null;
        con = (HttpURLConnection) new URL(url).openConnection();
        if (connTimeout > 0) {
            MyHelperClass isJDK14orEarlier = new MyHelperClass();
            if (!(Boolean)(Object)isJDK14orEarlier) {
                con.setConnectTimeout(connTimeout * 1000);
            } else {
                System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(connTimeout * 1000));
            }
        }
        if (readTimeout > 0) {
            MyHelperClass isJDK14orEarlier = new MyHelperClass();
            if (!(Boolean)(Object)isJDK14orEarlier) {
                con.setReadTimeout(readTimeout * 1000);
            } else {
                System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(readTimeout * 1000));
            }
        }
        con.setInstanceFollowRedirects(false);
        return con;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
