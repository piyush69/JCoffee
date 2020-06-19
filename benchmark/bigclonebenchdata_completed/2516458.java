import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2516458 {
public MyHelperClass keepAlive;
	public MyHelperClass SIP_STATUS_OK;
	public MyHelperClass EntityUtils;
	public MyHelperClass httpClient;

    protected TaobaoResponse _fetch(HttpPost post, Map<String, CharSequence> payload, File file) throws Throwable, IOException {
        Set<Entry> entries =(Set<Entry>)(Object) payload.entrySet();
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        for (Entry entry : entries) {
            NameValuePair nvp = new BasicNameValuePair(entry.getKey(), (String)(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) entry.getValue());
            nvps.add(nvp);
        }
        if (file != null) {
        } else {
            MyHelperClass HTTP = new MyHelperClass();
            post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        }
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)this.keepAlive) {
            post.setHeader("Connection", "Keep-Alive");
        }
        Header responseHeader = null;
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(post);
        responseHeader =(Header)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) post.getLastHeader("sip_status");
        String body = EntityUtils.toString(response.getEntity());
        TaobaoResponse urlRsp = new TaobaoResponse();
        if (responseHeader != null) {
            String status =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) responseHeader.getValue();
            if (!SIP_STATUS_OK.equals(status)) {
                urlRsp.setErrorCode(status);
                urlRsp.setMsg(post.getLastHeader("sip_error_message").getValue());
                if (status.equals("1004")) {
                    urlRsp.setRedirectUrl(post.getLastHeader("sip_isp_loginurl").getValue());
                }
            }
        }
        urlRsp.setBody(body);
        return urlRsp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass getValue(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass getLastHeader(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class TaobaoResponse {

public MyHelperClass setErrorCode(String o0){ return null; }
	public MyHelperClass setBody(String o0){ return null; }
	public MyHelperClass setMsg(MyHelperClass o0){ return null; }
	public MyHelperClass setRedirectUrl(MyHelperClass o0){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, MyHelperClass o1){}
	UrlEncodedFormEntity(){}}

class Header {

public MyHelperClass getValue(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
