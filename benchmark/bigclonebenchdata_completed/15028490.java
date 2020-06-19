


class c15028490 {

    public Document load(java.net.URL url) throws DOMTestLoadException {
        Document doc = null;
        Exception parseException = null;
        try {
            LoadErrorHandler errorHandler = new LoadErrorHandler();
            MyHelperClass builder = new MyHelperClass();
            builder.setErrorHandler(errorHandler);
//            MyHelperClass builder = new MyHelperClass();
            doc =(Document)(Object) builder.parse((InputStream)(Object)url.openStream(), url.toString());
            parseException =(Exception)(Object) errorHandler.getFirstException();
        } catch (Exception ex) {
            parseException = ex;
        }
        MyHelperClass builder = new MyHelperClass();
        builder.setErrorHandler(null);
        if (parseException != null) {
            throw new DOMTestLoadException((String)(Object)parseException);
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setErrorHandler(Object o0){ return null; }
	public MyHelperClass parse(InputStream o0, String o1){ return null; }
	public MyHelperClass setErrorHandler(LoadErrorHandler o0){ return null; }}

class Document {

}

class DOMTestLoadException extends Exception{
	public DOMTestLoadException(String errorMessage) { super(errorMessage); }
}

class LoadErrorHandler {

public MyHelperClass getFirstException(){ return null; }}

class InputStream {

}
