
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17143411 {
public MyHelperClass streamAsXML(SciNameIterator o0, PrintWriter o1){ return null; }
	public MyHelperClass nameTokenStream(Reader o0){ return null; }
	public MyHelperClass streamAsJSON(SciNameIterator o0, PrintWriter o1, String o2){ return null; }
	public MyHelperClass streamAsText(SciNameIterator o0, PrintWriter o1){ return null; }
	public MyHelperClass para(HttpServletRequest o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass printHelp(PrintWriter o0){ return null; }
	public MyHelperClass para(HttpServletRequest o0, MyHelperClass o1, Object o2){ return null; }

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws WsException {
        MyHelperClass JsonWriter = new MyHelperClass();
        String callback =(String)(Object) para(req, JsonWriter.CALLBACK, null);
        MyHelperClass INPUT = new MyHelperClass();
        String input =(String)(Object) para(req, INPUT, null);
        MyHelperClass TYPE = new MyHelperClass();
        String type =(String)(Object) para(req, TYPE, "url");
        MyHelperClass FORMAT = new MyHelperClass();
        String format =(String)(Object) para(req, FORMAT, null);
        PrintWriter out = null;
        Reader contentReader = null;
        try {
            out =(PrintWriter)(Object) resp.getWriter();
            MyHelperClass StringUtils = new MyHelperClass();
            if (StringUtils.trimToNull(input) == null) {
                resp.setContentType("text/html");
                printHelp(out);
            } else {
                if (type.equalsIgnoreCase("url")) {
                    HttpGet httpget = new HttpGet(input);
                    try {
                        MyHelperClass client = new MyHelperClass();
                        HttpResponse response =(HttpResponse)(Object) client.execute(httpget);
                        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                        if (entity != null) {
                            String charset = "UTF-8";
                            contentReader =(Reader)(Object) new InputStreamReader(entity.getContent(), charset);
                            if (false) {
                                contentReader =(Reader)(Object) new FilterXmlReader(contentReader);
                            } else {
                                contentReader =(Reader)(Object) new BufferedReader(contentReader);
                            }
                        }
                    } catch (RuntimeException ex) {
                        httpget.abort();
                        throw ex;
                    }
                } else {
                    contentReader =(Reader)(Object) new StringReader(input);
                }
                long time = System.currentTimeMillis();
                TokenStream stream =(TokenStream)(Object) nameTokenStream(contentReader);
                SciNameIterator iter = new SciNameIterator(stream);
                if (format != null && format.equalsIgnoreCase("json")) {
                    resp.setContentType("application/json");
                    streamAsJSON(iter, out, callback);
                } else if (format != null && format.equalsIgnoreCase("xml")) {
                    resp.setContentType("text/xml");
                    streamAsXML(iter, out);
                } else {
                    resp.setContentType("text/plain");
                    streamAsText(iter, out);
                }
                MyHelperClass log = new MyHelperClass();
                log.info("Indexing finished in " + (System.currentTimeMillis() - time) + " msecs");
            }
        } catch (UncheckedIOException e1) {
            MyHelperClass log = new MyHelperClass();
            log.error("IOException",(IOException)(Object) e1);
            e1.printStackTrace();
        } finally {
            if (contentReader != null) {
                try {
                    contentReader.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("IOException",(IOException)(Object) e);
                }
            }
            out.flush();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CALLBACK;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass trimToNull(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class WsException extends Exception{
	public WsException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Reader {

public MyHelperClass close(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class FilterXmlReader {

FilterXmlReader(Reader o0){}
	FilterXmlReader(){}}

class BufferedReader {

BufferedReader(Reader o0){}
	BufferedReader(){}}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class TokenStream {

}

class SciNameIterator {

SciNameIterator(TokenStream o0){}
	SciNameIterator(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
