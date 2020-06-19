import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22510494 {
public static MyHelperClass IOUtils;
	public static MyHelperClass DEFAULT_USERAGENT;
	public static MyHelperClass HttpClientParams;
	public static MyHelperClass HttpStatus;
	public static MyHelperClass LOG;
	public static MyHelperClass encodeURL(String o0){ return null; }
//public MyHelperClass LOG;
//	public MyHelperClass IOUtils;
//	public MyHelperClass HttpClientParams;
//	public MyHelperClass DEFAULT_USERAGENT;
//	public MyHelperClass HttpStatus;
//	public MyHelperClass encodeURL(String o0){ return null; }

    public static void getResponseAsStream(String _url, Object _stringOrStream, OutputStream _stream, Map<String, String> _headers, Map<String, String> _params, String _contentType, int _timeout) throws Throwable, IOException {
        if (_url == null || _url.length() <= 0) throw new IllegalArgumentException("Url can not be null.");
        String temp = _url.toLowerCase();
        if (!temp.startsWith("http://") && !temp.startsWith("https://")) _url = "http://" + _url;
        _url =(String)(Object) encodeURL(_url);
        HttpMethod method = null;
        if (_stringOrStream == null && (_params == null || _params.size() <= 0)) method =(HttpMethod)(Object) new GetMethod(_url); else method =(HttpMethod)(Object) new PostMethod(_url);
        HttpMethodParams methodParams =(HttpMethodParams)(Object) ((HttpMethodBase)(HttpMethodBase)(Object) method).getParams();
        if (methodParams == null) {
            methodParams = new HttpMethodParams();
            ((HttpMethodBase)(HttpMethodBase)(Object) method).setParams(methodParams);
        }
        if (_timeout < 0) methodParams.setSoTimeout(0); else methodParams.setSoTimeout(_timeout);
        if (_contentType != null && _contentType.length() > 0) {
            if (_headers == null) _headers = new HashMap<String, String>();
            _headers.put("Content-Type", _contentType);
        }
        if (_headers == null || !_headers.containsKey("User-Agent")) {
            if (_headers == null) _headers = new HashMap<String, String>();
            _headers.put("User-Agent",(String)(Object) DEFAULT_USERAGENT);
        }
        if (_headers != null) {
            Iterator<Map.Entry<String, String>> iter = _headers.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                method.setRequestHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if ((PostMethod)(Object)method instanceof PostMethod && (_params != null && _params.size() > 0)) {
            Iterator<Map.Entry<String, String>> iter = _params.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                ((PostMethod)(PostMethod)(Object) method).addParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if ((EntityEnclosingMethod)(Object)method instanceof EntityEnclosingMethod && _stringOrStream != null) {
            if (_stringOrStream instanceof InputStream) {
                RequestEntity entity =(RequestEntity)(Object) new InputStreamRequestEntity((InputStream) _stringOrStream);
                ((EntityEnclosingMethod)(EntityEnclosingMethod)(Object) method).setRequestEntity(entity);
            } else {
                RequestEntity entity =(RequestEntity)(Object) new StringRequestEntity(_stringOrStream.toString(), _contentType, null);
                ((EntityEnclosingMethod)(EntityEnclosingMethod)(Object) method).setRequestEntity(entity);
            }
        }
        HttpClient httpClient = new HttpClient(new SimpleHttpConnectionManager());
        httpClient.getParams().setBooleanParameter(HttpClientParams.ALLOW_CIRCULAR_REDIRECTS, true);
        InputStream instream = null;
        try {
            int status =(int)(Object) httpClient.executeMethod(method);
            if (status != (int)(Object)HttpStatus.SC_OK) {
                LOG.warn("Http Satus:" + status + ",Url:" + _url);
                if (status >= 500 && status < 600) throw new IOException("Remote service<" + _url + "> respose a error, status:" + status);
            }
            instream =(InputStream)(Object) method.getResponseBodyAsStream();
            IOUtils.copy(instream, _stream);
        } catch (IOException err) {
            LOG.error("Failed to access " + _url, err);
            throw err;
        } finally {
            IOUtils.closeQuietly(instream);
            if (method != null) method.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass ALLOW_CIRCULAR_REDIRECTS;
public MyHelperClass setBooleanParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class HttpMethod {

public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass releaseConnection(){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass addParameter(String o0, String o1){ return null; }}

class HttpMethodParams {

public MyHelperClass setSoTimeout(int o0){ return null; }}

class HttpMethodBase {

public MyHelperClass setParams(HttpMethodParams o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class EntityEnclosingMethod {

public MyHelperClass setRequestEntity(RequestEntity o0){ return null; }}

class RequestEntity {

}

class InputStreamRequestEntity {

InputStreamRequestEntity(){}
	InputStreamRequestEntity(InputStream o0){}}

class StringRequestEntity {

StringRequestEntity(){}
	StringRequestEntity(String o0, String o1, Object o2){}}

class HttpClient {

HttpClient(SimpleHttpConnectionManager o0){}
	HttpClient(){}
	public MyHelperClass executeMethod(HttpMethod o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class SimpleHttpConnectionManager {

}
