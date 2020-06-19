import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18385066 {

    public static Document getResponse(HttpClient client, HttpRequestBase request)  throws Throwable {
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(request);
            StatusLine statusLine =(StatusLine)(Object) response.getStatusLine();
            System.err.println(statusLine.getStatusCode() + " data: " + statusLine.getReasonPhrase());
            System.err.println("executing request " + request.getURI());
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilder db =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc =(Document)(Object) db.parse(entity.getContent());
            return doc;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpRequestBase o0){ return null; }}

class HttpRequestBase {

public MyHelperClass getURI(){ return null; }}

class Document {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
