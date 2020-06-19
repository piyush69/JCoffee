import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4779156 {

//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        String id = request.getRequestURI().split("/")[3];
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("request: " + id + " from: " + request.getRemoteHost());
        MyHelperClass manager = new MyHelperClass();
        Song song =(Song)(Object) manager.find(id);
        if (song != null) {
            File file = new File((String)(Object)song.getFile());
            if (file.exists()) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_OK);
                response.setContentType("audio/" + song.getType());
                response.setContentLength((int) file.length());
                FileInputStream stream = new FileInputStream(file);
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(stream, response.getOutputStream());
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(stream);
                }
            } else {
//                MyHelperClass log = new MyHelperClass();
                log.warn("file not found: " + file);
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
        } else {
//            MyHelperClass log = new MyHelperClass();
            log.info("song not found: " + id);
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass SC_OK;
public MyHelperClass split(String o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass find(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getRemoteHost(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Song {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getFile(){ return null; }}
