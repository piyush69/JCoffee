


class c18298936 {

    protected InputStream makeRequestAndGetJSONData(String url) throws URISyntaxException, ClientProtocolException, IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        URI uri;
        InputStream data = null;
        uri = new URI(url);
        HttpGet method = new HttpGet(uri);
        HttpResponse response =(HttpResponse)(Object) httpClient.execute(method);
        data =(InputStream)(Object) response.getEntity().getContent();
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class URI {

URI(String o0){}
	URI(){}}

class HttpGet {

HttpGet(URI o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
