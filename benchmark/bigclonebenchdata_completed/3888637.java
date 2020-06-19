


class c3888637 {
public MyHelperClass HttpConnectionParams;
	public MyHelperClass identityEncoding(Header o0){ return null; }

    public VeecheckResult performRequest(VeecheckVersion version, String uri) throws ClientProtocolException, IOException, IllegalStateException, SAXException {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpParams params =(HttpParams)(Object) client.getParams();
        MyHelperClass CONNECTION_TIMEOUT = new MyHelperClass();
        HttpConnectionParams.setConnectionTimeout(params, CONNECTION_TIMEOUT);
        MyHelperClass SO_TIMEOUT = new MyHelperClass();
        HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);
        HttpGet request = new HttpGet(version.substitute(uri));
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        try {
            StatusLine line =(StatusLine)(Object) response.getStatusLine();
            if ((int)(Object)line.getStatusCode() != 200) throw new IOException("Request failed: " + line.getReasonPhrase());
            MyHelperClass HTTP = new MyHelperClass();
            Header header =(Header)(Object) response.getFirstHeader(HTTP.CONTENT_TYPE);
            Encoding encoding =(Encoding)(Object) identityEncoding(header);
            VeecheckResult handler = new VeecheckResult(version);
            MyHelperClass Xml = new MyHelperClass();
            Xml.parse(entity.getContent(), encoding, handler);
            return handler;
        } finally {
            entity.consumeContent();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_TYPE;
public MyHelperClass parse(MyHelperClass o0, Encoding o1, VeecheckResult o2){ return null; }
	public MyHelperClass setSoTimeout(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass setConnectionTimeout(HttpParams o0, MyHelperClass o1){ return null; }}

class VeecheckVersion {

public MyHelperClass substitute(String o0){ return null; }}

class VeecheckResult {

VeecheckResult(VeecheckVersion o0){}
	VeecheckResult(){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpParams {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getFirstHeader(MyHelperClass o0){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

class Header {

}

class Encoding {

}
