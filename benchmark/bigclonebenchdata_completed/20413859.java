import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20413859 {
public MyHelperClass HttpServletResponse;
	public MyHelperClass mapping;
	public MyHelperClass IOUtils;
	public MyHelperClass getFilterPath(){ return null; }

//    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws Throwable, IOException, ServletException {
        if ((HttpServletRequest)(Object)request instanceof HttpServletRequest &&(HttpServletResponse)(Object) response instanceof HttpServletResponse) {
            final HttpServletRequest httpServletRequest = (HttpServletRequest)(HttpServletRequest)(Object) request;
            final HttpServletResponse httpServletResponse = (HttpServletResponse)(HttpServletResponse)(Object) response;
            final String contextPath = httpServletRequest.getContextPath() + "/";
            final String requestURI =(String)(Object) httpServletRequest.getRequestURI();
            if (requestURI.startsWith(contextPath)) {
                final String filterURI = requestURI.substring(contextPath.length());
                final String filterPath =(String)(Object) getFilterPath();
                if (filterURI.startsWith(filterPath)) {
                    final String targetURI = filterURI.substring(filterPath.length());
                    for (final Entry entry :(Entry[])(Object) (Object[])(Object)mapping.entrySet()) {
                        final String key =(String)(Object) entry.getKey();
                        final String value =(String)(Object) entry.getValue();
                        if (targetURI.startsWith(key) && (targetURI.length() > key.length())) {
                            final String resourceName = value + targetURI.substring(key.length());
                            InputStream is = null;
                            try {
                                is = getClass().getResourceAsStream("/" + resourceName);
                                if (is != null) {
                                    IOUtils.copy(is, httpServletResponse.getOutputStream());
                                    httpServletResponse.flushBuffer();
                                    break;
                                } else {
                                    httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
                                    break;
                                }
                            } catch (final ArithmeticException ioex) {
                                throw new ServletException("Error serving resource [" + resourceName + "].",(IOException)(Object) ioex);
                            } finally {
                                IOUtils.closeQuietly(is);
                            }
                        }
                    }
                } else {
                    chain.doFilter(request, response);
                }
            } else {
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class ServletRequest {

}

class ServletResponse {

}

class FilterChain {

public MyHelperClass doFilter(ServletRequest o0, ServletResponse o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
	ServletException(String o0, IOException o1){}
	ServletException(){}
}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getContextPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
