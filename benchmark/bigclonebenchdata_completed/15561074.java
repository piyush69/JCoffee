import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15561074 {
public MyHelperClass ClientContext;
	public MyHelperClass ExecutionContext;
	public MyHelperClass AQUtility;
	public MyHelperClass ah;
	public MyHelperClass makeCookie(){ return null; }
	public MyHelperClass getClient(){ return null; }

    private void httpDo(HttpUriRequest hr, String url, Map<String, String> headers, AjaxStatus status) throws Throwable, ClientProtocolException, IOException {
        MyHelperClass AGENT = new MyHelperClass();
        if (AGENT != null) {
//            MyHelperClass AGENT = new MyHelperClass();
            hr.addHeader("User-Agent", AGENT);
        }
        if (headers != null) {
            for (String name : headers.keySet()) {
                hr.addHeader(name, headers.get(name));
            }
        }
        MyHelperClass GZIP = new MyHelperClass();
        if ((boolean)(Object)GZIP && headers == null || !headers.containsKey("Accept-Encoding")) {
            hr.addHeader("Accept-Encoding", "gzip");
        }
        String cookie =(String)(Object) makeCookie();
        if (cookie != null) {
            hr.addHeader("Cookie", cookie);
        }
        if (ah != null) {
            ah.applyToken(this, hr);
        }
        DefaultHttpClient client =(DefaultHttpClient)(Object) getClient();
        HttpContext context =(HttpContext)(Object) new BasicHttpContext();
        CookieStore cookieStore =(CookieStore)(Object) new BasicCookieStore();
        context.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
        HttpResponse response =(HttpResponse)(Object) client.execute(hr, context);
        byte[] data = null;
        String redirect = url;
        int code =(int)(Object) response.getStatusLine().getStatusCode();
        String message =(String)(Object) response.getStatusLine().getReasonPhrase();
        String error = null;
        if (code < 200 || code >= 300) {
            try {
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                byte[] s =(byte[])(Object) AQUtility.toBytes(entity.getContent());
                error = new String(s, "UTF-8");
                AQUtility.debug("error", error);
            } catch (Exception e) {
                AQUtility.debug(e);
            }
        } else {
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            HttpHost currentHost = (HttpHost)(HttpHost)(Object) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
            HttpUriRequest currentReq = (HttpUriRequest)(HttpUriRequest)(Object) context.getAttribute(ExecutionContext.HTTP_REQUEST);
            redirect =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) currentHost.toURI() + (int)(Object)currentReq.getURI();
            int size = Math.max(32, Math.min(1024 * 64, (int)(int)(Object) entity.getContentLength()));
            PredefinedBAOS baos = new PredefinedBAOS(size);
            Header encoding =(Header)(Object) entity.getContentEncoding();
            if (encoding != null && (boolean)(Object)encoding.getValue().equalsIgnoreCase("gzip")) {
                InputStream is =(InputStream)(Object) new GZIPInputStream(entity.getContent());
                AQUtility.copy(is, baos);
            } else {
                entity.writeTo(baos);
            }
            data =(byte[])(Object) baos.toByteArray();
        }
        AQUtility.debug("response", code);
        if (data != null) {
            AQUtility.debug(data.length, url);
        }
        status.code(code).message(message).error(error).redirect(redirect).time(new Date()).data(data).client(client).context(context).headers(response.getAllHeaders());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COOKIE_STORE;
	public MyHelperClass HTTP_REQUEST;
	public MyHelperClass HTTP_TARGET_HOST;
public MyHelperClass client(DefaultHttpClient o0){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, PredefinedBAOS o1){ return null; }
	public MyHelperClass message(String o0){ return null; }
	public MyHelperClass debug(int o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass data(byte[] o0){ return null; }
	public MyHelperClass toBytes(MyHelperClass o0){ return null; }
	public MyHelperClass redirect(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass headers(MyHelperClass o0){ return null; }
	public MyHelperClass context(HttpContext o0){ return null; }
	public MyHelperClass debug(String o0, int o1){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(Exception o0){ return null; }
	public MyHelperClass time(Date o0){ return null; }
	public MyHelperClass applyToken(c15561074 o0, HttpUriRequest o1){ return null; }}

class HttpUriRequest {

public MyHelperClass getURI(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass addHeader(String o0, MyHelperClass o1){ return null; }}

class AjaxStatus {

public MyHelperClass code(int o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpUriRequest o0, HttpContext o1){ return null; }}

class HttpContext {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, CookieStore o1){ return null; }}

class BasicHttpContext {

}

class BasicCookieStore {

}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass writeTo(PredefinedBAOS o0){ return null; }}

class HttpHost {

public MyHelperClass toURI(){ return null; }}

class PredefinedBAOS {

PredefinedBAOS(int o0){}
	PredefinedBAOS(){}
	public MyHelperClass toByteArray(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}
