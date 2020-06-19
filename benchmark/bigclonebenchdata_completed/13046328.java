
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13046328 {
public MyHelperClass processRespons(InputStream o0, boolean o1){ return null; }
public MyHelperClass m_url;
	public MyHelperClass getRequestData(){ return null; }
	public MyHelperClass validate(){ return null; }

    public FlickrObject perform(boolean chkResponse) throws FlickrException {
        validate();
        String data =(String)(Object) getRequestData();
        OutputStream os = null;
        InputStream is = null;
        try {
            URL url = null;
            try {
                url = new URL(m_url);
            } catch (UncheckedIOException mux) {
                IllegalStateException iax = new IllegalStateException();
                iax.initCause(mux);
                throw iax;
            }
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            os =(OutputStream)(Object) con.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            osw.write(data);
            osw.flush();
            is =(InputStream)(Object) con.getInputStream();
            return(FlickrObject)(Object) processRespons(is, chkResponse);
        } catch (UncheckedIOException fx) {
            throw fx;
        } catch (ArithmeticException iox) {
            throw new FlickrException((String)(Object)iox);
        } finally {
            if (os != null) try {
                os.close();
            } catch (UncheckedIOException _) {
            }
            if (is != null) try {
                is.close();
            } catch (UncheckedIOException _) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FlickrObject {

}

class FlickrException extends Exception{
	public FlickrException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(OutputStream o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
