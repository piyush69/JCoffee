
import java.io.UncheckedIOException;


class c9909126 {
public MyHelperClass getKey(TranslationRequest o0){ return null; }

    public void service(TranslationRequest request, TranslationResponse response) {
        try {
            Thread.sleep((long) Math.random() * 250);
        } catch (InterruptedException e1) {
        }
        MyHelperClass hits = new MyHelperClass();
        hits.incrementAndGet();
        String key =(String)(Object) getKey(request);
        MyHelperClass cache = new MyHelperClass();
        RequestResponse cachedResponse =(RequestResponse)(Object) cache.get(key);
        if (cachedResponse == null) {
            MyHelperClass ResponseCode = new MyHelperClass();
            response.setEndState((ResponseStateException)(Object)new ResponseStateBean(ResponseCode.ERROR, "response not found for " + key));
            return;
        }
        response.addHeaders(cachedResponse.getExpectedResponse().getHeaders());
        response.setTranslationCount(cachedResponse.getExpectedResponse().getTranslationCount());
        response.setFailCount(cachedResponse.getExpectedResponse().getFailCount());
        if ((int)(Object)cachedResponse.getExpectedResponse().getLastModified() != -1) {
            response.setLastModified(cachedResponse.getExpectedResponse().getLastModified());
        }
        try {
            OutputStream output =(OutputStream)(Object) response.getOutputStream();
            InputStream input =(InputStream)(Object) cachedResponse.getExpectedResponse().getInputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(input);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
            }
        } catch (UncheckedIOException e) {
            response.setEndState(new ResponseStateException((String)(Object)e));
            return;
        }
        response.setEndState((ResponseStateException)(Object)cachedResponse.getExpectedResponse().getEndState());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass incrementAndGet(){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getTranslationCount(){ return null; }
	public MyHelperClass getFailCount(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getEndState(){ return null; }}

class TranslationRequest {

}

class TranslationResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeaders(MyHelperClass o0){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass setFailCount(MyHelperClass o0){ return null; }
	public MyHelperClass setEndState(ResponseStateException o0){ return null; }
	public MyHelperClass setTranslationCount(MyHelperClass o0){ return null; }}

class RequestResponse {

public MyHelperClass getExpectedResponse(){ return null; }}

class ResponseStateBean {

ResponseStateBean(){}
	ResponseStateBean(MyHelperClass o0, String o1){}}

class OutputStream {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ResponseStateException extends Exception{
	public ResponseStateException(String errorMessage) { super(errorMessage); }
}
