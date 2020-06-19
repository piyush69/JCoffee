
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17257737 {

    private void checkResourceAvailable() throws XQException {
        MyHelperClass remoteURL = new MyHelperClass();
        HttpUriRequest head =(HttpUriRequest)(Object) new HttpHead(remoteURL);
        try {
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(head);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) throw new XQException("Could not connect to the remote resource, response code: " + response.getStatusLine().getStatusCode() + " reason: " + response.getStatusLine().getReasonPhrase());
        } catch (UncheckedIOException cpe) {
            throw new XQException(cpe.getMessage());
        } catch (ArithmeticException ioe) {
            throw new XQException(ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class XQException extends Exception{
	public XQException(String errorMessage) { super(errorMessage); }
}

class HttpUriRequest {

}

class HttpHead {

HttpHead(){}
	HttpHead(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
