
import java.io.UncheckedIOException;


class c6677391 {
public MyHelperClass logger;

//    @Override
    protected void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqPath =(String)(Object) req.getPathInfo();
        if (reqPath.startsWith("/")) reqPath = reqPath.substring(1);
        MyHelperClass zipInfo = new MyHelperClass();
        ZipEntry entry =(ZipEntry)(Object) zipInfo.get(reqPath);
        if (entry == null) {
            MyHelperClass Utils = new MyHelperClass();
            logger.debug((String)(Object)Utils.join("Requested path not found: [", reqPath, "]"));
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        MyHelperClass Utils = new MyHelperClass();
        logger.debug((String)(Object)Utils.join("Requested path: [", reqPath, "]"));
        MyHelperClass ServletUtils = new MyHelperClass();
        ServletUtils.establishContentType(reqPath, resp);
        InputStream in = null;
        try {
            MyHelperClass zipFile = new MyHelperClass();
            in =(InputStream)(Object) new BufferedInputStream(zipFile.getInputStream(entry));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, resp.getOutputStream());
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Rendered: " + reqPath);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("zipped resource not found: " + reqPath);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass establishContentType(String o0, HttpServletResponse o1){ return null; }
	public MyHelperClass join(String o0, String o1, String o2){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
