import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12544564 {

    public static void getResponseAsStream(String _url, Object _stringOrStream, OutputStream _stream, Map _headers, Map _params, String _contentType, int _timeout) throws Throwable, IOException {
        if (_url == null || _url.length() <= 0) throw new IllegalArgumentException("Url can not be null.");
        String temp = _url.toLowerCase();
        if (!temp.startsWith("http://") && !temp.startsWith("https://")) _url = "http://" + _url;
        HttpMethod method = null;
        if (_stringOrStream == null && (_params == null || _params.size() <= 0)) method =(HttpMethod)(Object) new GetMethod(_url); else method =(HttpMethod)(Object) new PostMethod(_url);
        HttpMethodParams params =(HttpMethodParams)(Object) ((HttpMethodBase)(HttpMethodBase)(Object) method).getParams();
        if (params == null) {
            params = new HttpMethodParams();
            ((HttpMethodBase)(HttpMethodBase)(Object) method).setParams(params);
        }
        if (_timeout < 0) params.setSoTimeout(0); else params.setSoTimeout(_timeout);
        if (_contentType != null && _contentType.length() > 0) {
            if (_headers == null) _headers = new HashMap();
            _headers.put("Content-Type", _contentType);
        }
        if (_headers != null) {
            Iterator iter = _headers.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                method.setRequestHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if ((PostMethod)(Object)method instanceof PostMethod && (_params != null && _params.size() > 0)) {
            Iterator iter = _params.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
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
        try {
            int status =(int)(Object) httpClient.executeMethod(method);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (status != (int)(Object)HttpStatus.SC_OK) {
                if (status >= 500 && status < 600) throw new IOException("Remote service<" + _url + "> respose a error, status:" + status);
            }
            InputStream instream =(InputStream)(Object) method.getResponseBodyAsStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(instream, _stream);
            instream.close();
        } catch (IOException err) {
            throw err;
        } finally {
            if (method != null) method.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

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

HttpClient(){}
	HttpClient(SimpleHttpConnectionManager o0){}
	public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class SimpleHttpConnectionManager {

}
