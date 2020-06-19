import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20655776 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;

    public static void loginLocalhostr() throws Throwable, IOException {
        HttpParams params =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
        params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        DefaultHttpClient httpclient =(DefaultHttpClient)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new DefaultHttpClient();
        httpclient = new DefaultHttpClient(params);
        System.out.println("Trying to log in to localhostr");
        HttpPost httppost = new HttpPost("http://localhostr.com/signin");
        httppost.setHeader("Referer", "http://www.localhostr.com/");
        httppost.setHeader("Accept", "application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("username", "007007dinesh@gmail.com"));
        formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("password", ""));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
        httppost.setEntity(entity);
//        MyHelperClass httpclient = new MyHelperClass();
        HttpResponse httpresponse =(HttpResponse[])(Object)(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
        System.out.println("Getting cookies........");
        System.out.println(httpresponse.getStatusLine());
//        MyHelperClass httpclient = new MyHelperClass();
        Iterator<Cookie> it =(Iterator<Cookie>)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.getCookieStore().getCookies().iterator();
        Cookie escookie = null;
        while (it.hasNext()) {
            escookie = it.next();
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)escookie.getName().contains("session")) {
                String sessioncookie =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
                sessioncookie = escookie.getName() + " = " + escookie.getValue();
//                MyHelperClass sessioncookie = new MyHelperClass();
                System.out.println("session cookie : " + sessioncookie);
            }
        }
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)httpresponse.getStatusLine().getStatusCode() == 302) {
            boolean login =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new boolean();
            login = true;
            System.out.println("localhostr Login Success");
        } else {
            System.out.println("localhostr Login failed");
        }
        MyHelperClass EntityUtils = new MyHelperClass();
        System.out.println(EntityUtils.toString(httpresponse.getEntity()));
        InputStream is =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpresponse.getEntity().getContent();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Cookie {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
