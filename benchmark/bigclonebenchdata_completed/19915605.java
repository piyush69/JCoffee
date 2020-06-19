


class c19915605 {

    public static String Execute(HttpRequestBase httprequest) throws IOException, ClientProtocolException {
        httprequest.setHeader("Accept", "application/json");
        httprequest.setHeader("Content-type", "application/json");
        String result = "";
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httprequest);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line =(String)(Object) rd.readLine()) != null) {
            result += line + "\n";
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class HttpRequestBase {

public MyHelperClass setHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpRequestBase o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
