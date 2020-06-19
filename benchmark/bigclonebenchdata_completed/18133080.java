import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18133080 {
public MyHelperClass HttpHeaders;
	public MyHelperClass FileUtil;
	public MyHelperClass isDisconnect(){ return null; }
	public MyHelperClass getRequestMethod(){ return null; }
	public MyHelperClass getIfModifiedSince(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getProxy(){ return null; }
	public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass getInstanceFollowRedirects(){ return null; }
	public MyHelperClass isUseCaches(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass createResponse(URLConnection o0){ return null; }
	public MyHelperClass getReadTimeout(){ return null; }
	public MyHelperClass getSSLSocketFactory(){ return null; }
	public MyHelperClass getContentInputStream(){ return null; }
	public MyHelperClass setRequestHeader(URLConnection o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }

//    @Override
    public HttpResponse execute() throws Throwable, IOException {
        URL _url =(URL)(Object) getUrl();
        if (_url == null) throw new IOException("url not set");
        Proxy _proxy =(Proxy)(Object) getProxy();
        URLConnection urlConn = _proxy == null ? _url.openConnection() : _url.openConnection(_proxy);
        HttpURLConnection httpUrlConn = urlConn instanceof HttpURLConnection ? (HttpURLConnection) urlConn : null;
        HttpsURLConnection httpsUrlConn =(HttpsURLConnection)(Object) urlConn instanceof HttpsURLConnection ? (HttpsURLConnection)(HttpsURLConnection)(Object) urlConn : null;
        if (httpUrlConn != null) {
            String reqMethod =(String)(Object) getRequestMethod();
            httpUrlConn.setRequestMethod(reqMethod);
        }
        if (httpsUrlConn != null) {
            SSLSocketFactory sslF =(SSLSocketFactory)(Object) getSSLSocketFactory();
            if (sslF != null) httpsUrlConn.setSSLSocketFactory(sslF);
        }
        setRequestHeader(urlConn);
        String contType =(String)(Object) getContentType();
        int len =(int)(Object) getContentLength();
        InputStream postDataStream =(InputStream)(Object) getContentInputStream();
        if (contType != null && postDataStream != null) urlConn.setRequestProperty((String)(Object)HttpHeaders.contentType, contType);
        if (len >= 0 && postDataStream != null) urlConn.setRequestProperty((String)(Object)HttpHeaders.contentLength, "" + len);
        urlConn.setDoInput(true);
        urlConn.setDoOutput(postDataStream != null);
        urlConn.setUseCaches((boolean)(Object)isUseCaches());
        urlConn.setConnectTimeout((int)(Object)getConnectTimeout());
        urlConn.setReadTimeout((int)(Object)getReadTimeout());
        if (getInstanceFollowRedirects() != null && httpUrlConn != null) {
            httpUrlConn.setInstanceFollowRedirects((boolean)(Object)getInstanceFollowRedirects());
        }
        if (getIfModifiedSince() != null && httpUrlConn != null) {
            httpUrlConn.setIfModifiedSince((long)(Object)getIfModifiedSince());
        }
        urlConn.connect();
        if (postDataStream != null) {
            OutputStream output = urlConn.getOutputStream();
            FileUtil.copyAllData(postDataStream, output);
            output.flush();
            output.close();
            postDataStream.close();
        }
        HttpResponse response =(HttpResponse)(Object) createResponse(urlConn);
        if ((boolean)(Object)isDisconnect() && httpUrlConn != null) {
            httpUrlConn.disconnect();
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass contentLength;
	public MyHelperClass contentType;
public MyHelperClass copyAllData(InputStream o0, OutputStream o1){ return null; }}

class HttpResponse {

}

class HttpsURLConnection {

public MyHelperClass setSSLSocketFactory(SSLSocketFactory o0){ return null; }}

class SSLSocketFactory {

}
