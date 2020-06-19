
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16632956 {

    public HttpResponse navigateTo(URI url) {
        MyHelperClass log = new MyHelperClass();
        log.debug("navigateTo: " + url.toString());
        HttpGet get = new HttpGet(url);
        try {
            MyHelperClass client = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
//            MyHelperClass log = new MyHelperClass();
            log.debug((String)(Object)response.getStatusLine());
            return response;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URI {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
