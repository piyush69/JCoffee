


class c20177902 {

    public void execute(HttpServletRequest req, HttpServletResponse res, HttpServlet parent) throws Exception {
        String path =(String)(Object) req.getParameter("path");
        MyHelperClass URLDecoder = new MyHelperClass();
        path =(String)(Object) URLDecoder.decode(path, "UTF-8");
        String name =(String)(Object) req.getParameter("name");
        name = new String(name.getBytes(), "UTF-8");
        String contentType =(String)(Object) req.getParameter("contentType");
        if (path == null) {
            NullPointerException e = new NullPointerException("The path attribute cannot be retrieved.");
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e);
            throw e;
        }
        URL url = new URL(path);
        InputStream inStream = null;
        try {
            MyHelperClass URLUtils = new MyHelperClass();
            inStream =(InputStream)(Object) URLUtils.getFileContent(url, req.getSession().getId());
            res.setContentType(contentType);
            res.addHeader("Content-Disposition", "attachment;filename=\"" + name + "\"");
            ServletOutputStream out =(ServletOutputStream)(Object) res.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inStream, out);
            res.flushBuffer();
        } finally {
            if (inStream != null) {
                inStream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(NullPointerException o0){ return null; }
	public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getFileContent(URL o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class HttpServlet {

}

class URL {

URL(String o0){}
	URL(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class ServletOutputStream {

}
