
import java.io.UncheckedIOException;


class c19697621 {
public MyHelperClass Code;

    public TemplateLibrary loadTemplateLibrary(GadgetContext context, Uri uri) throws GadgetException {
        HttpRequest request = new HttpRequest(uri);
        request.setCacheTtl(300);
        MyHelperClass pipeline = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) pipeline.execute(request);
        MyHelperClass HttpResponse = new MyHelperClass();
        if (response.getHttpStatusCode() != HttpResponse.SC_OK) {
            throw new GadgetException(Code.FAILED_TO_RETRIEVE_CONTENT, "Unable to retrieve template library xml. HTTP error " + response.getHttpStatusCode());
        }
        String content =(String)(Object) response.getResponseAsString();
        try {
            String key = null;
            Element element = null;
            if (!(Boolean)(Object)context.getIgnoreCache()) {
                MyHelperClass HashUtil = new MyHelperClass();
                key =(String)(Object) HashUtil.rawChecksum(content.getBytes());
                MyHelperClass parsedXmlCache = new MyHelperClass();
                element =(Element)(Object) parsedXmlCache.getElement(key);
            }
            if (element == null) {
                MyHelperClass XmlUtil = new MyHelperClass();
                element =(Element)(Object) XmlUtil.parse(content);
                if (key != null) {
                    MyHelperClass parsedXmlCache = new MyHelperClass();
                    parsedXmlCache.addElement(key, element);
                }
            }
            return (TemplateLibrary)(Object)new XmlTemplateLibrary(uri, element, content);
        } catch (UncheckedIOException e) {
            throw new GadgetException(Code.MALFORMED_XML_DOCUMENT,(XmlException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass FAILED_TO_RETRIEVE_CONTENT;
	public MyHelperClass MALFORMED_XML_DOCUMENT;
public MyHelperClass rawChecksum(byte[] o0){ return null; }
	public MyHelperClass addElement(String o0, Element o1){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass getElement(String o0){ return null; }}

class GadgetContext {

public MyHelperClass getIgnoreCache(){ return null; }}

class Uri {

}

class TemplateLibrary {

}

class GadgetException extends Exception{
	public GadgetException(String errorMessage) { super(errorMessage); }
	GadgetException(){}
	GadgetException(MyHelperClass o0, XmlException o1){}
	GadgetException(MyHelperClass o0, String o1){}
}

class HttpRequest {

HttpRequest(Uri o0){}
	HttpRequest(){}
	public MyHelperClass setCacheTtl(int o0){ return null; }}

class HttpResponse {

public MyHelperClass getHttpStatusCode(){ return null; }
	public MyHelperClass getResponseAsString(){ return null; }}

class Element {

}

class XmlTemplateLibrary {

XmlTemplateLibrary(Uri o0, Element o1, String o2){}
	XmlTemplateLibrary(){}}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}
