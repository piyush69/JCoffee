import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1371876 {

    private HttpURLConnection getConnection() throws IOException {
        MyHelperClass url = new MyHelperClass();
        HttpURLConnection conn = (HttpURLConnection) new URL((String)(Object)url).openConnection();
        MyHelperClass method = new MyHelperClass();
        conn.setRequestMethod((String)(Object)method);
        conn.setDoOutput(true);
        conn.setDoInput(true);
        MyHelperClass cookie = new MyHelperClass();
        if (cookie != null) conn.setRequestProperty("Cookie",(String)(Object) cookie);
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        MyHelperClass Constants = new MyHelperClass();
        conn.setRequestProperty("User-Agent",(String)(Object) Constants.USER_AGENT());
        conn.connect();
        MyHelperClass parameters = new MyHelperClass();
        if (!parameters.equals("")) {
            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
//            MyHelperClass parameters = new MyHelperClass();
            out.writeBytes((String)(Object)parameters);
            out.flush();
            out.close();
        }
        return conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass USER_AGENT(){ return null; }}
