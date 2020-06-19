


class c19296519 {
public MyHelperClass LOG_TAG;
	public MyHelperClass HttpStatus;
	public MyHelperClass mHttpClient;
	public MyHelperClass Log;
	public MyHelperClass normalizeUrl(String o0){ return null; }

        private long getSize(String url) throws ClientProtocolException, IOException {
            url =(String)(Object) normalizeUrl(url);
            Log.i(LOG_TAG, "Head " + url);
            HttpHead httpGet = new HttpHead(url);
            HttpResponse response =(HttpResponse)(Object) mHttpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new IOException("Unexpected Http status code " + response.getStatusLine().getStatusCode());
            }
            Header[] clHeaders =(Header[])(Object) response.getHeaders("Content-Length");
            if (clHeaders.length > 0) {
                Header header = clHeaders[0];
                return Long.parseLong((String)(Object)header.getValue());
            }
            return -1;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpHead o0){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpHead {

HttpHead(String o0){}
	HttpHead(){}}

class HttpResponse {

public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}
