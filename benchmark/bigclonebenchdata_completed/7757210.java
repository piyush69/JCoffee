import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7757210 {

//    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response)  throws Throwable {
        InputStream input = null;
        ServletOutputStream output = null;
        try {
            String savePath =(String)(Object) request.getSession().getServletContext().getRealPath("/upload");
            String fileType = ".log";
            String dbFileName = "83tomcat日志测试哦";
            String downloadFileName = dbFileName + fileType;
            String finalPath = "\\2011-12\\01\\8364b45f-244d-41b6-bbf48df32064a935";
            downloadFileName = new String(downloadFileName.getBytes("GBK"), "ISO-8859-1");
            File downloadFile = new File(savePath + finalPath);
            if (!downloadFile.getParentFile().exists()) {
                downloadFile.getParentFile().mkdirs();
            }
            if (!downloadFile.isFile()) {
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.touch(downloadFile);
            }
            response.setContentType("aapplication/vnd.ms-excel ;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-disposition", "attachment; filename=" + downloadFileName);
            input = new FileInputStream(downloadFile);
            output =(ServletOutputStream)(Object) response.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, output);
            output.flush();
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Exception: ", e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(InputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(ServletOutputStream o0){ return null; }
	public MyHelperClass touch(File o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setCharacterEncoding(String o0){ return null; }}

class RequestMapping {

}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
