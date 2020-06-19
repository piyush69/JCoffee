


class c3011461 {
public MyHelperClass httpClient;
	public MyHelperClass HttpStatus;
	public MyHelperClass Config;
	public MyHelperClass maybeCreateHttpClient(){ return null; }

    private String sendToServer(String request) throws IOException {
        MyHelperClass Log = new MyHelperClass();
        Log.d("test", "request body " + request);
        String result = null;
        maybeCreateHttpClient();
        HttpPost post = new HttpPost(Config.APP_BASE_URI);
        post.addHeader("Content-Type", "text/vnd.aexp.json.req");
        post.setEntity(new StringEntity(request));
        HttpResponse resp =(HttpResponse)(Object) httpClient.execute(post);
        int status =(int)(Object) resp.getStatusLine().getStatusCode();
        if (status != (int)(Object)HttpStatus.SC_OK) throw new IOException("HTTP status: " + Integer.toString(status));
        DataInputStream is = new DataInputStream(resp.getEntity().getContent());
        result =(String)(Object) is.readLine();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass APP_BASE_URI;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(String o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}
