
import java.io.UncheckedIOException;


class c9096612 {

    public void include(String href) throws ProteuException {
        try {
            if (href.toLowerCase().startsWith("http://")) {
                java.net.URLConnection urlConn = (new java.net.URL(href)).openConnection();
                MyHelperClass Download = new MyHelperClass();
                Download.sendInputStream(this,(InputStream)(Object) urlConn.getInputStream());
            } else {
                MyHelperClass requestHead = new MyHelperClass();
                requestHead.set("JCN_URL_INCLUDE", href);
                MyHelperClass Url = new MyHelperClass();
                Url.build(this);
            }
        } catch (UncheckedIOException pe) {
            throw pe;
        } catch (Throwable t) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Include", t);
            throw new ProteuException(t.getMessage(), t);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass sendInputStream(c9096612 o0, InputStream o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass build(c9096612 o0){ return null; }
	public MyHelperClass set(String o0, String o1){ return null; }}

class ProteuException extends Exception{
	public ProteuException(String errorMessage) { super(errorMessage); }
	ProteuException(String o0, Throwable o1){}
	ProteuException(){}
}

class InputStream {

}
