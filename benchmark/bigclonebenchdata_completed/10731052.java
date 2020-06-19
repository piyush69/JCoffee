import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10731052 {
public MyHelperClass getTileUrl(int o0, int o1, int o2){ return null; }

    public HttpURLConnection getTileUrlConnection(int zoom, int tilex, int tiley) throws IOException {
        String url =(String)(Object) getTileUrl(zoom, tilex, tiley);
        if (url == null) return null;
        return (HttpURLConnection) new URL(url).openConnection();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
