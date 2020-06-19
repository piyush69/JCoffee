


class c12907074 {

    public static int sendButton(String url, String id, String command) throws ClientProtocolException, IOException {
        String connectString = url + "/rest/button/" + id + "/" + command;
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpPost post = new HttpPost(connectString);
        HttpResponse response =(HttpResponse)(Object) client.execute(post);
        int code =(int)(Object) response.getStatusLine().getStatusCode();
        return code;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
