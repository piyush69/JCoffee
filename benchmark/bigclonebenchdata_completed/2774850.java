import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2774850 {
public MyHelperClass url;

    protected Scanner loadSource(String country) {
        MyHelperClass httpProxy = new MyHelperClass();
        if (httpProxy != null && (boolean)(Object)httpProxy.isEnabled()) {
            System.setProperty("proxySet", "true");
//            MyHelperClass httpProxy = new MyHelperClass();
            System.setProperty("http.proxyHost",(String)(Object) httpProxy.getUrl());
//            MyHelperClass httpProxy = new MyHelperClass();
            System.setProperty("http.proxyPort", Integer.toString((int)(Object)httpProxy.getPort()));
        }
        try {
            URL url = new URL(this.url + country);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            return new Scanner(connection.getInputStream());
        } catch (MalformedURLException e) {
            return null;
        } catch (ProtocolException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass isEnabled(){ return null; }
	public MyHelperClass getPort(){ return null; }}
