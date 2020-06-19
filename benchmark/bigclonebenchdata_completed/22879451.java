


class c22879451 {
public MyHelperClass HttpServletResponse;
	public MyHelperClass IOUtils;
	public MyHelperClass ClassLoaderUtils;
	public MyHelperClass getLogger(){ return null; }

//    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException {
        String context =(String)(Object) request.getContextPath();
        String resource =(String)(Object) request.getRequestURI().replace(context, "");
        MyHelperClass RESOURCES_PATH = new MyHelperClass();
        resource = resource.replaceAll(RESOURCES_PATH + "/", "");
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)(StringUtils.isEmpty(resource)) || (resource.endsWith("/"))) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        this.getLogger().info("Getting resource: " + resource);
        URL url =(URL)(Object) ClassLoaderUtils.getResource(resource);
        if (url == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        InputStream input =(InputStream)(Object) url.openStream();
        OutputStream output =(OutputStream)(Object) response.getOutputStream();
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        String contentEncoding =(String)(Object) connection.getContentEncoding();
        int contentLength =(int)(Object) connection.getContentLength();
        String contentType =(String)(Object) connection.getContentType();
        if (contentEncoding != null) {
            response.setCharacterEncoding(contentEncoding);
        }
        response.setContentLength(contentLength);
        response.setContentType(contentType);
        IOUtils.copy(input, output, true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_BAD_REQUEST;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1, boolean o2){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getContextPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class FilterChain {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class OutputStream {

}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
