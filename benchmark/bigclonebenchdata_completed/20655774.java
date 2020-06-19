import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20655774 {
public static MyHelperClass EntityUtils;
	public static MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }
//public MyHelperClass EntityUtils;
//	public MyHelperClass parseResponse(MyHelperClass o0, String o1, String o2){ return null; }

    private static void initialize() throws Throwable, IOException {
        System.out.println("Getting startup cookies from localhostr.com");
        HttpGet httpget = new HttpGet("http://localhostr.com/");
        MyHelperClass login = new MyHelperClass();
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)login) {
            MyHelperClass sessioncookie = new MyHelperClass();
            httpget.setHeader("Cookie", sessioncookie);
        }
        MyHelperClass httpclient = new MyHelperClass();
        HttpResponse myresponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httpget);
        HttpEntity myresEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) myresponse.getEntity();
        MyHelperClass localhostrurl = new MyHelperClass();
        localhostrurl = EntityUtils.toString(myresEntity);
//        MyHelperClass localhostrurl = new MyHelperClass();
        localhostrurl = parseResponse(localhostrurl, "url : '", "'");
//        MyHelperClass localhostrurl = new MyHelperClass();
        System.out.println("Localhost url : " + localhostrurl);
        InputStream is =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) myresponse.getEntity().getContent();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
