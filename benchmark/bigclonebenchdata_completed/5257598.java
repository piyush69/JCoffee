import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5257598 {
public static MyHelperClass METHOD_GET;
	public static MyHelperClass METHOD_POST;
//public MyHelperClass METHOD_GET;
//	public MyHelperClass METHOD_POST;

    public static int proxy(java.net.URI uri, HttpServletRequest req, HttpServletResponse res) throws Throwable, IOException {
        final HostConfiguration hostConfig = new HostConfiguration();
        hostConfig.setHost(uri.getHost());
        HttpMethodBase httpMethod = null;
        if ((boolean)(Object)METHOD_GET.equalsIgnoreCase(req.getMethod())) {
            httpMethod =(HttpMethodBase)(Object) new GetMethod(uri.toString());
            httpMethod.setFollowRedirects(true);
        } else if ((boolean)(Object)METHOD_POST.equalsIgnoreCase(req.getMethod())) {
            httpMethod =(HttpMethodBase)(Object) new PostMethod(uri.toString());
            final Enumeration parameterNames =(Enumeration)(Object) req.getParameterNames();
            if (parameterNames != null) while (parameterNames.hasMoreElements()) {
                final String parameterName = (String) parameterNames.nextElement();
                for (String parameterValue :(String[])(Object) (Object[])(Object)req.getParameterValues(parameterName)) ((PostMethod)(PostMethod)(Object) httpMethod).addParameter(parameterName, parameterValue);
            }
            ((PostMethod)(PostMethod)(Object) httpMethod).setRequestEntity(new InputStreamRequestEntity(req.getInputStream()));
        }
        if (httpMethod == null) throw new IllegalArgumentException("Unsupported http request method");
        final int responseCode;
        final Enumeration headers =(Enumeration)(Object) req.getHeaderNames();
        if (headers != null) while (headers.hasMoreElements()) {
            final String headerName = (String) headers.nextElement();
            final Enumeration headerValues =(Enumeration)(Object) req.getHeaders(headerName);
            while (headerValues.hasMoreElements()) {
                httpMethod.setRequestHeader(headerName, (String) headerValues.nextElement());
            }
        }
        final HttpState httpState = new HttpState();
        if (req.getCookies() != null) for (Cookie cookie :(Cookie[])(Object) (Object[])(Object)req.getCookies()) {
            String host =(String)(Object) req.getHeader("Host");
            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isEmpty((String)(Object)cookie.getDomain())) cookie.setDomain((boolean)(Object)StringUtils.isEmpty(host) ? req.getServerName() + ":" + req.getServerPort() : host);
//            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isEmpty((String)(Object)cookie.getPath())) cookie.setPath("/");
            httpState.addCookie(new Cookie(cookie.getDomain(), cookie.getName(), cookie.getValue(), cookie.getPath(), cookie.getMaxAge(), cookie.getSecure()));
        }
        httpMethod.setQueryString(req.getQueryString());
        responseCode =(int)(Object) (new HttpClient()).executeMethod(hostConfig, httpMethod, httpState);
        if (responseCode < 0) {
            httpMethod.releaseConnection();
            return responseCode;
        }
        if (httpMethod.getResponseHeaders() != null) for (Header header :(Header[])(Object) (Object[])(Object)httpMethod.getResponseHeaders()) res.setHeader(header.getName(), header.getValue());
        final InputStream in =(InputStream)(Object) httpMethod.getResponseBodyAsStream();
        final OutputStream out =(OutputStream)(Object) res.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        out.flush();
        out.close();
        in.close();
        httpMethod.releaseConnection();
        return responseCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }
	public MyHelperClass getServerName(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }
	public MyHelperClass getMethod(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HostConfiguration {

public MyHelperClass setHost(String o0){ return null; }}

class HttpMethodBase {

public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setQueryString(MyHelperClass o0){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass setRequestEntity(InputStreamRequestEntity o0){ return null; }
	public MyHelperClass addParameter(String o0, String o1){ return null; }}

class InputStreamRequestEntity {

InputStreamRequestEntity(MyHelperClass o0){}
	InputStreamRequestEntity(){}}

class HttpState {

public MyHelperClass addCookie(Cookie o0){ return null; }}

class Cookie {

Cookie(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5){}
	Cookie(){}
	public MyHelperClass getSecure(){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getMaxAge(){ return null; }
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass getDomain(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(HostConfiguration o0, HttpMethodBase o1, HttpState o2){ return null; }}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}
