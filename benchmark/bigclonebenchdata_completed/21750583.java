
import java.io.UncheckedIOException;


class c21750583 {
public MyHelperClass CookiePolicy;
public MyHelperClass logger;
	public MyHelperClass buildProxyRequest(String o0){ return null; }

    protected void doProxyInternally(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpRequestBase proxyReq =(HttpRequestBase)(Object) buildProxyRequest((String)(Object)req);
        URI reqUri =(URI)(Object) proxyReq.getURI();
        String cookieDomain =(String)(Object) reqUri.getHost();
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpContext httpContext =(HttpContext)(Object) new BasicHttpContext();
        httpContext.setAttribute("org.atricorel.idbus.kernel.main.binding.http.HttpServletRequest", req);
        int intIdx = 0;
        for (int i = 0; i < (int)(Object)httpClient.getRequestInterceptorCount(); i++) {
            if ((RequestAddCookies)(Object)httpClient.getRequestInterceptor(i) instanceof RequestAddCookies) {
                intIdx = i;
                break;
            }
        }
        IDBusRequestAddCookies interceptor = new IDBusRequestAddCookies(cookieDomain);
        httpClient.removeRequestInterceptorByClass(RequestAddCookies.class);
        httpClient.addRequestInterceptor(interceptor, intIdx);
        MyHelperClass ClientPNames = new MyHelperClass();
        httpClient.getParams().setParameter(ClientPNames.HANDLE_REDIRECTS, false);
//        MyHelperClass ClientPNames = new MyHelperClass();
        httpClient.getParams().setParameter(ClientPNames.COOKIE_POLICY,(boolean)(Object) CookiePolicy.BROWSER_COMPATIBILITY);
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("Staring to follow redirects for " + req.getPathInfo());
        HttpResponse proxyRes = null;
        List storedHeaders =(List)(Object) new ArrayList(40);
        boolean followTargetUrl = true;
        byte[] buff = new byte[1024];
        while (followTargetUrl) {
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("Sending internal request " + proxyReq);
            proxyRes =(HttpResponse)(Object) httpClient.execute(proxyReq, httpContext);
            String targetUrl = null;
            Header[] headers =(Header[])(Object) proxyRes.getAllHeaders();
            for (Header header : headers) {
                if (header.getName().equals("Server")) continue;
                if (header.getName().equals("Transfer-Encoding")) continue;
                if (header.getName().equals("Location")) continue;
                if (header.getName().equals("Expires")) continue;
                if (header.getName().equals("Content-Length")) continue;
                if (header.getName().equals("Content-Type")) continue;
                storedHeaders.add(header);
            }
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("HTTP/STATUS:" + proxyRes.getStatusLine().getStatusCode() + "[" + proxyReq + "]");
            switch((int)(Object)proxyRes.getStatusLine().getStatusCode()) {
                case 200:
                    followTargetUrl = false;
                    break;
                case 404:
                    followTargetUrl = false;
                    break;
                case 500:
                    followTargetUrl = false;
                    break;
                case 302:
                    Header location =(Header)(Object) proxyRes.getFirstHeader("Location");
                    targetUrl =(String)(Object) location.getValue();
                    MyHelperClass internalProcessingPolicy = new MyHelperClass();
                    if (!(Boolean)(Object)internalProcessingPolicy.match(req, targetUrl)) {
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("Do not follow HTTP 302 to [" + location.getValue() + "]");
                        MyHelperClass Collections = new MyHelperClass();
                        Collections.addAll(storedHeaders, proxyRes.getHeaders("Location"));
                        followTargetUrl = false;
                    } else {
//                        MyHelperClass logger = new MyHelperClass();
                        if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("Do follow HTTP 302 to [" + location.getValue() + "]");
                        followTargetUrl = true;
                    }
                    break;
                default:
                    followTargetUrl = false;
                    break;
            }
            HttpEntity entity =(HttpEntity)(Object) proxyRes.getEntity();
            if (entity != null) {
                InputStream instream =(InputStream)(Object) entity.getContent();
                try {
                    if (!followTargetUrl) {
                        for (Header header : headers) {
                            if (header.getName().equals("Content-Type")) res.setHeader(header.getName(), header.getValue());
                            if (header.getName().equals("Content-Length")) res.setHeader(header.getName(), header.getValue());
                        }
                        res.setStatus(proxyRes.getStatusLine().getStatusCode());
                        for (Header header :(Header[])(Object) (Object[])(Object)storedHeaders) {
                            if ((boolean)(Object)header.getName().startsWith("Set-Cookie")) res.addHeader(header.getName(), header.getValue()); else res.setHeader(header.getName(), header.getValue());
                        }
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(instream, res.getOutputStream());
                        res.getOutputStream().flush();
                    } else {
                        int r =(int)(Object) instream.read(buff);
                        int total = r;
                        while (r > 0) {
                            r =(int)(Object) instream.read(buff);
                            total += r;
                        }
//                        MyHelperClass logger = new MyHelperClass();
                        if (total > 0) logger.warn("Ignoring response content size : " + total);
                    }
                } catch (UncheckedIOException ex) {
                    throw ex;
                } catch (RuntimeException ex) {
                    proxyReq.abort();
                    throw ex;
                } finally {
                    try {
                        instream.close();
                    } catch (Exception ignore) {
                    }
                }
            } else {
                if (!followTargetUrl) {
                    res.setStatus(proxyRes.getStatusLine().getStatusCode());
                    for (Header header : headers) {
                        if (header.getName().equals("Content-Type")) res.setHeader(header.getName(), header.getValue());
                        if (header.getName().equals("Content-Length")) res.setHeader(header.getName(), header.getValue());
                    }
                    for (Header header :(Header[])(Object) (Object[])(Object)storedHeaders) {
                        if ((boolean)(Object)header.getName().startsWith("Set-Cookie")) res.addHeader(header.getName(), header.getValue()); else res.setHeader(header.getName(), header.getValue());
                    }
                }
            }
            if (followTargetUrl) {
                proxyReq =(HttpRequestBase)(Object) buildProxyRequest(targetUrl);
                httpContext = null;
            }
        }
        if ((boolean)(Object)logger.isTraceEnabled()) logger.trace("Ended following redirects for " + req.getPathInfo());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BROWSER_COMPATIBILITY;
	public MyHelperClass HANDLE_REDIRECTS;
	public MyHelperClass COOKIE_POLICY;
public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass addAll(List o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass match(HttpServletRequest o0, String o1){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass addHeader(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpRequestBase {

public MyHelperClass abort(){ return null; }
	public MyHelperClass getURI(){ return null; }}

class URI {

public MyHelperClass getHost(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpRequestBase o0, HttpContext o1){ return null; }
	public MyHelperClass removeRequestInterceptorByClass(Class<RequestAddCookies> o0){ return null; }
	public MyHelperClass getRequestInterceptor(int o0){ return null; }
	public MyHelperClass getRequestInterceptorCount(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestInterceptor(IDBusRequestAddCookies o0, int o1){ return null; }}

class HttpContext {

public MyHelperClass setAttribute(String o0, HttpServletRequest o1){ return null; }}

class BasicHttpContext {

}

class RequestAddCookies {

}

class IDBusRequestAddCookies {

IDBusRequestAddCookies(String o0){}
	IDBusRequestAddCookies(){}}

class HttpResponse {

public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class List {

public MyHelperClass add(Header o0){ return null; }}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class ArrayList {

ArrayList(int o0){}
	ArrayList(){}}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
