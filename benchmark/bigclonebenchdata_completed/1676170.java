


class c1676170 {

    public HttpEntity execute(final HttpRequestBase request) throws IOException, ClientProtocolException {
        MyHelperClass mClient = new MyHelperClass();
        final HttpResponse response =(HttpResponse)(Object) mClient.execute(request);
        final int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
        MyHelperClass HttpStatus = new MyHelperClass();
        if (statusCode == (int)(Object)HttpStatus.SC_OK | statusCode == (int)(Object)HttpStatus.SC_CREATED) {
            return(HttpEntity)(Object) response.getEntity();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_CREATED;
	public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpRequestBase o0){ return null; }}

class HttpRequestBase {

}

class HttpEntity {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}
