


class c2244282 {

    private InputStream loadSource(String url) throws ClientProtocolException, IOException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass HTTP = new MyHelperClass();
        httpclient.getParams().setParameter(HTTP.USER_AGENT, "Mozilla/4.0 (compatible; MSIE 7.0b; Windows NT 6.0)");
        HttpGet httpget = new HttpGet(url);
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        return(InputStream)(Object) entity.getContent();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER_AGENT;
public MyHelperClass setParameter(MyHelperClass o0, String o1){ return null; }}

class InputStream {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}
