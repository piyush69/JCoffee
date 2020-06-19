
import java.io.UncheckedIOException;


class c5845421 {

    private void download(Downloadable downloadable, HttpServletResponse response) throws Exception {
        String contentType =(String)(Object) downloadable.getContentType();
        try {
            response.setContentType(contentType);
            response.setHeader("Content-Disposition", "attachment;" + " filename=" + new String((byte[])(Object)downloadable.getName().getBytes(), "ISO-8859-1"));
            OutputStream os =(OutputStream)(Object) response.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(downloadable.getInputStream(), os);
            os.flush();
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Downloadable {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
