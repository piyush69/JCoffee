


class c17874479 {

    public static final void main(String[] args) throws Exception {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://www.apache.org/");
        System.out.println("executing request " + httpget.getURI());
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        System.out.println("----------------------------------------");
        System.out.println(response.getStatusLine());
        if (entity != null) {
            System.out.println("Response content length: " + entity.getContentLength());
        }
        System.out.println("----------------------------------------");
        httpget.abort();
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

public MyHelperClass getContentLength(){ return null; }}
