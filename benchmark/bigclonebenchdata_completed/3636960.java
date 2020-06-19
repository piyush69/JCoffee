
import java.io.UncheckedIOException;


class c3636960 {

    public void display(WebPage page, HttpServletRequest req, HttpServletResponse resp) throws DisplayException {
        page.getDisplayInitialiser().initDisplay(new HttpRequestDisplayContext(req), req);
        MyHelperClass INPUTSTREAM_KEY = new MyHelperClass();
        StreamProvider is = (StreamProvider)(StreamProvider)(Object) req.getAttribute(INPUTSTREAM_KEY);
        if (is == null) {
            throw new IllegalStateException("No OutputStreamDisplayHandlerXML.InputStream found in request attribute" + " OutputStreamDisplayHandlerXML.INPUTSTREAM_KEY");
        }
        resp.setContentType(is.getMimeType());
        resp.setHeader("Content-Disposition", "attachment;filename=" + is.getName());
        try {
            InputStream in =(InputStream)(Object) is.getInputStream();
            OutputStream out =(OutputStream)(Object) resp.getOutputStream();
            if (in != null) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            }
            is.write(resp.getOutputStream());
            resp.flushBuffer();
        } catch (UncheckedIOException e) {
            throw new DisplayException("Error writing input stream to response",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass initDisplay(HttpRequestDisplayContext o0, HttpServletRequest o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class WebPage {

public MyHelperClass getDisplayInitialiser(){ return null; }}

class HttpServletRequest {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class DisplayException extends Exception{
	public DisplayException(String errorMessage) { super(errorMessage); }
	DisplayException(String o0, IOException o1){}
	DisplayException(){}
}

class HttpRequestDisplayContext {

HttpRequestDisplayContext(){}
	HttpRequestDisplayContext(HttpServletRequest o0){}}

class StreamProvider {

public MyHelperClass getMimeType(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class InputStream {

}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
