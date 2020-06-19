import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3573436 {
public MyHelperClass _password;

    public HttpURLConnection getConnection(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = null;
        MyHelperClass _proxy = new MyHelperClass();
        if (_proxy == null) {
            connection = (HttpURLConnection) url.openConnection();
        } else {
//            MyHelperClass _proxy = new MyHelperClass();
            URLConnection con = url.openConnection((Proxy)(Object)_proxy);
            MyHelperClass _username = new MyHelperClass();
            String encodedUserPwd = new String((String)(Object)Base64.encodeBase64((_username + ":" + _password).getBytes()));
            con.setRequestProperty("Proxy-Authorization", "Basic " + encodedUserPwd);
            connection = (HttpURLConnection) con;
        }
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}
