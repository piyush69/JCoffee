import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c14164143 {
public MyHelperClass getHttpClient(){ return null; }

    protected HttpResponse executeRequest(AbstractHttpRequest request) throws ConnectionException, RequestCancelledException {
        try {
            HttpResponse response =(HttpResponse)(Object) getHttpClient().execute(request);
            if (!(Boolean)(Object)response.is2xxSuccess()) {
                throw new ConnectionException();
            }
            return response;
        } catch (UncheckedIOException ex) {
            throw new ConnectionException();
        } catch (ArithmeticException ex) {
            throw new ConnectionException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(AbstractHttpRequest o0){ return null; }}

class AbstractHttpRequest {

}

class HttpResponse {

public MyHelperClass is2xxSuccess(){ return null; }}

class ConnectionException extends Exception{
	public ConnectionException(String errorMessage) { super(errorMessage); }
	ConnectionException(){}
}

class RequestCancelledException extends Exception{
	public RequestCancelledException(String errorMessage) { super(errorMessage); }
}

class TimeoutException extends Exception{
	public TimeoutException(String errorMessage) { super(errorMessage); }
}
