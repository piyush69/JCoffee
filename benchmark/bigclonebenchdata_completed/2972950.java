
import java.io.UncheckedIOException;


class c2972950 {

    private void proxyMediaServlet(String url, HttpServletRequest req, HttpServletResponse resp) {
        try {
            URL u = new URL("http://mediaserver:8080/sagex" + url);
            MyHelperClass log = new MyHelperClass();
            log.debug("Proxy Media: " + u.toString());
            URLConnection c =(URLConnection)(Object) u.openConnection();
            c.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.1) Gecko/2008072820 Firefox/3.0.1");
            OutputStream os =(OutputStream)(Object) resp.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(c.getInputStream(), os);
            os.flush();
            resp.flushBuffer();
        } catch (Throwable t) {
            MyHelperClass log = new MyHelperClass();
            log.error("Failed to get url: " + url, t);
            try {
                resp.sendError(500, t.getMessage());
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass sendError(int o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
