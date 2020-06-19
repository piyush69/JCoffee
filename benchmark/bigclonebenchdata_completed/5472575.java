
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5472575 {
public MyHelperClass client;
	public MyHelperClass ArrayUtils;
	public MyHelperClass context;

    public void run() {
        MyHelperClass result = new MyHelperClass();
        result.setValid(false);
        try {
            MyHelperClass method = new MyHelperClass();
            final HttpResponse response =(HttpResponse)(Object) client.execute(method, context);
            MyHelperClass validCodes = new MyHelperClass();
            result.setValid((boolean)(Object)ArrayUtils.contains(validCodes, response.getStatusLine().getStatusCode()));
//            MyHelperClass result = new MyHelperClass();
            result.setResult(response.getStatusLine().getStatusCode());
        } catch (final UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error((ClientProtocolException)(Object)e);
//            MyHelperClass result = new MyHelperClass();
            result.setValid(false);
        } catch (final ArithmeticException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error((ClientProtocolException)(Object)e);
//            MyHelperClass result = new MyHelperClass();
            result.setValid(false);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(ClientProtocolException o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass setResult(MyHelperClass o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setValid(boolean o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
