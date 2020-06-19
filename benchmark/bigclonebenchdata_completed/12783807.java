


class c12783807 {

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setHeader("Content-type", "application/force-download");
        response.setHeader("Content-disposition", "attachment");
        response.setHeader("filename", "export.txt");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        MyHelperClass HttpServletResponse = new MyHelperClass();
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        InputStream x =(InputStream)(Object) baseRequest.getInputStream();
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(x, writer);
        String theString = writer.toString();
        System.out.println(theString);
        response.getWriter().println(request.getParameter("file").replace("*", "\n"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class Request {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setHandled(boolean o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

}
