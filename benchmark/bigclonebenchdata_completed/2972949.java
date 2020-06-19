
import java.io.UncheckedIOException;


class c2972949 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("i") != null) {
            String img =(String)(Object) req.getParameter("i");
            if (img == null) {
                resp.sendError(404, "Image was null");
                return;
            }
            File f = null;
            if (img.startsWith("file")) {
                try {
                    f = new File((String)(Object)new URI(img));
                } catch (UncheckedIOException e) {
                    resp.sendError(500, e.getMessage());
                    return;
                }
            } else {
                f = new File(img);
            }
            if ((boolean)(Object)f.exists()) {
                f =(File)(Object) f.getCanonicalFile();
                if ((Boolean)(Object)f.getName().endsWith(".jpg") || (Boolean)(Object)f.getName().endsWith(".png")) {
                    resp.setContentType("image/png");
                    FileInputStream fis = null;
                    OutputStream os =(OutputStream)(Object) resp.getOutputStream();
                    try {
                        fis = new FileInputStream(f);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(fis, os);
                    } finally {
                        os.flush();
                        if (fis != null) fis.close();
                    }
                }
            }
            return;
        }
        String mediaUrl = "/media" + req.getPathInfo();
        String parts[] = mediaUrl.split("/");
        MyHelperClass mediaHandler = new MyHelperClass();
        mediaHandler.handleRequest(parts, req, resp);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handleRequest(String[] o0, HttpServletRequest o1, HttpServletResponse o2){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(int o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getCanonicalFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }}

class URI {

URI(String o0){}
	URI(){}}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}
