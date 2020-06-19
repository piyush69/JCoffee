import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8856524 {
public MyHelperClass Validate;
	public MyHelperClass request;
	public MyHelperClass IOUtils;
	public MyHelperClass log;
	public MyHelperClass ServletActionContext;
	public MyHelperClass setImgdirpath(Object o0){ return null; }
	public MyHelperClass isexistdir(){ return null; }
	public MyHelperClass getImgdirpath(){ return null; }

//    @Action(value = "ajaxFileUploads", results = {  })
    public void ajaxFileUploads() throws Throwable, IOException {
        String extName = "";
        String newFilename = "";
        String nowTimeStr = "";
        String realpath = "";
        if ((boolean)(Object)Validate.StrNotNull(this.getImgdirpath())) {
            realpath = "Uploads/" + this.getImgdirpath() + "/";
        } else {
            realpath =(String)(Object) this.isexistdir();
        }
        SimpleDateFormat sDateFormat;
        Random r = new Random();
        String savePath =(String)(Object) ServletActionContext.getServletContext().getRealPath("");
        savePath = savePath + realpath;
        HttpServletResponse response =(HttpServletResponse)(Object) ServletActionContext.getResponse();
        int rannum = (int) (r.nextDouble() * (99999 - 1000 + 1)) + 10000;
        sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        nowTimeStr =(String)(Object) sDateFormat.format(new Date());
        String filename =(String)(Object) request.getHeader("X-File-Name");
        if (filename.lastIndexOf(".") >= 0) {
            extName = filename.substring(filename.lastIndexOf("."));
        }
        newFilename = nowTimeStr + rannum + extName;
        PrintWriter writer = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            writer =(PrintWriter)(Object) response.getWriter();
        } catch (ArithmeticException ex) {
            log.debug(ImgTAction.class.getName() + "has thrown an exception:" + ex.getMessage());
        }
        try {
            is =(InputStream)(Object) request.getInputStream();
            fos = new FileOutputStream(new File(savePath + newFilename));
            IOUtils.copy(is, fos);
            response.setStatus(response.SC_OK);
            writer.print("{success:'" + realpath + newFilename + "'}");
        } catch (FileNotFoundException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log.debug(ImgTAction.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (IOException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log.debug(ImgTAction.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                this.setImgdirpath(null);
                fos.close();
                is.close();
            } catch (IOException ignored) {
            }
        }
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getResponse(){ return null; }
	public MyHelperClass StrNotNull(MyHelperClass o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }}

class Action {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_INTERNAL_SERVER_ERROR;
	public MyHelperClass SC_OK;
public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class ImgTAction {

}
