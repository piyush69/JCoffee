
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1784150 {
public MyHelperClass client;
	public MyHelperClass getURL(){ return null; }

    private InputStream execute(String filter, String query) {
        DefaultHttpClient client;// = new DefaultHttpClient();
        client = new DefaultHttpClient();
        String url =(String)(Object) getURL();
        String trenn = "?";
        if (filter != null) {
            url += trenn + "filter=" + filter;
            trenn = "&";
        }
        if (query != null) {
            url += trenn + "query=" + query;
        }
        HttpGet get = new HttpGet(url);
        System.out.println("get: " + url);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            return(InputStream)(Object) entity.getContent();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }}

class InputStream {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}
