


class c15519967 {

    private void output(HttpServletResponse resp, InputStream is, long length, String fileName) throws Exception {
        resp.reset();
        String mimeType = "image/jpeg";
        resp.setContentType(mimeType);
        resp.setContentLength((int) length);
        resp.setHeader("Content-Disposition", "inline; filename=\"" + fileName + "\"");
        resp.setHeader("Cache-Control", "must-revalidate");
        ServletOutputStream sout =(ServletOutputStream)(Object) resp.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, sout);
        sout.flush();
        resp.flushBuffer();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class InputStream {

}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
