import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11656405 {
public static MyHelperClass HTTP;
	public static MyHelperClass EntityUtils;
	public static MyHelperClass client;
	public static MyHelperClass upLoadImg(File o0, String o1){ return null; }
	public static MyHelperClass getHttpPost(String o0, String o1){ return null; }
//public MyHelperClass HTTP;
//	public MyHelperClass EntityUtils;
//	public MyHelperClass client;
//	public MyHelperClass upLoadImg(File o0, String o1){ return null; }
//	public MyHelperClass getHttpPost(String o0, String o1){ return null; }

    public static String addWeibo(String weibo, File pic, String uid) throws Throwable {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("_surl", ""));
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("_t", "0"));
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("location", "home"));
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("module", "stissue"));
        if (pic != null) {
            String picId =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) upLoadImg(pic, uid);
            qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("pic_id", picId));
        }
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("rank", "weibo"));
        qparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("text", weibo));
        HttpPost post =(HttpPost)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getHttpPost("http://weibo.com/aj/mblog/add?__rnd=1333611402611", uid);
        UrlEncodedFormEntity params = new UrlEncodedFormEntity(qparams, HTTP.UTF_8);
        post.setEntity(params);
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(post);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        String content = EntityUtils.toString(entity, HTTP.UTF_8);
        post.abort();
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass execute(HttpPost o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class HttpPost {

public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass abort(){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, MyHelperClass o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0, MyHelperClass o1){ return null; }}
