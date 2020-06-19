


class c14193058 {
public static MyHelperClass CookiePolicy;
	public static MyHelperClass convertStreamToString(InputStream o0){ return null; }
//public MyHelperClass CookiePolicy;
//	public MyHelperClass convertStreamToString(InputStream o0){ return null; }

    public static String submitURLRequest(String url) throws HttpException, IOException, URISyntaxException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        InputStream stream = null;
        LinkedList user_agents;// = new LinkedList();
        user_agents = new LinkedList();
//        MyHelperClass user_agents = new MyHelperClass();
        user_agents.add("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        String response_text = "";
        URI uri = new URI(url);
        HttpGet post = new HttpGet(uri);
//        MyHelperClass user_agents = new MyHelperClass();
        int MAX =(int)(Object) user_agents.size() - 1;
        int index = (int) Math.round(((double) Math.random() * (MAX)));
//        MyHelperClass user_agents = new MyHelperClass();
        String agent =(String)(Object) user_agents.get(index);
        MyHelperClass CoreProtocolPNames = new MyHelperClass();
        httpclient.getParams().setParameter(CoreProtocolPNames.USER_AGENT, agent);
        httpclient.getParams().setParameter("User-Agent", agent);
        MyHelperClass ClientPNames = new MyHelperClass();
        httpclient.getParams().setParameter(ClientPNames.COOKIE_POLICY,(String)(Object) CookiePolicy.ACCEPT_NONE);
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(post);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        if (entity != null) {
            stream =(InputStream)(Object) entity.getContent();
            response_text =(String)(Object) convertStreamToString(stream);
        }
        httpclient.getConnectionManager().shutdown();
        if (stream != null) {
            stream.close();
        }
        return response_text;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER_AGENT;
	public MyHelperClass ACCEPT_NONE;
	public MyHelperClass COOKIE_POLICY;
public MyHelperClass add(String o0){ return null; }
	public MyHelperClass setParameter(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setParameter(String o0, String o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass shutdown(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class URI {

URI(String o0){}
	URI(){}}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class LinkedList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass size(){ return null; }}
