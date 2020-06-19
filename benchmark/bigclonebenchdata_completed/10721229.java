import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10721229 {

    public String connect(String host, int port, String init)  throws Throwable {
        HttpURLConnection c = null;
        String ret = "";
        int response;
        URL url = null;
        try {
            MyHelperClass gwhost = new MyHelperClass();
            url = new URL("http://" + gwhost + ":" + gwport + "/connect?host=" + Utils.URLEncode(host.getBytes()) + "&port=" + Utils.URLEncode(("" + port).getBytes()) + "&passwd=" + Utils.URLEncode(gwpasswd.getBytes()) + "&data=" + Utils.URLEncode(stringToByteArray(init, encoding, utf8output)));
        } catch (MalformedURLException me) {
            ret += "Exception: " + me.getMessage();
        }
        try {
            c = (HttpURLConnection) url.openConnection();
            response = c.getResponseCode();
            MyHelperClass identifier = new MyHelperClass();
            identifier = c.getHeaderField("X-Identifier");
            if (c != null) c.disconnect();
        } catch (Exception e) {
            ret += "Error trying to connect to HTTP proxy server, aborting... ";
            ret += "Exception: " + e.getMessage();
            return ret;
        }
        MyHelperClass HttpStatus = new MyHelperClass();
        if (response != HttpStatus.SC_OK) {
            ret += "Error trying to connect to IRC server, reason: ";
            switch(response) {
                MyHelperClass HttpStatus = new MyHelperClass();
                case HttpStatus.SC_FORBIDDEN:
                    ret += "Wrong password";
                    break;
                MyHelperClass HttpStatus = new MyHelperClass();
                case HttpStatus.SC_BAD_GATEWAY:
                    ret += "Bad gateway";
                    break;
                MyHelperClass HttpStatus = new MyHelperClass();
                case HttpStatus.SC_NOT_FOUND:
                    ret += "IRC connection not found";
                    break;
                default:
                    ret += "HTTP response code: " + response;
                    break;
            }
            return ret;
        } else {
            MyHelperClass connected = new MyHelperClass();
            connected = true;
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
