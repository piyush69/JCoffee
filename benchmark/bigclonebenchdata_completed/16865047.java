


class c16865047 {

    public void serviceDocument(final TranslationRequest request, final TranslationResponse response, final Document document) throws Exception {
        response.addHeaders(document.getResponseHeaders());
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(document.getInputStream(), response.getOutputStream());
            MyHelperClass ResponseStateOk = new MyHelperClass();
            response.setEndState(ResponseStateOk.getInstance());
        } catch (Exception e) {
            response.setEndState(new ResponseStateException((String)(Object)e));
            MyHelperClass log = new MyHelperClass();
            log.warn("Error parsing XML of " + document, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class TranslationRequest {

}

class TranslationResponse {

public MyHelperClass addHeaders(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setEndState(ResponseStateException o0){ return null; }
	public MyHelperClass setEndState(MyHelperClass o0){ return null; }}

class Document {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }}

class ResponseStateException extends Exception{
	public ResponseStateException(String errorMessage) { super(errorMessage); }
}
