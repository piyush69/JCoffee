import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9209383 {
public MyHelperClass getImageAsStream(HttpServletRequest o0, Map<String o1, String o2){ return null; }

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        final Map<String, String> fileAttr = new HashMap<String, String>();
        boolean download = false;
        String dw = req.getParameter("d");
        MyHelperClass StringUtils = new MyHelperClass();
        if (StringUtils.isNotEmpty(dw) && StringUtils.equals(dw, "true")) {
            download = true;
        }
        MyHelperClass DEFAULT_CONTENT_LENGTH_SIZE = new MyHelperClass();
        final ByteArrayOutputStream imageOutputStream = new ByteArrayOutputStream((int)(Object)DEFAULT_CONTENT_LENGTH_SIZE);
        InputStream imageInputStream = null;
        try {
            imageInputStream = getImageAsStream(req, fileAttr);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(imageInputStream, imageOutputStream);
            resp.setHeader("Cache-Control", "no-store");
            resp.setHeader("Pragma", "no-cache");
            resp.setDateHeader("Expires", 0);
            resp.setContentType(fileAttr.get("mimetype"));
            if (download) {
                resp.setHeader("Content-Disposition", "attachment; filename=\"" + fileAttr.get("filename") + "\"");
            }
            final ServletOutputStream responseOutputStream = resp.getOutputStream();
            responseOutputStream.write(imageOutputStream.toByteArray());
            responseOutputStream.flush();
            responseOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            resp.getWriter().println("<h1>Sorry... cannot find document</h1>");
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(imageInputStream);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(imageOutputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass isNotEmpty(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setDateHeader(String o0, int o1){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class Object {

public MyHelperClass equals(String o0, String o1){ return null; }}
