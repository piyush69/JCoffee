


class c18837074 {

    public void testReceiveMessageWithHttpPost() throws ClientProtocolException, IOException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://192.167.131.126/hotel/sms/create.htm");
        String receipt = "2#12345:source:079456345:200:xxx:1234567809:userfred:";
        String message = "11796 book owner2 password 238 12.09.2008 3 testname surname";
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        params.setParameter("TextMessage", message);
        httpPost.setParams(params);
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpPost);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setParams(HttpParams o0){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}
