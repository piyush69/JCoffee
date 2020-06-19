


class c14397289 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/png");
        OutputStream outStream;
        outStream =(OutputStream)(Object) resp.getOutputStream();
        InputStream is;
        String name =(String)(Object) req.getParameter("name");
        if (name == null) {
            is =(InputStream)(Object) ImageServlet.class.getResourceAsStream("/com/actionbazaar/blank.png");
        } else {
            MyHelperClass imageBean = new MyHelperClass();
            ImageRecord imageRecord =(ImageRecord)(Object) imageBean.getFile(name);
            if (imageRecord != null) {
                is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(imageRecord.getThumbnailFile()));
            } else {
                is =(InputStream)(Object) ImageServlet.class.getResourceAsStream("/com/actionbazaar/blank.png");
            }
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, outStream);
        outStream.close();
        outStream.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}

class ImageServlet {

}

class ImageRecord {

public MyHelperClass getThumbnailFile(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
