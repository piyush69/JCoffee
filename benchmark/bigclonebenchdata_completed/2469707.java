import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2469707 {
public MyHelperClass KrameriusImageSupport;
public MyHelperClass fedoraAccess;
	public MyHelperClass JPEG;
	public MyHelperClass ClientUtils;
	public MyHelperClass RESTHelper;

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        MyHelperClass Constants = new MyHelperClass();
        resp.addHeader("Cache-Control", "max-age=" + Constants.HTTP_CACHE_SECONDS);
//        MyHelperClass Constants = new MyHelperClass();
        String uuid =(String)(Object) req.getRequestURI().substring((int)(Object)req.getRequestURI().indexOf(Constants.SERVLET_FULL_PREFIX) + (int)(Object)Constants.SERVLET_FULL_PREFIX.length() + 1);
//        MyHelperClass Constants = new MyHelperClass();
        boolean notScale =(boolean)(Object) ClientUtils.toBoolean(req.getParameter(Constants.URL_PARAM_NOT_SCALE));
        ServletOutputStream os =(ServletOutputStream)(Object) resp.getOutputStream();
        if (uuid != null && !"".equals(uuid)) {
            try {
                MyHelperClass FedoraUtils = new MyHelperClass();
                String mimetype =(String)(Object) fedoraAccess.getMimeTypeForStream(uuid, FedoraUtils.IMG_FULL_STREAM);
                if (mimetype == null) {
                    mimetype = "image/jpeg";
                }
                MyHelperClass ImageMimeType = new MyHelperClass();
                ImageMimeType loadFromMimeType =(ImageMimeType)(Object) ImageMimeType.loadFromMimeType(mimetype);
//                MyHelperClass ImageMimeType = new MyHelperClass();
                if (loadFromMimeType == (ImageMimeType)(Object)ImageMimeType.JPEG || loadFromMimeType == (ImageMimeType)(Object)ImageMimeType.PNG) {
                    StringBuffer sb = new StringBuffer();
                    MyHelperClass config = new MyHelperClass();
                    sb.append(config.getFedoraHost()).append("/objects/").append(uuid).append("/datastreams/IMG_FULL/content");
//                    MyHelperClass config = new MyHelperClass();
                    InputStream is =(InputStream)(Object) RESTHelper.get(sb.toString(), config.getFedoraLogin(), config.getFedoraPassword(), false);
                    if (is == null) {
                        return;
                    }
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copyStreams(is, os);
                    } catch (ArithmeticException e) {
                        resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.error("Unable to open full image.",(XPathExpressionException)(Object) e);
                    } finally {
                        os.flush();
                        if (is != null) {
                            try {
                                is.close();
                            } catch (IOException e) {
                                resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                                MyHelperClass LOGGER = new MyHelperClass();
                                LOGGER.error("Unable to close stream.", e);
                            } finally {
                                is = null;
                            }
                        }
                    }
                } else {
//                    MyHelperClass FedoraUtils = new MyHelperClass();
                    Image rawImg =(Image)(Object) KrameriusImageSupport.readImage(uuid, FedoraUtils.IMG_FULL_STREAM, this.fedoraAccess, 0, loadFromMimeType);
                    BufferedImage scaled = null;
                    if (!notScale) {
                        MyHelperClass KrameriusImageSupport = new MyHelperClass();
                        scaled =(BufferedImage)(Object) KrameriusImageSupport.getSmallerImage(rawImg, 1250, 1000);
                    } else {
                        MyHelperClass KrameriusImageSupport = new MyHelperClass();
                        scaled =(BufferedImage)(Object) KrameriusImageSupport.getSmallerImage(rawImg, 2500, 2000);
                    }
                    MyHelperClass KrameriusImageSupport = new MyHelperClass();
                    KrameriusImageSupport.writeImageToStream(scaled, "JPG", os);
                    resp.setContentType(JPEG.getValue());
                    resp.setStatus(HttpURLConnection.HTTP_OK);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Unable to open full image.",(XPathExpressionException)(Object) e);
            } catch (ArrayStoreException e) {
                resp.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Unable to create XPath expression.",(XPathExpressionException)(Object) e);
            } finally {
                os.flush();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMG_FULL_STREAM;
	public MyHelperClass HTTP_CACHE_SECONDS;
	public MyHelperClass PNG;
	public MyHelperClass SERVLET_FULL_PREFIX;
	public MyHelperClass URL_PARAM_NOT_SCALE;
	public MyHelperClass JPEG;
public MyHelperClass getValue(){ return null; }
	public MyHelperClass copyStreams(InputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getSmallerImage(Image o0, int o1, int o2){ return null; }
	public MyHelperClass writeImageToStream(BufferedImage o0, String o1, ServletOutputStream o2){ return null; }
	public MyHelperClass getMimeTypeForStream(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getFedoraLogin(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass error(String o0, XPathExpressionException o1){ return null; }
	public MyHelperClass getFedoraHost(){ return null; }
	public MyHelperClass getFedoraPassword(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass loadFromMimeType(String o0){ return null; }
	public MyHelperClass toBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass readImage(String o0, MyHelperClass o1, MyHelperClass o2, int o3, ImageMimeType o4){ return null; }
	public MyHelperClass get(String o0, MyHelperClass o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass indexOf(MyHelperClass o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}

class ImageMimeType {

}

class Image {

}

class BufferedImage {

}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}
