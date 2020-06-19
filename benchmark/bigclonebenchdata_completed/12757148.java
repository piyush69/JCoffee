
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12757148 {
public MyHelperClass RESTHelper;
	public MyHelperClass MISSING;

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyHelperClass Constants = new MyHelperClass();
        resp.addHeader("Cache-Control", "max-age=" + Constants.HTTP_CACHE_SECONDS);
//        MyHelperClass Constants = new MyHelperClass();
        String uuid =(String)(Object) req.getRequestURI().substring((int)(Object)req.getRequestURI().indexOf(Constants.SERVLET_THUMBNAIL_PREFIX) + (int)(Object)Constants.SERVLET_THUMBNAIL_PREFIX.length() + 1);
        if (uuid != null && !"".equals(uuid)) {
            resp.setContentType("image/jpeg");
            StringBuffer sb = new StringBuffer();
            MyHelperClass config = new MyHelperClass();
            sb.append(config.getFedoraHost()).append("/objects/").append(uuid).append("/datastreams/IMG_THUMB/content");
            InputStream is = null;
            if (!MISSING.equals(uuid)) {
//                MyHelperClass config = new MyHelperClass();
                is =(InputStream)(Object) RESTHelper.get(sb.toString(), config.getFedoraLogin(), config.getFedoraPassword(), true);
            } else {
                is =(InputStream)(Object) new FileInputStream(new File("images/other/file_not_found.png"));
            }
            if (is == null) {
                return;
            }
            ServletOutputStream os =(ServletOutputStream)(Object) resp.getOutputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyStreams(is, os);
            } catch (UncheckedIOException e) {
            } finally {
                os.flush();
                if (is != null) {
                    try {
                        is.close();
                    } catch (UncheckedIOException e) {
                    } finally {
                        is = null;
                    }
                }
            }
            resp.setStatus(200);
        } else {
            resp.setStatus(404);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_CACHE_SECONDS;
	public MyHelperClass SERVLET_THUMBNAIL_PREFIX;
public MyHelperClass getFedoraHost(){ return null; }
	public MyHelperClass getFedoraPassword(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getFedoraLogin(){ return null; }
	public MyHelperClass get(String o0, MyHelperClass o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass indexOf(MyHelperClass o0){ return null; }
	public MyHelperClass copyStreams(InputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class File {

File(String o0){}
	File(){}}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
