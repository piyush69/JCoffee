
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19910627 {
public MyHelperClass read(InputStream o0){ return null; }

    public String getData(DefaultHttpClient httpclient) {
        try {
            HttpGet get = new HttpGet("http://3dforandroid.appspot.com/api/v1/note");
            get.setHeader("Content-Type", "application/json");
            get.setHeader("Accept", "*/*");
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(get);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream instream =(InputStream)(Object) entity.getContent();
            MyHelperClass responseMessage = new MyHelperClass();
            responseMessage = read(instream);
            if (instream != null) instream.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        MyHelperClass responseMessage = new MyHelperClass();
        return (String)(Object)responseMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
