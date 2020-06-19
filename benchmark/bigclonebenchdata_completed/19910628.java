
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19910628 {
public MyHelperClass read(InputStream o0){ return null; }

    public String deleteData(String id, DefaultHttpClient httpclient) {
        try {
            HttpDelete del = new HttpDelete("http://3dforandroid.appspot.com/api/v1/note/delete/" + id);
            del.setHeader("Content-Type", "application/json");
            del.setHeader("Accept", "*/*");
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(del);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream instream;
            instream =(InputStream)(Object) entity.getContent();
            MyHelperClass responseMessage = new MyHelperClass();
            responseMessage = read(instream);
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

public MyHelperClass execute(HttpDelete o0){ return null; }}

class HttpDelete {

HttpDelete(String o0){}
	HttpDelete(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
