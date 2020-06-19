import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5725178 {
public MyHelperClass base64Encode(MyHelperClass o0){ return null; }
public MyHelperClass username;

    protected HttpURLConnection openConnection(final String url) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setInstanceFollowRedirects(true);
        MyHelperClass userAgent = new MyHelperClass();
        connection.setRequestProperty("User-Agent",(String)(Object) userAgent);
        connection.setRequestProperty("Accept", "application/xhtml+xml,application/xml,text/xml;q=0.9,*/*;q=0.8");
        connection.setRequestProperty("Accept-Language", "ja,en-us;q=0.7,en;q=0.3");
        connection.setRequestProperty("Accept-Encoding", "deflate");
        connection.setRequestProperty("Accept-Charset", "utf-8");
        MyHelperClass password = new MyHelperClass();
        connection.setRequestProperty("Authorization", "Basic ".concat((String)(Object)base64Encode((username.concat(":").concat((String)(Object)password)).getBytes("UTF-8"))));
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass concat(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }}
