import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19235551 {
public MyHelperClass uri;
public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleFCLAException()  throws Throwable {
        if ((boolean)(Object)uri.startsWith("http://image11.fcla.edu/cgi")) try {
            MyHelperClass params = new MyHelperClass();
            params.uri = params.uri.substring((int)(Object)params.uri.indexOf("q1=") + 3);
//            MyHelperClass params = new MyHelperClass();
            params.uri = params.uri.substring(0, params.uri.indexOf("&"));
//            MyHelperClass params = new MyHelperClass();
            params.uri = "http://image11.fcla.edu/m/map/thumb/" + params.uri.substring((int)(Object)params.uri.length() - 3,(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) params.uri.length() - 2) + "/" + params.uri.substring(params.uri.length() - 2, params.uri.length() - 1) + "/" + params.uri.substring(params.uri.length() - 1, params.uri.length()) + "/" + params.uri + ".jpg";
//            MyHelperClass params = new MyHelperClass();
            URL url = new URL((String)(Object)params.uri);
            URLConnection connection = url.openConnection();
            return(BufferedImage)(Object) processNewUri(connection);
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class BufferedImage {

}
