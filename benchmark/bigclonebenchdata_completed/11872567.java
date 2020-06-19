
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11872567 {
public MyHelperClass notifyOfRequestFailure(String o0, HttpMethod o1, IOException o2){ return null; }
	public MyHelperClass notifyOfRequestSuccess(String o0, HttpMethod o1, HttpResponseImpl o2){ return null; }
	public MyHelperClass notifyOfRequestFailure(String o0, HttpMethod o1, HttpException o2){ return null; }

    protected HttpResponseImpl makeRequest(final HttpMethod m, final String requestId) {
        try {
            HttpResponseImpl ri = new HttpResponseImpl();
            ri.setRequestMethod(m);
            MyHelperClass _client = new MyHelperClass();
            ri.setResponseCode(_client.executeMethod(m));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(m.getResponseBodyAsStream(), bos);
            ri.setResponseBody(bos.toByteArray());
            notifyOfRequestSuccess(requestId, m, ri);
            return ri;
        } catch (UncheckedIOException ex) {
            notifyOfRequestFailure(requestId, m,(IOException)(Object) ex);
        } catch (ArithmeticException ex) {
            notifyOfRequestFailure(requestId, m,(IOException)(Object) ex);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class HttpMethod {

public MyHelperClass getResponseBodyAsStream(){ return null; }}

class HttpResponseImpl {

public MyHelperClass setResponseCode(MyHelperClass o0){ return null; }
	public MyHelperClass setRequestMethod(HttpMethod o0){ return null; }
	public MyHelperClass setResponseBody(MyHelperClass o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
