import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8250731 {
public MyHelperClass RESTHelper;
	public MyHelperClass XML_HEADER_WITH_BACKSLASHES;

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        MyHelperClass Constants = new MyHelperClass();
        String uuid = req.getParameterValues(Constants.PARAM_UUID)[0];
        String datastream = null;
//        MyHelperClass Constants = new MyHelperClass();
        if (req.getRequestURI().contains(Constants.SERVLET_DOWNLOAD_FOXML_PREFIX)) {
            resp.addHeader("Content-Disposition", "attachment; ContentType = \"text/xml\"; filename=\"" + uuid + "_server_version.foxml\"");
        } else {
//            MyHelperClass Constants = new MyHelperClass();
            datastream = req.getParameterValues(Constants.PARAM_DATASTREAM)[0];
            resp.addHeader("Content-Disposition", "attachment; ContentType = \"text/xml\"; filename=\"" + uuid + "_server_version_" + datastream + ".xml\"");
        }
        ServletOutputStream os =(ServletOutputStream)(Object) resp.getOutputStream();
        if (uuid != null && !"".equals(uuid)) {
            try {
                StringBuffer sb = new StringBuffer();
//                MyHelperClass Constants = new MyHelperClass();
                if (req.getRequestURI().contains(Constants.SERVLET_DOWNLOAD_FOXML_PREFIX)) {
                    MyHelperClass config = new MyHelperClass();
                    sb.append(config.getFedoraHost()).append("/objects/").append(uuid).append("/objectXML");
//                MyHelperClass Constants = new MyHelperClass();
                } else if (req.getRequestURI().contains(Constants.SERVLET_DOWNLOAD_DATASTREAMS_PREFIX)) {
                    MyHelperClass config = new MyHelperClass();
                    sb.append(config.getFedoraHost()).append("/objects/").append(uuid).append("/datastreams/").append(datastream).append("/content");
                }
                MyHelperClass config = new MyHelperClass();
                InputStream is = RESTHelper.get(sb.toString(), config.getFedoraLogin(), config.getFedoraPassword(), false);
                if (is == null) {
                    return;
                }
                try {
//                    MyHelperClass Constants = new MyHelperClass();
                    if (req.getRequestURI().contains(Constants.SERVLET_DOWNLOAD_DATASTREAMS_PREFIX)) {
                        os.write(XML_HEADER_WITH_BACKSLASHES.getBytes());
                    }
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyStreams(is, os);
                } catch (IOException e) {
                    resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("Problem with downloading foxml.", e);
                } finally {
                    os.flush();
                    if (is != null) {
                        try {
                            is.close();
                        } catch (IOException e) {
                            resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                            MyHelperClass LOGGER = new MyHelperClass();
                            LOGGER.error("Problem with downloading foxml.", e);
                        } finally {
                            is = null;
                        }
                    }
                }
            } catch (IOException e) {
                resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Problem with downloading foxml.", e);
            } finally {
                os.flush();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVLET_DOWNLOAD_DATASTREAMS_PREFIX;
	public MyHelperClass SERVLET_DOWNLOAD_FOXML_PREFIX;
	public MyHelperClass PARAM_DATASTREAM;
	public MyHelperClass PARAM_UUID;
public MyHelperClass getFedoraPassword(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass get(String o0, MyHelperClass o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass getFedoraHost(){ return null; }
	public MyHelperClass getFedoraLogin(){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass copyStreams(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getParameterValues(MyHelperClass o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
