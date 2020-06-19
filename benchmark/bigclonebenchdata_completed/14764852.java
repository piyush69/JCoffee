
import java.io.UncheckedIOException;


class c14764852 {
public MyHelperClass putHeaders(HttpRequest o0, MyHelperClass o1){ return null; }
	public MyHelperClass createConnection(HttpMethods o0, URI o1){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }
	public MyHelperClass putHeaders(HttpRequest o0, HttpHeader[] o1){ return null; }

    public HttpResponse doRequest(HttpMethods method, HttpHeader[] headers, boolean auth, URI target, BlipMessagePart body) throws HttpRequestException {
        HttpRequest con =(HttpRequest)(Object) createConnection(method, target);
        MyHelperClass defaultHeaders = new MyHelperClass();
        if (defaultHeaders != null) {
//            MyHelperClass defaultHeaders = new MyHelperClass();
            putHeaders(con, defaultHeaders);
        }
        if (headers != null) {
            putHeaders(con, headers);
        }
        try {
            MyHelperClass authStrategy = new MyHelperClass();
            if (auth && authStrategy != null) {
//                MyHelperClass authStrategy = new MyHelperClass();
                authStrategy.perform(con);
            }
            if (body != null) {
                MyHelperClass bodyGenerator = new MyHelperClass();
                bodyGenerator.writeBody(con, body);
            }
            HttpResponse res =(HttpResponse)(Object) execute(con);
            return res;
        } catch (UncheckedIOException e) {
            throw new HttpRequestException("Error executing request",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass perform(HttpRequest o0){ return null; }
	public MyHelperClass writeBody(HttpRequest o0, BlipMessagePart o1){ return null; }}

class HttpMethods {

}

class HttpHeader {

}

class URI {

}

class BlipMessagePart {

}

class HttpResponse {

}

class E {

}

class HttpRequestException extends Exception{
	public HttpRequestException(String errorMessage) { super(errorMessage); }
	HttpRequestException(String o0, IOException o1){}
	HttpRequestException(){}
}

class HttpRequest {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
