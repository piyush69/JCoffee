import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19235553 {
public MyHelperClass uri;
public MyHelperClass params;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleNLIBException()  throws Throwable {
        if ((Boolean)(Object)uri.startsWith("http://digar.nlib.ee/otsing/") || (Boolean)(Object)uri.startsWith("http://digar.nlib.ee/show")) try {
            String url = "http://digar.nlib.ee/gmap/nd" + uri.substring((int)(Object)uri.indexOf(":") + 1, uri.lastIndexOf("&")) + "-tiles/z0x0y0.jpeg";
            URLConnection connection = new URL(url).openConnection();
            return(BufferedImage)(Object) processNewUri(connection);
        } catch (Exception e) {
            try {
                if ((boolean)(Object)uri.startsWith("http://digar.nlib.ee/show")) uri = "http://digar.nlib.ee/otsing/?pid=" +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) uri.substring((int)(Object)uri.lastIndexOf("/") + 1) + "&show";
                URLConnection connection = new URL((String)(Object)params.uri).openConnection();
                String url =(String)(Object) params.uri;
                if (url.endsWith("&show")) url = url.substring(0, url.length() - 5);
                int index = url.lastIndexOf("?");
                url = "stream" + url.substring(index);
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String aux = null;
                while ((aux = reader.readLine()) != null) {
                    index = aux.indexOf(url);
                    if (index != -1) {
                        url = "http://digar.nlib.ee/otsing/" + aux.substring(index);
                        index = url.indexOf('>');
                        if (index == -1) index = url.indexOf("\"");
                        url = url.substring(0, index);
                        break;
                    }
                }
                connection = new URL(url).openConnection();
                return(BufferedImage)(Object) processNewUri(connection);
            } catch (Exception e2) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }}

class BufferedImage {

}
