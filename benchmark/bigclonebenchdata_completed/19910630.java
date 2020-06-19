
import java.io.UncheckedIOException;


class c19910630 {
public MyHelperClass read(InputStream o0){ return null; }

    public String postData(String result, DefaultHttpClient httpclient) {
        try {
            HttpPost post = new HttpPost("http://3dforandroid.appspot.com/api/v1/note/create");
            StringEntity se = new StringEntity(result);
            MyHelperClass HTTP = new MyHelperClass();
            se.setContentEncoding(HTTP.UTF_8);
            se.setContentType("application/json");
            post.setEntity(se);
            post.setHeader("Content-Type", "application/json");
            post.setHeader("Accept", "*/*");
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(post);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream instream;
            instream =(InputStream)(Object) entity.getContent();
            MyHelperClass responseMessage = new MyHelperClass();
            responseMessage = read(instream);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        MyHelperClass responseMessage = new MyHelperClass();
        return (String)(Object)responseMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}
	public MyHelperClass setContentEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
