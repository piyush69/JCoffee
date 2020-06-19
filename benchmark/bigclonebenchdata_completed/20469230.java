
import java.io.UncheckedIOException;


class c20469230 {

    public static final void main(String[] args) throws Exception {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://www.apache.org/");
        System.out.println("executing request " + httpget.getURI());
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        System.out.println("----------------------------------------");
        System.out.println(response.getStatusLine());
        System.out.println("----------------------------------------");
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        if (entity != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
            try {
                System.out.println(reader.readLine());
            } catch (UncheckedIOException ex) {
                throw ex;
            } catch (RuntimeException ex) {
                httpget.abort();
                throw ex;
            } finally {
                reader.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
