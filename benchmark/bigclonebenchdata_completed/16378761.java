


class c16378761 {

    public static void main(String[] args) throws Exception {
        HttpGet get = new HttpGet("https://localhost/docs/index.html");
        DefaultHttpClient client = new DefaultHttpClient();
        ServerConfig config = new ServerConfig(new Properties());
        config.setParam("https.keyStoreFile", "test.keystore");
        config.setParam("https.keyPassword", "nopassword");
        config.setParam("https.keyStoreType", "JKS");
        config.setParam("https.protocol", "SSLv3");
        SSLContextCreator ssl = new SSLContextCreator(config);
        SSLContext ctx =(SSLContext)(Object) ssl.getSSLContext();
        SSLSocketFactory socketFactory = new SSLSocketFactory(ctx);
        Scheme sch = new Scheme("https", 443, socketFactory);
        client.getConnectionManager().getSchemeRegistry().register(sch);
        HttpResponse response =(HttpResponse)(Object) client.execute(get);
        System.out.println(response.getStatusLine().getStatusCode());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass register(Scheme o0){ return null; }
	public MyHelperClass getSchemeRegistry(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }}

class ServerConfig {

ServerConfig(){}
	ServerConfig(Properties o0){}
	public MyHelperClass setParam(String o0, String o1){ return null; }}

class Properties {

}

class SSLContextCreator {

SSLContextCreator(ServerConfig o0){}
	SSLContextCreator(){}
	public MyHelperClass getSSLContext(){ return null; }}

class SSLContext {

}

class SSLSocketFactory {

SSLSocketFactory(SSLContext o0){}
	SSLSocketFactory(){}}

class Scheme {

Scheme(){}
	Scheme(String o0, int o1, SSLSocketFactory o2){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
