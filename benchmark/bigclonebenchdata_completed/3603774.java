import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3603774 {

    private String getXml(String url) throws Throwable, Exception {
        HttpClient httpclient =(HttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        String results = null;
        if (entity != null) {
            long len =(long)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) entity.getContentLength();
            if (len != -1 && len < 2048) {
                MyHelperClass EntityUtils = new MyHelperClass();
                results = EntityUtils.toString(entity);
            } else {
            }
        }
        return (results);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContentLength(){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
