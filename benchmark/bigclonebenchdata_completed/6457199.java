


class c6457199 {

    protected boolean doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path =(String)(Object) request.getPathInfo();
        MyHelperClass alias = new MyHelperClass();
        if (!path.startsWith((String)(Object)alias)) {
//            MyHelperClass alias = new MyHelperClass();
            throw new ServletException("Path '" + path + "' does not start with registered alias '" + alias + "'");
        }
        String internal;
//        MyHelperClass alias = new MyHelperClass();
        if (alias.equals("/")) {
            MyHelperClass name = new MyHelperClass();
            internal = name + path;
        } else {
            MyHelperClass name = new MyHelperClass();
            internal = name + path.substring((int)(Object)alias.length(), path.length());
        }
        MyHelperClass httpContext = new MyHelperClass();
        URL resource =(URL)(Object) httpContext.getResource(internal);
        if (resource == null) {
            return false;
        }
        MyHelperClass servletContext = new MyHelperClass();
        String mimeType =(String)(Object) servletContext.getMimeType(internal);
        if (mimeType != null) {
            response.setContentType(mimeType);
        }
        InputStream is =(InputStream)(Object) resource.openStream();
        OutputStream os =(OutputStream)(Object) response.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyAndClose(is, os);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass copyAndClose(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class OutputStream {

}
