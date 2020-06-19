


class c22456788 {
public MyHelperClass readInputStream(InputStream o0){ return null; }

//    @Test
    public void testClient() throws ClientProtocolException, IOException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpHost proxy = new HttpHost("127.0.0.1", 1280, "http");
        HttpGet httpget = new HttpGet("http://a.b.c.d/pdn/");
        MyHelperClass ConnRoutePNames = new MyHelperClass();
        httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        System.out.println("executing request " + httpget.getURI());
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        System.out.println("----------------------------------------");
        System.out.println(response.getStatusLine());
        if (entity != null) {
            System.out.println("Response content length: " + entity.getContentLength());
        }
        InputStream is =(InputStream)(Object) response.getEntity().getContent();
        readInputStream(is);
        System.out.println("----------------------------------------");
        httpget.abort();
        httpclient.getConnectionManager().shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_PROXY;
public MyHelperClass setParameter(MyHelperClass o0, HttpHost o1){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpHost {

HttpHost(){}
	HttpHost(String o0, int o1, String o2){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }
	public MyHelperClass getURI(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContentLength(){ return null; }}

class InputStream {

}
