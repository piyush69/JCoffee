import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1426634 {

//    @Override
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        if (null == url) {
            MyHelperClass Messages = new MyHelperClass();
            throw new IllegalArgumentException((String)(Object)Messages.getString("luni.1B"));
        }
        String host = url.getHost();
        if (host == null || host.length() == 0 || host.equalsIgnoreCase("localhost")) {
            return (URLConnection)(Object)new FileURLConnection(url);
        }
        URL ftpURL = new URL("ftp", host, url.getFile());
        return (proxy == null) ? ftpURL.openConnection() : ftpURL.openConnection(proxy);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class FileURLConnection {

FileURLConnection(URL o0){}
	FileURLConnection(){}}
