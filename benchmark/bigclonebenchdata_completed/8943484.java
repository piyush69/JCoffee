import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8943484 {

    public BufferedImage getImage(String urlStr) throws Throwable, IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        MyHelperClass transport = new MyHelperClass();
        if ((REST)(Object)transport instanceof REST) {
//            MyHelperClass transport = new MyHelperClass();
            if ((boolean)(Object)((REST)(REST)(Object) transport).isProxyAuth()) {
//                MyHelperClass transport = new MyHelperClass();
                conn.setRequestProperty("Proxy-Authorization", "Basic " + ((REST)(REST)(Object) transport).getProxyCredentials());
            }
        }
        conn.connect();
        InputStream in = null;
        try {
            in = conn.getInputStream();
            MyHelperClass ImageIO = new MyHelperClass();
            return(BufferedImage)(Object) ImageIO.read(in);
        } finally {
            MyHelperClass IOUtilities = new MyHelperClass();
            IOUtilities.close(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(InputStream o0){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }}

class BufferedImage {

}

class REST {

public MyHelperClass getProxyCredentials(){ return null; }
	public MyHelperClass isProxyAuth(){ return null; }}
