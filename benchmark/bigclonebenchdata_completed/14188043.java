import java.io.*;
import java.lang.*;
import java.util.*;



class c14188043 {

    public static byte[] openHttpResult(String urlPath, boolean retry) throws IOException {
        MyHelperClass AQUtility = new MyHelperClass();
        AQUtility.debug("net", urlPath);
        URL url = new URL(urlPath);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        MyHelperClass NET_TIMEOUT = new MyHelperClass();
        connection.setConnectTimeout(NET_TIMEOUT);
        int code =(int)(Object) connection.getResponseCode();
        if (code == 307 && retry) {
            String redirect =(String)(Object) connection.getHeaderField("Location");
            return openHttpResult(redirect, false);
        }
        if (code == -1 && retry) {
            return openHttpResult(urlPath, false);
        }
//        MyHelperClass AQUtility = new MyHelperClass();
        AQUtility.debug("response", code);
        if (code == -1 || code < 200 || code >= 300) {
            throw new IOException();
        }
//        MyHelperClass AQUtility = new MyHelperClass();
        byte[] result =(byte[])(Object) AQUtility.toBytes(connection.getInputStream());
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toBytes(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass debug(String o0, int o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }}
