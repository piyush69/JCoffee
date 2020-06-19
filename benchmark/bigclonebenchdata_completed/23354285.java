
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23354285 {
public MyHelperClass populateUpdateRequest(Result o0){ return null; }

    public void updateResult(Result result) throws UnsupportedEncodingException {
        HttpPost updateRequest =(HttpPost)(Object) populateUpdateRequest(result);
        MyHelperClass clientProvider = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) clientProvider.getHttpClient();
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(updateRequest);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream input =(InputStream)(Object) entity.getContent();
                MyHelperClass HttpStatus = new MyHelperClass();
                if (HttpStatus.SC_OK != response.getStatusLine().getStatusCode()) {
                    System.out.println("Request was not accepted by the collection server. Reason:");
                    System.out.println("Status: " + response.getStatusLine().getStatusCode());
                }
                for (int c = 0; (c =(int)(Object) input.read()) > -1; ) {
                    System.out.print((char) c);
                }
                entity.consumeContent();
            }
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getHttpClient(){ return null; }}

class Result {

}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
