import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1698200 {

    public static void loginBitShare() throws Throwable, Exception {
        HttpParams params =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
        params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        DefaultHttpClient httpclient = new DefaultHttpClient(params);
        System.out.println("Trying to log in to bitshare.com");
        HttpPost httppost = new HttpPost("http://bitshare.com/login.html");
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("user", "007007dinesh"));
        formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("password", ""));
        formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("submit", "Login"));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
        httppost.setEntity(entity);
        HttpResponse httpresponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
        Iterator<Cookie> it =(Iterator<Cookie>)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.getCookieStore().getCookies().iterator();
        Cookie escookie = null;
        while (it.hasNext()) {
            escookie = it.next();
            System.out.println(escookie.getName() + " = " + escookie.getValue());
        }
        MyHelperClass EntityUtils = new MyHelperClass();
        System.out.println(EntityUtils.toString(httpresponse.getEntity()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCookies(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Cookie {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
