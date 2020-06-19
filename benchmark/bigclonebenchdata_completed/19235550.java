import java.io.*;
import java.lang.*;
import java.util.*;



class c19235550 {
public MyHelperClass uri;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleGMUException() {
        if ((boolean)(Object)uri.startsWith("http://mars.gmu.edu:8080")) try {
            MyHelperClass params = new MyHelperClass();
            URLConnection connection =(URLConnection)(Object) (new URL((String)(Object)params.uri).openConnection());
            int index =(int)(Object) uri.lastIndexOf("?");
//            MyHelperClass params = new MyHelperClass();
            params.uri =(MyHelperClass)(Object) "<img class=\"itemthumb\" src=\"";
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
            String url = null;
            while ((url = reader.readLine()) != null) {
//                MyHelperClass params = new MyHelperClass();
                index = url.indexOf((int)(Object)params.uri);
                if (index != -1) {
                    url = "http://mars.gmu.edu:8080" + url.substring(index + 28);
                    url = url.substring(0, url.indexOf("\" alt=\""));
                    break;
                }
            }
            if (url != null) {
                connection =(URLConnection)(Object) (new URL(url).openConnection());
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
public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class BufferedImage {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}
