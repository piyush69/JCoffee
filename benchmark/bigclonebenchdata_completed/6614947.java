


class c6614947 {

    public static String getPageSource(String url) throws ClientProtocolException, IOException {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        InputStream in =(InputStream)(Object) response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder source = new StringBuilder();
        String line = null;
        while ((line =(String)(Object) reader.readLine()) != null) source.append(line);
        in.close();
        return source.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
