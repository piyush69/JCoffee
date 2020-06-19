import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20655772 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
public static MyHelperClass HttpVersion;
public static MyHelperClass localhostrurl;
	public static MyHelperClass EntityUtils;
//	public MyHelperClass HttpVersion;
	public static MyHelperClass fileUpload(){ return null; }
	public static MyHelperClass initialize(){ return null; }
	public static MyHelperClass loginLocalhostr(){ return null; }
public MyHelperClass httpclient;
//	public MyHelperClass localhostrurl;
//	public MyHelperClass EntityUtils;
//	public MyHelperClass fileUpload(){ return null; }
//	public MyHelperClass loginLocalhostr(){ return null; }
//	public MyHelperClass initialize(){ return null; }

    public static void main(String[] args) throws Throwable, IOException {
        DefaultHttpClient httpclient =(DefaultHttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new DefaultHttpClient();
        httpclient = new DefaultHttpClient();
        MyHelperClass CoreProtocolPNames = new MyHelperClass();
        httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
        loginLocalhostr();
        initialize();
        HttpOptions httpoptions = new HttpOptions(localhostrurl);
        HttpResponse myresponse =(HttpResponse[])(Object)(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httpoptions);
        HttpEntity myresEntity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) myresponse.getEntity();
        System.out.println(EntityUtils.toString(myresEntity));
        fileUpload();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
	public MyHelperClass PROTOCOL_VERSION;
public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpOptions o0){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpOptions {

HttpOptions(MyHelperClass o0){}
	HttpOptions(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class DefaultHttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpOptions o0){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
