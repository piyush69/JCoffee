import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12283132 {
public MyHelperClass host;
	public MyHelperClass ssl;
	public MyHelperClass keepAlive;
	public MyHelperClass httpexecutor;

    public HTTPResponse makeRequest(BasicHttpRequest request) throws Throwable, IOException {
        try {
            MyHelperClass conn = new MyHelperClass();
            if (!conn.isOpen()) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn(ApacheHTTP.class, "Creating socket");
                MyHelperClass host = new MyHelperClass();
                Socket socket = getSocket(host.getHostName(), host.getPort(), ssl, true);
                MyHelperClass params = new MyHelperClass();
                conn.bind(socket, params);
            }
            HttpContext context = new BasicHttpContext(null);
            MyHelperClass ExecutionContext = new MyHelperClass();
            context.setAttribute(ExecutionContext.HTTP_CONNECTION, conn);
//            MyHelperClass ExecutionContext = new MyHelperClass();
            context.setAttribute(ExecutionContext.HTTP_TARGET_HOST, host);
//            MyHelperClass ExecutionContext = new MyHelperClass();
            context.setAttribute(ExecutionContext.HTTP_REQUEST, request);
            MyHelperClass params = new MyHelperClass();
            request.setParams(params);
            MyHelperClass httpproc = new MyHelperClass();
            httpexecutor.preProcess(request, httpproc, context);
//            MyHelperClass conn = new MyHelperClass();
            HttpResponse response = httpexecutor.execute(request, conn, context);
//            MyHelperClass httpproc = new MyHelperClass();
            httpexecutor.postProcess(response, httpproc, context);
            MyHelperClass connStrategy = new MyHelperClass();
            if (!connStrategy.keepAlive(response, context)) keepAlive = false;
            int statusCode = response.getStatusLine().getStatusCode();
            HttpEntity resp = response.getEntity();
            if (statusCode >= 400) {
                HTTPEntityInfo info = new HTTPEntityInfo((int) resp.getContentLength(), "", resp.getContentType().getValue());
                MyHelperClass IOUtil = new MyHelperClass();
                byte[] bytes = IOUtil.toByteArray(resp.getContent());
                throw new HTTPErrorResponse(response.getStatusLine().getReasonPhrase(), statusCode + "", bytes, info);
            } else {
                Header lastmodHeader = response.getLastHeader("last-modified");
                String lastmod = lastmodHeader == null ? "" : lastmodHeader.getValue();
                Header contentType = resp.getContentType();
                HTTPEntityInfo info = new HTTPEntityInfo((int) resp.getContentLength(), lastmod, contentType == null ? null : contentType.getValue());
                return new HTTPResponse(info, resp.getContent());
            }
        } catch (HttpException he) {
            throw new IOException(he);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_REQUEST;
	public MyHelperClass HTTP_TARGET_HOST;
	public MyHelperClass HTTP_CONNECTION;
public MyHelperClass keepAlive(HttpResponse o0, HttpContext o1){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass warn(Class<ApacheHTTP o0, String o1){ return null; }
	public MyHelperClass bind(Socket o0, MyHelperClass o1){ return null; }
	public MyHelperClass isOpen(){ return null; }}

class BasicHttpRequest {

public MyHelperClass setParams(MyHelperClass o0){ return null; }}

class HTTPResponse {

}

class ApacheHTTP {

}

class HttpContext {

}

class BasicHttpContext {

BasicHttpContext(Object o0){}
	BasicHttpContext(){}}

class HttpResponse {

public MyHelperClass getLastHeader(String o0){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class HTTPEntityInfo {

HTTPEntityInfo(int o0, String o1, Object o2){}
	HTTPEntityInfo(){}}

class HTTPErrorResponse {

}

class Header {

public MyHelperClass getValue(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
