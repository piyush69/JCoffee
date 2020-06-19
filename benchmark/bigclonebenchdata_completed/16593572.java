
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16593572 {
public MyHelperClass doSendRequest(HttpRequest o0, HttpClientConnection o1, HttpContext o2){ return null; }
	public MyHelperClass doReceiveResponse(HttpRequest o0, HttpClientConnection o1, HttpContext o2){ return null; }

    public HttpResponse execute(final HttpRequest request, final HttpClientConnection conn, final HttpContext context) throws IOException, HttpException {
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (conn == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        }
        if (context == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        try {
            HttpResponse response =(HttpResponse)(Object) doSendRequest(request, conn, context);
            if (response == null) {
                response =(HttpResponse)(Object) doReceiveResponse(request, conn, context);
            }
            return response;
        } catch (UncheckedIOException ex) {
            conn.close();
            throw ex;
        } catch (ArithmeticException ex) {
            conn.close();
            throw ex;
        } catch (RuntimeException ex) {
            conn.close();
            throw ex;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpRequest {

}

class HttpClientConnection {

public MyHelperClass close(){ return null; }}

class HttpContext {

}

class HttpResponse {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
