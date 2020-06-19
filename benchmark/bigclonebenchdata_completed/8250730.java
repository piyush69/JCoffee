import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8250730 {

//    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        MyHelperClass Constants = new MyHelperClass();
        String uuid = req.getParameterValues(Constants.PARAM_UUID)[0];
        String datastream = null;
//        MyHelperClass Constants = new MyHelperClass();
        if (req.getRequestURI().contains(Constants.SERVLET_DOWNLOAD_FOXML_PREFIX)) {
            resp.addHeader("Content-Disposition", "attachment; ContentType = \"text/xml\"; filename=\"" + uuid + "_local_version.foxml\"");
        } else {
//            MyHelperClass Constants = new MyHelperClass();
            datastream = req.getParameterValues(Constants.PARAM_DATASTREAM)[0];
            resp.addHeader("Content-Disposition", "attachment; ContentType = \"text/xml\"; filename=\"" + uuid + "_local_version_" + datastream + ".xml\"");
        }
//        MyHelperClass Constants = new MyHelperClass();
        String xmlContent = URLDecoder.decode(req.getParameterValues(Constants.PARAM_CONTENT)[0], "UTF-8");
        InputStream is = new ByteArrayInputStream(xmlContent.getBytes("UTF-8"));
        ServletOutputStream os =(ServletOutputStream)(Object) resp.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStreams(is, os);
        os.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PARAM_CONTENT;
	public MyHelperClass SERVLET_DOWNLOAD_FOXML_PREFIX;
	public MyHelperClass PARAM_DATASTREAM;
	public MyHelperClass PARAM_UUID;
public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass copyStreams(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getParameterValues(MyHelperClass o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
