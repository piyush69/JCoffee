import java.io.*;
import java.lang.*;
import java.util.*;



class c16621503 {
public static MyHelperClass loadURLToStrings(URLConnection o0, int o1){ return null; }
//public MyHelperClass loadURLToStrings(URLConnection o0, int o1){ return null; }

    public static ArrayList<String> loadURLToStrings(URL url, int maxLines, String userAgent, int timeout) throws IOException {
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        if (userAgent != null && userAgent.trim().length() > 0) {
            connection.setRequestProperty("User-Agent", userAgent);
        } else {
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; astrominer/1.0;)");
        }
        if (timeout > 0) {
            connection.setConnectTimeout(timeout);
        }
        connection.connect();
        return(ArrayList<String>)(Object) loadURLToStrings(connection, maxLines);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }}
