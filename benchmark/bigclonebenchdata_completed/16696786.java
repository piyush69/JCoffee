import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16696786 {
public MyHelperClass NULL;
	public MyHelperClass strLastHost;
public MyHelperClass socketBufSize;
	public MyHelperClass setResponseEndingData(HttpRequest o0, WebHttpResponse o1, long o2){ return null; }
	public MyHelperClass connectToServer(WebHttpResponse o0, String o1, int o2){ return null; }

    public WebHttpResponse execute(HttpRequest request) throws Throwable, Exception {
        WebHttpResponse response = new WebHttpResponse(request);
        MyHelperClass iSSLClassesAvailable = new MyHelperClass();
        if ((int)(Object)iSSLClassesAvailable == -1) {
            try {
                Class.forName("javax.net.ssl.SSLSocket");
//                MyHelperClass iSSLClassesAvailable = new MyHelperClass();
                iSSLClassesAvailable =(MyHelperClass)(Object) 1;
            } catch (ClassNotFoundException cnf) {
//                MyHelperClass iSSLClassesAvailable = new MyHelperClass();
                iSSLClassesAvailable =(MyHelperClass)(Object) 0;
            }
        }
        try {
            request.getClass().getMethod("getThinkTime", null);
            long thinkTime =(long)(Object) request.getThinkTime();
            if (thinkTime > 0) Thread.sleep(thinkTime);
        } catch (Exception e) {
        }
        MyHelperClass httpRequestHandler = new MyHelperClass();
        if (httpRequestHandler == null) {
//            MyHelperClass httpRequestHandler = new MyHelperClass();
            httpRequestHandler =(MyHelperClass)(Object) new WebHttpRequestHandler();
        }
        MyHelperClass currentPageNumber = new MyHelperClass();
        currentPageNumber = request.getPageNumber();
        MyHelperClass currentPageOrder = new MyHelperClass();
        currentPageOrder = request.getPageOrder();
        long start = System.currentTimeMillis();
//        MyHelperClass currentPageOrder = new MyHelperClass();
        if ((currentPageOrder == HttpRequest.PAGE_START) || (currentPageOrder == HttpRequest.PAGE_ONLY)) {
            long pageStart =(long)(Object) NULL; //new long();
            pageStart = start;
            MyHelperClass currentPageName = new MyHelperClass();
            currentPageName = request.getURL();
        }
//        MyHelperClass iSSLClassesAvailable = new MyHelperClass();
        if ((int)(Object)iSSLClassesAvailable == 1 &&(boolean)(Object) request.getSecure() == true) {
            SSLHttpExecutor ssl = null;
            WebSSLHttpExecutor sslExecutor =(WebSSLHttpExecutor)(Object) NULL; //new WebSSLHttpExecutor();
            if (sslExecutor == null) sslExecutor = new WebSSLHttpExecutor(httpRequestHandler);
//            MyHelperClass sslExecutor = new MyHelperClass();
            ssl = (SSLHttpExecutor)(SSLHttpExecutor)(Object) sslExecutor;
            ssl.execute(request, response);
            setResponseEndingData(request, response, start);
            return response;
//        MyHelperClass iSSLClassesAvailable = new MyHelperClass();
        } else if ((int)(Object)iSSLClassesAvailable == 0 &&(boolean)(Object) request.getSecure() == true) {
            MyHelperClass HttpResourceBundle = new MyHelperClass();
            System.out.println(HttpResourceBundle.SSL_NOTSUPPORTED);
        }
        String strHost =(String)(Object) request.getHost();
        int port =(int)(Object) request.getPort();
        MyHelperClass iLastPort = new MyHelperClass();
        if (port != (int)(Object)iLastPort || strLastHost == null || strHost.regionMatches(0,(String)(Object) strLastHost, 0,(int)(Object) strLastHost.length()) != true) {
            if ((boolean)(Object)(connectToServer(response, strHost, port)) == false) {
                response.setCode(-1);
                return response;
            }
        }
        MyHelperClass to_server = new MyHelperClass();
        if ((boolean)(Object)httpRequestHandler.sendRequest(request, to_server) == false) {
            if ((boolean)(Object)connectToServer(response, strHost, port) == false) {
                response.setCode(-1);
                return response;
            } else {
//                MyHelperClass to_server = new MyHelperClass();
                if ((boolean)(Object)httpRequestHandler.sendRequest(request, to_server) == false) {
                    response.setCode(-1);
                    return response;
                }
            }
        }
        MyHelperClass from_server = new MyHelperClass();
        httpRequestHandler.getServerResponse(request, response, from_server, socketBufSize);
        if ((int)(Object)response.getCode() == 0) {
            if ((boolean)(Object)connectToServer(response, strHost, port) == true) {
//                MyHelperClass to_server = new MyHelperClass();
                if ((boolean)(Object)httpRequestHandler.sendRequest(request, to_server) == true) {
//                    MyHelperClass from_server = new MyHelperClass();
                    httpRequestHandler.getServerResponse(request, response, from_server, socketBufSize);
                }
            }
        }
        MyHelperClass strLastHost = new MyHelperClass();
        if ((boolean)(Object)response.getShouldCloseSocket() == true) strLastHost = null;
        setResponseEndingData(request, response, start);
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SSL_NOTSUPPORTED;
public MyHelperClass length(){ return null; }
	public MyHelperClass sendRequest(HttpRequest o0, MyHelperClass o1){ return null; }
	public MyHelperClass getServerResponse(HttpRequest o0, WebHttpResponse o1, MyHelperClass o2, MyHelperClass o3){ return null; }}

class HttpRequest {
public static MyHelperClass PAGE_START;
	public static MyHelperClass PAGE_ONLY;
public MyHelperClass getPageNumber(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getSecure(){ return null; }
	public MyHelperClass getThinkTime(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getPageOrder(){ return null; }}

class WebHttpResponse {

WebHttpResponse(){}
	WebHttpResponse(HttpRequest o0){}
	public MyHelperClass getShouldCloseSocket(){ return null; }
	public MyHelperClass setCode(int o0){ return null; }
	public MyHelperClass getCode(){ return null; }}

class SSLHttpExecutor {

public MyHelperClass execute(HttpRequest o0, WebHttpResponse o1){ return null; }}

class WebHttpRequestHandler {

}

class WebSSLHttpExecutor {

WebSSLHttpExecutor(MyHelperClass o0){}
	WebSSLHttpExecutor(){}}
