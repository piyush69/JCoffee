import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5274463 {
public MyHelperClass negotiateImageFile(JarFile o0, String o1, MyHelperClass o2){ return null; }
public MyHelperClass isIE6OrEarlier(MyHelperClass o0){ return null; }
public MyHelperClass Application;
	public MyHelperClass EventType;
	public MyHelperClass handleFileNotFound(boolean o0, HttpServletRequest o1, HttpServletResponse o2){ return null; }
public MyHelperClass cachingEnabled;
	public MyHelperClass GenericUtils;
	public MyHelperClass getContentType(String o0){ return null; }
	public MyHelperClass getJarFileName(){ return null; }

    protected void doRequest(HttpServletRequest request, HttpServletResponse response, boolean inGet) throws ServletException, IOException {
        MyHelperClass WebConsoleServlet = new MyHelperClass();
        response.setHeader("Server",(String)(Object) WebConsoleServlet.SERVER_STRING);
        try {
            String requestedFilename =(String)(Object) request.getRequestURI().substring(1);
            URL url = new URL(getJarFileName() + "/");
            JarURLConnection jarConnection = (JarURLConnection) (url.openConnection());
            JarFile jarFile =(JarFile)(Object) jarConnection.getJarFile();
            String negotiatedFilename = null;
            ZipEntry zipEntry = null;
            zipEntry =(ZipEntry)(Object) negotiateImageFile(jarFile, requestedFilename, isIE6OrEarlier(request.getHeader("User-Agent")));
            if (zipEntry == null) {
                zipEntry =(ZipEntry)(Object) jarFile.getEntry(requestedFilename);
            } else {
                negotiatedFilename =(String)(Object) zipEntry.getName();
            }
            if (zipEntry == null || (boolean)(Object)zipEntry.isDirectory()) {
                handleFileNotFound(inGet, request, response);
                return;
            }
            int fileSize = (int)(int)(Object) zipEntry.getSize();
            response.setContentLength(fileSize);
            if (negotiatedFilename != null) {
                response.setContentType(getContentType(negotiatedFilename));
            } else {
                response.setContentType(getContentType((String)(Object)request.getRequestURI()));
            }
            InputStream in =(InputStream)(Object) jarFile.getInputStream(zipEntry);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
            byte[] file = new byte[fileSize];
            int bytesRead = bufferedInputStream.read(file);
            bufferedInputStream.close();
            if (bytesRead == fileSize && (boolean)(Object)cachingEnabled) {
                SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
                java.util.Date today = new java.util.Date();
                String date =(String)(Object) formatter.format(GenericUtils.addOrSubstractDaysFromDate(today, 365));
                response.setHeader("Expires", date);
            }
            OutputStream outputStream =(OutputStream)(Object) response.getOutputStream();
            outputStream.write(file);
        } catch (FileNotFoundException e) {
            handleFileNotFound(inGet, request, response);
        } catch (IOException e) {
        } catch (Throwable t) {
            Application.getApplication().logExceptionEvent(EventType.WEB_ERROR, t);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WEB_ERROR;
	public MyHelperClass SERVER_STRING;
public MyHelperClass getApplication(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass logExceptionEvent(MyHelperClass o0, Throwable o1){ return null; }
	public MyHelperClass addOrSubstractDaysFromDate(Date o0, int o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class JarFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getName(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}
