import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4417164 {
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }

    private InputStream connectURL(String aurl) throws IOException {
        InputStream in = null;
        int response = -1;
        URL url = new URL(aurl);
        URLConnection conn = url.openConnection();
        if (!(conn instanceof HttpURLConnection)) throw new IOException("Not an HTTP connection.");
        HttpURLConnection httpConn = (HttpURLConnection) conn;
        response =(int)(Object) getResponse(httpConn);
        if (response == HttpURLConnection.HTTP_OK) {
            in = httpConn.getInputStream();
        } else throw new IOException("Response Code: " + response);
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
