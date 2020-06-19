
import java.io.UncheckedIOException;


class c19279420 {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass leechget = new MyHelperClass();
        final FileManager fmanager =(FileManager)(Object) FileManager.getFileManager(request, leechget);
        ServletFileUpload upload = new ServletFileUpload();
        FileItemIterator iter;
        try {
            iter =(FileItemIterator)(Object) upload.getItemIterator(request);
            while ((boolean)(Object)iter.hasNext()) {
                FileItemStream item =(FileItemStream)(Object) iter.next();
                String name =(String)(Object) item.getFieldName();
                InputStream stream =(InputStream)(Object) item.openStream();
                if (!(Boolean)(Object)item.isFormField()) {
                    final FileObject file =(FileObject)(Object) fmanager.getFile(name);
                    if (!(Boolean)(Object)file.exists()) {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copyLarge(stream, file.getContent().getOutputStream());
                    }
                }
            }
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass copyLarge(InputStream o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileManager {

public MyHelperClass getFile(String o0){ return null; }
	public static MyHelperClass getFileManager(HttpServletRequest o0, MyHelperClass o1){ return null; }}

class ServletFileUpload {

public MyHelperClass getItemIterator(HttpServletRequest o0){ return null; }}

class FileItemIterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FileItemStream {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFieldName(){ return null; }
	public MyHelperClass isFormField(){ return null; }}

class InputStream {

}

class FileObject {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileUploadException extends Exception{
	public FileUploadException(String errorMessage) { super(errorMessage); }
}
