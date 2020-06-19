


class c23299439 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contentType =(String)(Object) req.getParameter("type");
        String arg =(String)(Object) req.getParameter("file");
        if (arg == null) {
            resp.sendError(404, "Missing File Arg");
            return;
        }
        File f = new File(arg);
        if (!(Boolean)(Object)f.exists()) {
            resp.sendError(404, "Missing File: " + f);
            return;
        }
        if (contentType != null) {
            resp.setContentType(contentType);
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("Requested File: " + f + " as type: " + contentType);
        resp.setContentLength((int)(int)(Object) f.length());
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            OutputStream os =(OutputStream)(Object) resp.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(fis, os);
            os.flush();
            fis.close();
        } catch (Throwable e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed to send file: " + f);
            resp.sendError(500, "Failed to get file " + f);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fis);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copyLarge(FileInputStream o0, OutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(int o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}
