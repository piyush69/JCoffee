


class c22440247 {
public MyHelperClass serviceSSIResource(String o0, HttpServletResponse o1, ServletConfig o2){ return null; }

    private void serviceResource(HttpServletRequest request, HttpServletResponse response, ServletConfig config) throws IOException {
        String uri = (String)(String)(Object) request.getAttribute("javax.servlet.include.request_uri");
        if (uri == null) uri =(String)(Object) request.getRequestURI();
        if (uri.endsWith(".shtml")) {
            serviceSSIResource(uri, response, config);
        } else {
            MyHelperClass servletPath = new MyHelperClass();
            String target = uri.substring((int)(Object)servletPath.length());
            ServletContext context =(ServletContext)(Object) config.getServletContext();
            URL url =(URL)(Object) context.getResource(target);
            URLConnection resource =(URLConnection)(Object) url.openConnection();
            String contentType =(String)(Object) context.getMimeType(uri);
            if (contentType == null) contentType =(String)(Object) resource.getContentType();
            if (contentType != null) {
                String encoding =(String)(Object) resource.getContentEncoding();
                if (encoding != null) contentType += "; charset=" + encoding;
                response.setContentType(contentType);
            }
            int contentLength =(int)(Object) resource.getContentLength();
            if (contentLength > 0) response.setContentLength(contentLength);
            InputStream is =(InputStream)(Object) resource.getInputStream();
            OutputStream os =(OutputStream)(Object) response.getOutputStream();
            int bytesRead = 0;
            byte buffer[] = new byte[512];
            while ((bytesRead =(int)(Object) is.read(buffer)) != -1) os.write(buffer, 0, bytesRead);
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }}

class HttpServletRequest {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletConfig {

public MyHelperClass getServletContext(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletContext {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
