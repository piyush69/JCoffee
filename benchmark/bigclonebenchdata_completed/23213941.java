
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23213941 {
public MyHelperClass url_spec;
	public MyHelperClass proxyPort;

//    @Override
    protected void writeSnapshot(final String message, final String details) {
        try {
            MyHelperClass proxyAddress = new MyHelperClass();
            final URL url = proxyAddress == null ? new URL(url_spec) : new URL("http", proxyAddress, proxyPort, url_spec);
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("connect to " + url);
            final URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            final HttpQueryWriter out = new HttpQueryWriter(connection.getOutputStream());
            out.addParameter("error", message);
            out.addParameter("trace", details);
            out.close();
            final InputStream in =(InputStream)(Object) connection.getInputStream();
            int c;
            final StringBuffer result = new StringBuffer();
            while ((c =(int)(Object) in.read()) != -1) {
                result.append((char) c);
            }
//            MyHelperClass LOG = new MyHelperClass();
            LOG.info(result);
            in.close();
        } catch (final UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("could not find host (unknown host) to submit log to");
        } catch (final ArithmeticException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("i/o problem submitting log",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0, IOException o1){ return null; }
	public MyHelperClass info(StringBuffer o0){ return null; }}

class URL {

URL(){}
	URL(String o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class HttpQueryWriter {

HttpQueryWriter(){}
	HttpQueryWriter(MyHelperClass o0){}
	public MyHelperClass addParameter(String o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
