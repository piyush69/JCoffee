import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7422527 {
public MyHelperClass READ_TIMEOUT;

    public HttpResponseMessage execute(HttpMessage request, Map<String, Object> parameters) throws Throwable, IOException {
        final String method =(String)(Object) request.method;
        final String url =(String)(Object) request.url.toExternalForm();
        final InputStream body =(InputStream)(Object) request.getBody();
        MyHelperClass DELETE = new MyHelperClass();
        final boolean isDelete =(boolean)(Object) DELETE.equalsIgnoreCase(method);
        MyHelperClass POST = new MyHelperClass();
        final boolean isPost =(boolean)(Object) POST.equalsIgnoreCase(method);
        MyHelperClass PUT = new MyHelperClass();
        final boolean isPut =(boolean)(Object) PUT.equalsIgnoreCase(method);
        byte[] excerpt = null;
        HttpMethod httpMethod;
        if (isPost || isPut) {
            EntityEnclosingMethod entityEnclosingMethod = isPost ? new PostMethod(url) : new PutMethod(url);
            if (body != null) {
                ExcerptInputStream e = new ExcerptInputStream(body);
                MyHelperClass HttpMessage = new MyHelperClass();
                String length =(String)(Object) request.removeHeaders(HttpMessage.CONTENT_LENGTH);
                entityEnclosingMethod.setRequestEntity((length == null) ? new InputStreamRequestEntity(e) : new InputStreamRequestEntity(e, Long.parseLong(length)));
                excerpt =(byte[])(Object) e.getExcerpt();
            }
            httpMethod =(HttpMethod)(Object) entityEnclosingMethod;
        } else if (isDelete) {
            httpMethod =(HttpMethod)(Object) new DeleteMethod(url);
        } else {
            httpMethod =(HttpMethod)(Object) new GetMethod(url);
        }
        for (Map.Entry<String, Object> p : parameters.entrySet()) {
            String name = p.getKey();
            String value = p.getValue().toString();
            MyHelperClass FOLLOW_REDIRECTS = new MyHelperClass();
            if (FOLLOW_REDIRECTS.equals(name)) {
                httpMethod.setFollowRedirects(Boolean.parseBoolean(value));
            MyHelperClass READ_TIMEOUT = new MyHelperClass();
            } else if (READ_TIMEOUT.equals(name)) {
                MyHelperClass HttpMethodParams = new MyHelperClass();
                httpMethod.getParams().setIntParameter(HttpMethodParams.SO_TIMEOUT, Integer.parseInt(value));
            }
        }
        for (Map.Entry<String, String> header :(Entry[])(Object)(Object[])(Object)(java.util.Map.Entry)(Object)(Entry[])(Object) (Object[])(Object)request.headers) {
            httpMethod.addRequestHeader(header.getKey(), header.getValue());
        }
        MyHelperClass clientPool = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) clientPool.getHttpClient(new URL(httpMethod.getURI().toString()));
        client.executeMethod(httpMethod);
        return(HttpResponseMessage)(Object) new HttpMethodResponse(httpMethod, excerpt, request.getContentCharset());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_LENGTH;
	public MyHelperClass SO_TIMEOUT;
public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getHttpClient(URL o0){ return null; }
	public MyHelperClass setIntParameter(MyHelperClass o0, int o1){ return null; }}

class HttpMessage {
public MyHelperClass method;
	public MyHelperClass url;
	public MyHelperClass headers;
public MyHelperClass getBody(){ return null; }
	public MyHelperClass removeHeaders(MyHelperClass o0){ return null; }
	public MyHelperClass getContentCharset(){ return null; }}

class HttpResponseMessage {

}

class HttpMethod {

public MyHelperClass getURI(){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }}

class EntityEnclosingMethod {

}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}}

class PutMethod {

PutMethod(String o0){}
	PutMethod(){}}

class ExcerptInputStream {

ExcerptInputStream(InputStream o0){}
	ExcerptInputStream(){}
	public MyHelperClass getExcerpt(){ return null; }}

class InputStreamRequestEntity {

InputStreamRequestEntity(ExcerptInputStream o0, long o1){}
	InputStreamRequestEntity(ExcerptInputStream o0){}
	InputStreamRequestEntity(){}}

class DeleteMethod {

DeleteMethod(String o0){}
	DeleteMethod(){}}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class HttpMethodResponse {

HttpMethodResponse(HttpMethod o0, byte[] o1, MyHelperClass o2){}
	HttpMethodResponse(){}}

class Entry {

}
