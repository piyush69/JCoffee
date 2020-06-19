


class c8156588 {
public static MyHelperClass Log;
//public MyHelperClass Log;

    private static final BufferedInputStream createInputStreamFromRemoteUrl(String uri, ClientConnectionManager connectionManager) {
        InputStream contentInput = null;
        if (connectionManager == null) {
            try {
                URL url =(URL)(Object) (new URI(uri).toURL());
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.connect();
                contentInput =(InputStream)(Object) conn.getInputStream();
            } catch (Exception e) {
                MyHelperClass TAG = new MyHelperClass();
                Log.w(TAG, "Request failed: " + uri);
                e.printStackTrace();
                return null;
            }
        } else {
            MyHelperClass HTTP_PARAMS = new MyHelperClass();
            final DefaultHttpClient mHttpClient = new DefaultHttpClient(connectionManager, HTTP_PARAMS);
            HttpUriRequest request =(HttpUriRequest)(Object) new HttpGet(uri);
            HttpResponse httpResponse = null;
            try {
                httpResponse =(HttpResponse)(Object) mHttpClient.execute(request);
                HttpEntity entity =(HttpEntity)(Object) httpResponse.getEntity();
                if (entity != null) {
                    contentInput =(InputStream)(Object) entity.getContent();
                }
            } catch (Exception e) {
                MyHelperClass TAG = new MyHelperClass();
                Log.w(TAG, "Request failed: " + request.getURI());
                return null;
            }
        }
        if (contentInput != null) {
            return new BufferedInputStream(contentInput, 4096);
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass w(MyHelperClass o0, String o1){ return null; }}

class ClientConnectionManager {

}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(InputStream o0, int o1){}}

class InputStream {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass toURL(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(ClientConnectionManager o0, MyHelperClass o1){}
	public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class HttpUriRequest {

public MyHelperClass getURI(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}
