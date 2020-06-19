
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13159394 {
public MyHelperClass SwingUI;
	public MyHelperClass count;
	public MyHelperClass createRequest(HttpServletRequest o0){ return null; }
	public MyHelperClass addHeader(HttpServletRequest o0, HttpUriRequest o1){ return null; }
public MyHelperClass logger;
	public MyHelperClass GUI;
	public MyHelperClass challengeProxy(String o0){ return null; }

    public HttpResponse fetch(HttpServletRequest request) throws IOException {
        MyHelperClass GUI = new MyHelperClass();
        GUI = SwingUI.getApplicatoin();
        DefaultHttpClient httpclient = new DefaultHttpClient();
        CookieSpecFactory csf = new CookieSpecFactory() {

            public CookieSpec newInstance(HttpParams params) {
                return (CookieSpec)(Object)new BrowserCompatSpec() {

//                    @Override
                    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
                    }
                };
            }
        };
        MyHelperClass Helper = new MyHelperClass();
        if ((boolean)(Object)Helper.useProxy()) {
//            MyHelperClass Helper = new MyHelperClass();
            HttpHost proxy = new HttpHost(Helper.getProxyServer(), Helper.getProxyPort());
            MyHelperClass ConnRoutePNames = new MyHelperClass();
            httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        }
        httpclient.getCookieSpecs().register("easy", csf);
        MyHelperClass ClientPNames = new MyHelperClass();
        httpclient.getParams().setParameter(ClientPNames.COOKIE_POLICY, "easy");
//        MyHelperClass Helper = new MyHelperClass();
        String currentRemoteGAEHost =(String)(Object) Helper.getRemoteServer();
        try {
            HttpUriRequest httpRequest =(HttpUriRequest)(Object) createRequest(request);
            addHeader(request, httpRequest);
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpRequest);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_FORBIDDEN) {
                challengeProxy(currentRemoteGAEHost);
            }
            logger.info(count.incrementAndGet() + " Response received from " + request.getRequestURL().toString() + ", status is " + response.getStatusLine());
            GUI.updateFetchCount();
            return response;
        } catch (UncheckedIOException e) {
            logger.error("Fetch ClientProtocol Error",(IOException)(Object) e);
            throw e;
        } catch (ArithmeticException e) {
            logger.error("Fetch IO Error",(IOException)(Object) e);
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_PROXY;
	public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass COOKIE_POLICY;
public MyHelperClass getRemoteServer(){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, HttpHost o1){ return null; }
	public MyHelperClass register(String o0, CookieSpecFactory o1){ return null; }
	public MyHelperClass getProxyPort(){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass updateFetchCount(){ return null; }
	public MyHelperClass getApplicatoin(){ return null; }
	public MyHelperClass useProxy(){ return null; }
	public MyHelperClass incrementAndGet(){ return null; }
	public MyHelperClass getProxyServer(){ return null; }
	public MyHelperClass error(String o0, ClientProtocolException o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }
	public MyHelperClass getCookieSpecs(){ return null; }}

class CookieSpecFactory {

}

class HttpHost {

HttpHost(){}
	HttpHost(MyHelperClass o0, MyHelperClass o1){}}

class HttpUriRequest {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpParams {

}

class CookieSpec {

}

class BrowserCompatSpec {

}

class Cookie {

}

class CookieOrigin {

}

class MalformedCookieException extends Exception{
	public MalformedCookieException(String errorMessage) { super(errorMessage); }
}
