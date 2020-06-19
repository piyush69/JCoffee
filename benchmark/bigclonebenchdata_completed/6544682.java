


class c6544682 {

    private String getXML(String url) throws ClientProtocolException, IOException {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
        HttpResponse responseGet =(HttpResponse)(Object) client.execute(get);
        HttpEntity resEntityGet =(HttpEntity)(Object) responseGet.getEntity();
        BufferedReader in = new BufferedReader(new InputStreamReader(resEntityGet.getContent()));
        StringBuffer sb = new StringBuffer("");
        String line = "";
        String NL = System.getProperty("line.separator");
        while ((line =(String)(Object) in.readLine()) != null) {
            sb.append(line + NL);
        }
        in.close();
        String xml = sb.toString();
        return xml;
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

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
