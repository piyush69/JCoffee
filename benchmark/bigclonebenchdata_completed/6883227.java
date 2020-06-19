import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c6883227 {
public MyHelperClass isJDK14orEarlier;
public MyHelperClass proxyPort;
	public MyHelperClass log(String o0){ return null; }

    private HttpURLConnection getConnection(String url) throws IOException {
        HttpURLConnection con = null;
        MyHelperClass proxyHost = new MyHelperClass();
        if (proxyHost != null && !proxyHost.equals("")) {
            MyHelperClass proxyAuthUser = new MyHelperClass();
            if (proxyAuthUser != null && !proxyAuthUser.equals("")) {
//                MyHelperClass proxyAuthUser = new MyHelperClass();
                log("Proxy AuthUser: " + proxyAuthUser);
                MyHelperClass proxyAuthPassword = new MyHelperClass();
                log("Proxy AuthPassword: " + proxyAuthPassword);
                Authenticator.setDefault(new Authenticator() {

//                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        if (getRequestorType().equals(RequestorType.PROXY)) {
                            MyHelperClass proxyAuthUser = new MyHelperClass();
                            return new PasswordAuthentication((String)(Object)proxyAuthUser,(char[])(Object) proxyAuthPassword.toCharArray());
                        } else {
                            return null;
                        }
                    }
                });
            }
            MyHelperClass Type = new MyHelperClass();
            final Proxy proxy = new Proxy((java.net.Proxy.Type)(Object)(Type)(Object)Type.HTTP, InetSocketAddress.createUnresolved((String)(Object)proxyHost,(int)(Object) proxyPort));
            MyHelperClass DEBUG = new MyHelperClass();
            if ((boolean)(Object)DEBUG) {
//                MyHelperClass proxyHost = new MyHelperClass();
                log("Opening proxied connection(" + proxyHost + ":" + proxyPort + ")");
            }
            con = (HttpURLConnection) new URL(url).openConnection(proxy);
        } else {
            con = (HttpURLConnection) new URL(url).openConnection();
        }
        MyHelperClass connectionTimeout = new MyHelperClass();
        if ((int)(Object)connectionTimeout > 0 && !(Boolean)(Object)isJDK14orEarlier) {
//            MyHelperClass connectionTimeout = new MyHelperClass();
            con.setConnectTimeout((int)(Object)connectionTimeout);
        }
        MyHelperClass readTimeout = new MyHelperClass();
        if ((int)(Object)readTimeout > 0 && !(Boolean)(Object)isJDK14orEarlier) {
//            MyHelperClass readTimeout = new MyHelperClass();
            con.setReadTimeout((int)(Object)readTimeout);
        }
        return con;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
public MyHelperClass toCharArray(){ return null; }}

class Type {

}
