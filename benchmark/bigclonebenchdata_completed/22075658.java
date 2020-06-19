


class c22075658 {
public static MyHelperClass AuthScope;
	public static MyHelperClass IOUtils;
	public static MyHelperClass getHttpMethod(String o0, String o1){ return null; }
//public MyHelperClass AuthScope;
//	public MyHelperClass IOUtils;
//	public MyHelperClass getHttpMethod(String o0, String o1){ return null; }

    public static InputStream getResponse(String pURL, String pUserName, String pPassword, OutputStream pResponseOutputStream, String pHttpMethodType) throws Exception {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        URL url = new URL(pURL);
        int port =(int)(Object) url.getPort();
        if (-1 == port) {
            port =(int)(Object) url.getDefaultPort();
        }
        MyHelperClass HTTPS_PROTOCOL = new MyHelperClass();
        if (url.getProtocol().equals(HTTPS_PROTOCOL)) {
//            MyHelperClass HTTPS_PROTOCOL = new MyHelperClass();
            Protocol httpsProtocol = new Protocol(HTTPS_PROTOCOL, new EasySSLProtocolSocketFactory(), port);
//            MyHelperClass HTTPS_PROTOCOL = new MyHelperClass();
            Protocol.registerProtocol(HTTPS_PROTOCOL, httpsProtocol);
        }
        HttpClient httpClient = new HttpClient();
        MyHelperClass HTTP_SOCKET_TIMEOUT = new MyHelperClass();
        httpClient.getParams().setParameter("http.socket.timeout", HTTP_SOCKET_TIMEOUT);
        HttpMethod httpMethod =(HttpMethod)(Object) getHttpMethod(pHttpMethodType, pURL);
        if (null != pUserName && null != pPassword) {
            httpClient.getState().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(pUserName, pPassword));
        }
        try {
            httpClient.executeMethod(httpMethod);
            if (null != pResponseOutputStream) {
                IOUtils.copy(httpMethod.getResponseBodyAsStream(), pResponseOutputStream);
            }
            return(InputStream)(Object) httpMethod.getResponseBodyAsStream();
        } catch (Exception e) {
            throw (e);
        } finally {
            httpMethod.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ANY;
public MyHelperClass setCredentials(MyHelperClass o0, UsernamePasswordCredentials o1){ return null; }
	public MyHelperClass setParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class OutputStream {

}

class InputStream {

}

class BufferedInputStream {

}

class BufferedOutputStream {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getDefaultPort(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class Protocol {

Protocol(MyHelperClass o0, EasySSLProtocolSocketFactory o1, int o2){}
	Protocol(){}
	public static MyHelperClass registerProtocol(MyHelperClass o0, Protocol o1){ return null; }}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class HttpMethod {

public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(String o0, String o1){}
	UsernamePasswordCredentials(){}}

class EasySSLProtocolSocketFactory {

}
