import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6222230 {

    public static String loadWebsiteHtmlCode(String url, String useragent)  throws Throwable {
        HttpClient httpClient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
        HttpGet getMethod = new HttpGet(url);
        String htmlCode = "";
        if (useragent != null) {
            getMethod.setHeader("user-agent", useragent);
        }
        try {
            HttpResponse resp =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(getMethod);
            int statusCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) resp.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (statusCode !=(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_OK) {
                MyHelperClass logger = new MyHelperClass();
                logger.debug("Method failed!" + statusCode);
            }
            MyHelperClass EntityUtils = new MyHelperClass();
            htmlCode = EntityUtils.toString(resp.getEntity());
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Fatal protocol violation: " + e.getMessage());
//            MyHelperClass logger = new MyHelperClass();
            logger.trace(e);
        }
        return htmlCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass trace(Exception o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
