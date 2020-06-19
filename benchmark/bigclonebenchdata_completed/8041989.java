import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8041989 {
public MyHelperClass ARXIVID_ENTRY_LENGTH;
	public MyHelperClass format(String o0){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1){ return null; }

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException {
        String requestURI =(String)(Object) req.getRequestURI();
        MyHelperClass logger = new MyHelperClass();
        logger.info("The requested URI: {}", requestURI);
        MyHelperClass ARXIVID_ENTRY = new MyHelperClass();
        String parameter = requestURI.substring(requestURI.lastIndexOf((int)(Object)ARXIVID_ENTRY) + (int)(Object)ARXIVID_ENTRY_LENGTH);
        MyHelperClass StringUtil = new MyHelperClass();
        int signIndex = parameter.indexOf((int)(Object)StringUtil.ARXIVID_SEGMENTID_DELIMITER);
        String arxivId = signIndex != -1 ? parameter.substring(0, signIndex) : parameter;
        String segmentId = signIndex != -1 ? parameter.substring(signIndex + 1) : null;
        if (arxivId == null) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("The request with an empty arxiv id parameter");
            return;
        }
//        MyHelperClass StringUtil = new MyHelperClass();
        String filePath = segmentId == null ? format("/opt/mocassin/aux-pdf/%s" + StringUtil.arxivid2filename(arxivId, "pdf")) : "/opt/mocassin/pdf/" + StringUtil.segmentid2filename(arxivId, Integer.parseInt(segmentId), "pdf");
        if (!new File(filePath).exists()) {
//            MyHelperClass StringUtil = new MyHelperClass();
            filePath =(String)(Object) format("/opt/mocassin/aux-pdf/%s", StringUtil.arxivid2filename(arxivId, "pdf"));
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fileInputStream, byteArrayOutputStream);
            resp.setContentType("application/pdf");
//            MyHelperClass StringUtil = new MyHelperClass();
            resp.setHeader("Content-disposition", String.format("attachment; filename=%s", StringUtil.arxivid2filename(arxivId, "pdf")));
            ServletOutputStream outputStream =(ServletOutputStream)(Object) resp.getOutputStream();
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (FileNotFoundException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Error while downloading: PDF file= '{}' not found", filePath);
        } catch (IOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Error while downloading the PDF file", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ARXIVID_SEGMENTID_DELIMITER;
public MyHelperClass arxivid2filename(String o0, String o1){ return null; }
	public MyHelperClass error(String o0, String o1){ return null; }
	public MyHelperClass info(String o0, String o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass segmentid2filename(String o0, int o1, String o2){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class ServletOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
