


class c5870262 {
public MyHelperClass assertEquals(MyHelperClass o0, int o1){ return null; }

//    @Test
    public void testDoGet() throws Exception {
        HttpHost targetHost = new HttpHost("localhost", 8080, "http");
        DefaultHttpClient client = new DefaultHttpClient();
        client.getCredentialsProvider().setCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()), new UsernamePasswordCredentials("vince", "test56"));
        try {
            HttpGet httpget = new HttpGet("http://localhost:8080/objectwiz/api?invokeFacetOperation=createNewEntity&objectClassName=org.objectwiz.testapp.jee5.addressbook.Person&applicationName=addressbook&methodReference=persist(E)&args=(lastname=toto)");
            System.out.println("executing request " + httpget.getURI());
            HttpResponse response =(HttpResponse)(Object) client.execute(httpget);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            Header[] headers =(Header[])(Object) response.getAllHeaders();
            for (int i = 0; i < headers.length; i++) {
                Header h = headers[i];
                System.out.println(h.getName() + "/" + h.getValue());
            }
            assertEquals(response.getStatusLine().getStatusCode(), 200);
            System.out.println("----------------------------------------");
            if (entity != null) {
                System.out.println("response content length" + entity.getContentLength());
                System.out.println(entity.getContentType().getName() + "/" + entity.getContentType().getValue());
            }
            httpget.abort();
        } finally {
            client.getConnectionManager().shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Test {

}

class HttpHost {

HttpHost(){}
	HttpHost(String o0, int o1, String o2){}
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getHostName(){ return null; }}

class DefaultHttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getCredentialsProvider(){ return null; }}

class AuthScope {

AuthScope(){}
	AuthScope(MyHelperClass o0, MyHelperClass o1){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(){}
	UsernamePasswordCredentials(String o0, String o1){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }
	public MyHelperClass getURI(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class HttpEntity {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getName(){ return null; }}
