
import java.io.UncheckedIOException;


class c17530413 {

    protected void serveStaticContent(HttpServletRequest request, HttpServletResponse response, String pathInfo) throws ServletException {
        MyHelperClass servletConfig = new MyHelperClass();
        InputStream is =(InputStream)(Object) servletConfig.getServletContext().getResourceAsStream(pathInfo);
        if (is == null) {
            throw new ServletException("Static resource " + pathInfo + " is not available");
        }
        try {
            int ind = pathInfo.lastIndexOf(".");
            if (ind != -1 && ind < pathInfo.length()) {
                MyHelperClass STATIC_CONTENT_TYPES = new MyHelperClass();
                String type =(String)(Object) STATIC_CONTENT_TYPES.get(pathInfo.substring(ind + 1));
                if (type != null) {
                    response.setContentType(type);
                }
            }
            ServletOutputStream os =(ServletOutputStream)(Object) response.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            os.flush();
        } catch (UncheckedIOException ex) {
            throw new ServletException("Static resource " + pathInfo + " can not be written to the output stream");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
