


class c354276 {
public static MyHelperClass assemblyCookie(MyHelperClass o0){ return null; }
//public MyHelperClass assemblyCookie(MyHelperClass o0){ return null; }

    private static Result request(AbstractHttpClient client, HttpUriRequest request) throws ClientProtocolException, IOException {
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        Result result = new Result();
        result.setStatusCode(response.getStatusLine().getStatusCode());
        result.setHeaders(response.getAllHeaders());
        result.setCookie(assemblyCookie(client.getCookieStore().getCookies()));
        result.setHttpEntity(entity);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCookies(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class AbstractHttpClient {

public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class HttpUriRequest {

}

class Result {

public MyHelperClass setCookie(MyHelperClass o0){ return null; }
	public MyHelperClass setHttpEntity(HttpEntity o0){ return null; }
	public MyHelperClass setStatusCode(MyHelperClass o0){ return null; }
	public MyHelperClass setHeaders(MyHelperClass o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class HttpEntity {

}
