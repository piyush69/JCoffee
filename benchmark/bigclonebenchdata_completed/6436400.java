
import java.io.UncheckedIOException;


class c6436400 {

//    @Override
    protected HttpResponse execute(HttpRequest con) throws HttpRequestException {
        HttpURLConnection unwrap =(HttpURLConnection)(Object) con.unwrap();
        try {
            unwrap.connect();
        } catch (UncheckedIOException e) {
            throw new HttpRequestException((String)(Object)e);
        }
        return (HttpResponse)(Object)new UrlHttpResponse(unwrap);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpRequest {

public MyHelperClass unwrap(){ return null; }}

class HttpURLConnection {

public MyHelperClass connect(){ return null; }}

class HttpResponse {

}

class HttpRequestException extends Exception{
	public HttpRequestException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UrlHttpResponse {

UrlHttpResponse(HttpURLConnection o0){}
	UrlHttpResponse(){}}
