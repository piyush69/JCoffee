


class c18327511 {

    public static void main(String[] args) throws Exception {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getCredentialsProvider().setCredentials(new AuthScope("localhost", 80), new UsernamePasswordCredentials("username", "password"));
        BasicHttpContext localcontext = new BasicHttpContext();
        DigestScheme digestAuth = new DigestScheme();
        digestAuth.overrideParamter("realm", "some realm");
        digestAuth.overrideParamter("nonce", "whatever");
        localcontext.setAttribute("preemptive-auth", digestAuth);
        httpclient.addRequestInterceptor(new PreemptiveAuth(), 0);
        httpclient.addResponseInterceptor(new PersistentDigest());
        HttpHost targetHost = new HttpHost("localhost", 80, "http");
        HttpGet httpget = new HttpGet("/");
        System.out.println("executing request: " + httpget.getRequestLine());
        System.out.println("to target: " + targetHost);
        for (int i = 0; i < 3; i++) {
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(targetHost, httpget, localcontext);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                entity.consumeContent();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass execute(HttpHost o0, HttpGet o1, BasicHttpContext o2){ return null; }
	public MyHelperClass addResponseInterceptor(PersistentDigest o0){ return null; }
	public MyHelperClass addRequestInterceptor(PreemptiveAuth o0, int o1){ return null; }}

class AuthScope {

AuthScope(String o0, int o1){}
	AuthScope(){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(String o0, String o1){}
	UsernamePasswordCredentials(){}}

class BasicHttpContext {

public MyHelperClass setAttribute(String o0, DigestScheme o1){ return null; }}

class DigestScheme {

public MyHelperClass overrideParamter(String o0, String o1){ return null; }}

class PreemptiveAuth {

}

class PersistentDigest {

}

class HttpHost {

HttpHost(String o0, int o1, String o2){}
	HttpHost(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass getRequestLine(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}
