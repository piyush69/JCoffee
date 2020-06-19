


class c20732948 {

    public static HttpResponse query(DefaultHttpClient httpclient, Request request, Proxy proxy, Log log) throws ClientProtocolException, IOException, MojoExecutionException {
        log.debug("preparing " + request);
        if (proxy != null) {
            log.info("setting up " + proxy + " for request " + request);
            proxy.prepare(httpclient);
        }
        HttpRequestBase httpRequest =(HttpRequestBase)(Object) request.buildHttpRequestBase(httpclient, log);
        HttpHost targetHost =(HttpHost)(Object) request.buildHttpHost(log);
        log.debug("HTTP " + request.getMethod() + " url=" + request.getFinalUrl());
        long responseTime = System.currentTimeMillis();
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(targetHost, httpRequest);
        log.debug("received response (time=" + (System.currentTimeMillis() - responseTime) + "ms) for request [" + "HTTP " + request.getMethod() + " url=" + request.getFinalUrl() + "]");
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DefaultHttpClient {

public MyHelperClass execute(HttpHost o0, HttpRequestBase o1){ return null; }}

class Request {

public MyHelperClass buildHttpHost(Log o0){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getFinalUrl(){ return null; }
	public MyHelperClass buildHttpRequestBase(DefaultHttpClient o0, Log o1){ return null; }}

class Proxy {

public MyHelperClass prepare(DefaultHttpClient o0){ return null; }}

class Log {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class HttpResponse {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MojoExecutionException extends Exception{
	public MojoExecutionException(String errorMessage) { super(errorMessage); }
}

class HttpRequestBase {

}

class HttpHost {

}
