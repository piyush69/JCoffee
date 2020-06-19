


class c4519500 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo =(String)(Object) req.getPathInfo();
        MyHelperClass prefix = new MyHelperClass();
        String pluginPathInfo = pathInfo.substring((int)(Object)prefix.length());
        MyHelperClass pluginKey = new MyHelperClass();
        String gwtPathInfo = pluginPathInfo.substring((int)(Object)pluginKey.length() + 1);
        MyHelperClass CLASSPATH_PREFIX = new MyHelperClass();
        String clPath = CLASSPATH_PREFIX + gwtPathInfo;
        MyHelperClass cl = new MyHelperClass();
        InputStream input =(InputStream)(Object) cl.getResourceAsStream(clPath);
        if (input != null) {
            try {
                OutputStream output =(OutputStream)(Object) resp.getOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                input.close();
            }
        } else {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass length(){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

}
