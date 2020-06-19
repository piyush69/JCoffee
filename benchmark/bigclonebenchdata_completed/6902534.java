


class c6902534 {
public MyHelperClass getVirtualWiki(HttpServletRequest o0){ return null; }
public MyHelperClass Environment;
	public MyHelperClass IOUtils;
	public MyHelperClass logger;
	public MyHelperClass getEnvironment(){ return null; }
	public MyHelperClass getMimeByExtension(){ return null; }

    public void doAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String attachmentName =(String)(Object) request.getParameter("attachment");
        String virtualWiki =(String)(Object) getVirtualWiki(request);
        File uploadPath =(File)(Object) getEnvironment().uploadPath(virtualWiki, attachmentName);
        response.reset();
        response.setHeader("Content-Disposition", getEnvironment().getStringSetting(Environment.PROPERTY_ATTACHMENT_TYPE) + ";filename=" + attachmentName + ";");
        int dotIndex = attachmentName.indexOf('.');
        if (dotIndex >= 0 && dotIndex < attachmentName.length() - 1) {
            String extension = attachmentName.substring(attachmentName.lastIndexOf('.') + 1);
            logger.fine("Extension: " + extension);
            String mimetype = (String)(String)(Object) getMimeByExtension().get(extension.toLowerCase());
            logger.fine("MIME: " + mimetype);
            if (mimetype != null) {
                logger.fine("Setting content type to: " + mimetype);
                response.setContentType(mimetype);
            }
        }
        FileInputStream in = null;
        ServletOutputStream out = null;
        try {
            in = new FileInputStream(uploadPath);
            out =(ServletOutputStream)(Object) response.getOutputStream();
            IOUtils.copy(in, out);
            out.flush();
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROPERTY_ATTACHMENT_TYPE;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass closeQuietly(ServletOutputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass getStringSetting(MyHelperClass o0){ return null; }
	public MyHelperClass uploadPath(String o0, String o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass reset(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }}
