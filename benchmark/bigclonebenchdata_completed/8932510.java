


class c8932510 {
public MyHelperClass streamException(HttpServletRequest o0, HttpServletResponse o1, Exception o2){ return null; }

//    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        InputStream is = null;
        InputStream page = null;
        OutputStream os = null;
        String rootUrl = null;
        try {
            MyHelperClass ServletFileUpload = new MyHelperClass();
            boolean isMultipart =(boolean)(Object) ServletFileUpload.isMultipartContent(request);
            if (!isMultipart) {
                request.setAttribute("error", "Form isn't a multipart form");
                RequestDispatcher rd =(RequestDispatcher)(Object) request.getRequestDispatcher("/WEB-INF/error.jsp");
                rd.forward(request, response);
            }
            ServletFileUpload upload = new ServletFileUpload();
            String webUrl = null;
            FileItemIterator iter =(FileItemIterator)(Object) upload.getItemIterator(request);
            while ((boolean)(Object)iter.hasNext()) {
                FileItemStream item =(FileItemStream)(Object) iter.next();
                String name =(String)(Object) item.getFieldName();
                if (name.equals("webpage")) {
                    is =(InputStream)(Object) item.openStream();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(is, baos);
                    page =(InputStream)(Object) new ByteArrayInputStream(baos.toByteArray());
                } else if (name.equals("weburl")) {
                    InputStream wpIs = null;
                    try {
                        MyHelperClass Streams = new MyHelperClass();
                        webUrl =(String)(Object) Streams.asString(item.openStream());
                        URL u = new URL(webUrl);
                        wpIs =(InputStream)(Object) new BufferedInputStream(u.openStream());
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(wpIs, baos);
                        page =(InputStream)(Object) new ByteArrayInputStream(baos.toByteArray());
                    } finally {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(wpIs);
                    }
                } else if (name.equals("rooturl")) {
                    MyHelperClass Streams = new MyHelperClass();
                    rootUrl =(String)(Object) Streams.asString(item.openStream());
                }
            }
            if (page == null) {
                request.setAttribute("error", "Form doesn't have an html file");
                RequestDispatcher rd =(RequestDispatcher)(Object) request.getRequestDispatcher("/WEB-INF/error.jsp");
                rd.forward(request, response);
            }
            ToMailerDelegate delegate = new ToMailerDelegate(page, rootUrl);
            os =(OutputStream)(Object) new BufferedOutputStream(response.getOutputStream());
            os.write(delegate.getMailer());
            os.flush();
        } catch (Exception e) {
            streamException(request, response, e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(page);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(os);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass asString(MyHelperClass o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass isMultipartContent(HttpServletRequest o0){ return null; }}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getRequestDispatcher(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class ServletFileUpload {

public MyHelperClass getItemIterator(HttpServletRequest o0){ return null; }}

class FileItemIterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FileItemStream {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFieldName(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class ToMailerDelegate {

ToMailerDelegate(){}
	ToMailerDelegate(InputStream o0, String o1){}
	public MyHelperClass getMailer(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}}
