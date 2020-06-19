
import java.io.UncheckedIOException;


class c12417893 {

//    @Override
    public byte[] download(URI uri) throws NetworkException {
        MyHelperClass log = new MyHelperClass();
        log.info("download: " + uri);
        HttpGet httpGet = new HttpGet(uri.toString());
        try {
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse httpResponse =(HttpResponse)(Object) httpClient.execute(httpGet);
            MyHelperClass EntityUtils = new MyHelperClass();
            return(byte[])(Object) EntityUtils.toByteArray(httpResponse.getEntity());
        } catch (UncheckedIOException e) {
            throw new NetworkException((String)(Object)e);
        } finally {
            httpGet.abort();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }}

class URI {

}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
