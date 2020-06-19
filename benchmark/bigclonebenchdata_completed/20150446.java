import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20150446 {
public MyHelperClass handleHeaders(MyHelperClass o0){ return null; }

    public String accessURL_Post(String url, String postStr, String encoding) throws Throwable {
        StringEntity entity = new StringEntity(postStr, encoding);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        MyHelperClass client = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) client.execute(httpPost);
        MyHelperClass EntityUtils = new MyHelperClass();
        String entuity = EntityUtils.toString(response.getEntity());
        handleHeaders(response.getAllHeaders());
        return entuity;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpPost o0){ return null; }}

class StringEntity {

StringEntity(String o0, String o1){}
	StringEntity(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
