import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19235552 {
public MyHelperClass uri;
public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleBNException()  throws Throwable {
        if ((boolean)(Object)uri.startsWith("http://purl.pt/")) try {
            MyHelperClass params = new MyHelperClass();
            URLConnection connection = new URL((String)(Object)params.uri).openConnection();
            if ((boolean)(Object)uri.endsWith("/")) uri = uri.substring(0, uri.length() - 1);
            int index =(int)(Object) uri.lastIndexOf("/");
//            MyHelperClass params = new MyHelperClass();
            params.uri = "http://purl.pt/homepage/" + params.uri.substring(index + 1) + "/"(MyHelperClass)(Object) + params.uri.substring(index + 1);
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String url = null;
            while ((url = reader.readLine()) != null) {
//                MyHelperClass params = new MyHelperClass();
                index = url.indexOf((int)(Object)params.uri);
                if (index != -1) {
                    url = url.substring(index);
                    url = url.substring(0, url.indexOf("\""));
                    break;
                }
            }
            if (url != null) {
                connection = new URL(url).openConnection();
                return(BufferedImage)(Object) processNewUri(connection);
            }
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class BufferedImage {

}
