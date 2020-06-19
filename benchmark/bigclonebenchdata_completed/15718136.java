import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15718136 {

    protected URLConnection getConnection(String uri, String data) throws Throwable, MalformedURLException, IOException {
        URL url = new URL(uri);
        URLConnection conn = url.openConnection();
        MyHelperClass MINUTE = new MyHelperClass();
        conn.setConnectTimeout((int)(int)(Object) MINUTE / 2);
//        MyHelperClass MINUTE = new MyHelperClass();
        conn.setReadTimeout((int)(int)(Object) MINUTE / 2);
        return conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
