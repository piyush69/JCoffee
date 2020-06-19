import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4396970 {
public MyHelperClass httpProxyPort;
	public MyHelperClass PussycatUtils;
public MyHelperClass httpProxy;

    public HttpURLConnection proxiedURLConnection(URL url, String serverName) throws IOException, PussycatException {
        if (this.httpProxy == null || this.httpProxy.equals("") || (boolean)(Object)PussycatUtils.isLocalURL(url.toString()) || url.toString().contains(serverName)) {
            System.getProperties().put("proxySet", "false");
        } else {
            System.getProperties().put("proxySet", "true");
        }
        if (System.getProperties().getProperty("proxySet").equals("true")) {
            return (java.net.HttpURLConnection) url.openConnection(new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress((InetAddress)(Object)this.httpProxy,(int)(Object) this.httpProxyPort)));
        } else {
            return (java.net.HttpURLConnection) url.openConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isLocalURL(String o0){ return null; }}

class PussycatException extends Exception{
	public PussycatException(String errorMessage) { super(errorMessage); }
}
