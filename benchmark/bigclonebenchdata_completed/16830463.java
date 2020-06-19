


class c16830463 {
public MyHelperClass PARAM_RESOURCE_PREFIX;
	public MyHelperClass log;
	public MyHelperClass HttpServletResponse;
	public MyHelperClass PARAM_ALLOWED_PREFIXES;
	public MyHelperClass PARAM_BASE_CLASS;
	public MyHelperClass getServletConfig(){ return null; }

//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.trace("doGet(requestURI=" + request.getRequestURI() + ")");
        }
        ServletConfig sc =(ServletConfig)(Object) getServletConfig();
        String uriPrefix = request.getContextPath() + "/" + request.getServletPath();
        String resUri =(String)(Object) request.getRequestURI().substring(uriPrefix.length());
        if ((boolean)(Object)log.isTraceEnabled()) {
            log.trace("Request for resource '" + resUri + "'");
        }
        boolean allowAccess = true;
        String prefixesSpec =(String)(Object) sc.getInitParameter(PARAM_ALLOWED_PREFIXES);
        if (null != prefixesSpec && prefixesSpec.length() > 0) {
            String[] prefixes = prefixesSpec.split(";");
            allowAccess = false;
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("allowedPrefixes specified; checking access");
            }
            for (String prefix : prefixes) {
                if ((boolean)(Object)log.isTraceEnabled()) {
                    log.trace("Checking resource URI '" + resUri + "' against allowed prefix '" + prefix + "'");
                }
                if (resUri.startsWith(prefix)) {
                    if ((boolean)(Object)log.isTraceEnabled()) {
                        log.trace("Found matching prefix for resource URI '" + resUri + "': '" + prefix + "'");
                    }
                    allowAccess = true;
                    break;
                }
            }
        }
        if (!allowAccess) {
            if ((boolean)(Object)log.isWarnEnabled()) {
                log.warn("Requested for resource that does not match with" + " allowed prefixes: " + resUri);
            }
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
            return;
        }
        String resPrefix =(String)(Object) sc.getInitParameter(PARAM_RESOURCE_PREFIX);
        if (null != resPrefix && resPrefix.length() > 0) {
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("resourcePrefix specified: " + resPrefix);
            }
            if (resPrefix.endsWith("/")) {
                resUri = resPrefix + resUri;
            } else {
                resUri = resPrefix + "/" + resUri;
            }
        }
        resUri = resUri.replaceAll("\\/\\/+", "/");
        if ((boolean)(Object)log.isTraceEnabled()) {
            log.trace("Qualified (prefixed) resource URI: " + resUri);
        }
        String baseClassName =(String)(Object) sc.getInitParameter(PARAM_BASE_CLASS);
        if (null == baseClassName || 0 == baseClassName.length()) {
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("No baseClass initialization parameter specified; using default: " + ResourceLoaderServlet.class.getName());
            }
            baseClassName = ResourceLoaderServlet.class.getName();
        } else {
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("Using baseClass: " + baseClassName);
            }
        }
        Class baseClass;
        try {
            baseClass = Class.forName(baseClassName);
        } catch (ClassNotFoundException ex) {
            throw new ServletException("Base class '" + baseClassName + "' not found", ex);
        }
        URL resUrl =(URL)(Object) baseClass.getResource(resUri);
        if (null != resUrl) {
            if ((boolean)(Object)log.isTraceEnabled()) {
                log.trace("Sending resource: " + resUrl);
            }
            URLConnection urlc =(URLConnection)(Object) resUrl.openConnection();
            response.setContentType(urlc.getContentType());
            response.setContentLength(urlc.getContentLength());
            response.setStatus(HttpServletResponse.SC_OK);
            final byte[] buf = new byte[255];
            int r = 0;
            InputStream in =(InputStream)(Object) new BufferedInputStream(urlc.getInputStream());
            OutputStream out =(OutputStream)(Object) new BufferedOutputStream(response.getOutputStream());
            do {
                r =(int)(Object) in.read(buf, 0, 255);
                if (r > 0) {
                    out.write(buf, 0, r);
                }
            } while (r > 0);
            in.close();
            out.flush();
            out.close();
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Resource not found");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass SC_OK;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass isWarnEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getContextPath(){ return null; }
	public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getServletPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
	ServletException(){}
	ServletException(String o0, ClassNotFoundException o1){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletConfig {

public MyHelperClass getInitParameter(MyHelperClass o0){ return null; }}

class ResourceLoaderServlet {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}}
