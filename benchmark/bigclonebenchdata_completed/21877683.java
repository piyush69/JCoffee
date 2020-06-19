import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21877683 {
public MyHelperClass themeName;
	public MyHelperClass IOUtils;
	public MyHelperClass log;
	public MyHelperClass getThemeName(){ return null; }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws Throwable, IOException, ServletException {
        if (!((HttpServletRequest)(Object)request instanceof HttpServletRequest)) {
            MyHelperClass log = new MyHelperClass();
            log.fatal("not a http request");
            return;
        }
        HttpServletRequest httpRequest = (HttpServletRequest)(HttpServletRequest)(Object) request;
        String uri =(String)(Object) httpRequest.getRequestURI();
        int pathStartIdx = 0;
        String resourceName = null;
        MyHelperClass path = new MyHelperClass();
        pathStartIdx = uri.indexOf((int)(Object)path);
        if (pathStartIdx <= -1) {
//            MyHelperClass path = new MyHelperClass();
            log.fatal("the url pattern must match: " + path + " found uri: " + uri);
            return;
        }
//        MyHelperClass path = new MyHelperClass();
        resourceName = uri.substring(pathStartIdx + (int)(Object)path.length());
        int suffixIdx = uri.lastIndexOf('.');
        if (suffixIdx <= -1) {
            MyHelperClass log = new MyHelperClass();
            log.fatal("no file suffix found for resource: " + uri);
            return;
        }
        String suffix = uri.substring(suffixIdx + 1).toLowerCase();
        MyHelperClass mimeTypes = new MyHelperClass();
        String mimeType = (String)(String)(Object) mimeTypes.get(suffix);
        if (mimeType == null) {
            MyHelperClass log = new MyHelperClass();
            log.fatal("no mimeType found for resource: " + uri);
//            MyHelperClass mimeTypes = new MyHelperClass();
            log.fatal("valid mimeTypes are: " + mimeTypes.keySet());
            return;
        }
        String themeName =(String)(Object) getThemeName();
        if (themeName == null) {
            themeName =(String)(Object) this.themeName;
        }
        if (!themeName.startsWith("/")) {
            themeName = "/" + themeName;
        }
        InputStream is = null;
        is = ResourceFilter.class.getResourceAsStream(themeName + resourceName);
        if (is != null) {
            IOUtils.copy(is, response.getOutputStream());
            response.setContentType(mimeType);
            response.flushBuffer();
            IOUtils.closeQuietly((InputStream)(Object)response.getOutputStream());
            IOUtils.closeQuietly(is);
        } else {
            log.fatal("error loading resource: " + resourceName);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class ServletRequest {

}

class ServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass flushBuffer(){ return null; }}

class FilterChain {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class ResourceFilter {

}
