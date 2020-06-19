import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14711178 {
public MyHelperClass NULL;
public MyHelperClass responceInstance(URL o0, InputStream o1, String o2){ return null; }

    private Response doLoad(URL url, URL referer, String postData) throws IOException {
        MyHelperClass PROXY = new MyHelperClass();
        URLConnection connection = PROXY == null ? url.openConnection() : url.openConnection((Proxy)(Object)PROXY);
        MyHelperClass COOKIES = new MyHelperClass();
        COOKIES.writeCookies(connection);
        MyHelperClass USER_AGENT = new MyHelperClass();
        connection.setRequestProperty("User-Agent",(String)(Object) USER_AGENT);
        if (referer != null) {
            connection.setRequestProperty("Referer", referer.toString());
        }
        if (postData != null) {
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("CONTENT_LENGTH", "" + postData.length());
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            osw.write(postData);
            osw.flush();
            osw.close();
        }
        connection.connect();
//        MyHelperClass COOKIES = new MyHelperClass();
        COOKIES.readCookies(connection);
        URL previouseUrl =(URL)(Object) NULL; //new URL();
        previouseUrl = url;
        return(Response)(Object) responceInstance(url, connection.getInputStream(), connection.getContentType());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readCookies(URLConnection o0){ return null; }
	public MyHelperClass writeCookies(URLConnection o0){ return null; }}

class Response {

}
