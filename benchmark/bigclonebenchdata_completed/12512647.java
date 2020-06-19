import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12512647 {
public MyHelperClass processPage(LiwenxRequest o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass processCookies(LiwenxResponse o0, HttpServletResponse o1){ return null; }
	public MyHelperClass calculateContentType(Device o0){ return null; }
	public MyHelperClass processHeaders(LiwenxResponse o0, HttpServletResponse o1){ return null; }
	public MyHelperClass processUserAgent(HttpServletRequest o0){ return null; }

//    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        String userAgentGroup =(String)(Object) processUserAgent(request);
        MyHelperClass messageSource = new MyHelperClass();
        final LiwenxRequest lRequest =(LiwenxRequest)(Object) new LiwenxRequestImpl(request, response, messageSource, userAgentGroup);
        MyHelperClass router = new MyHelperClass();
        Locator loc =(Locator)(Object) router.route(lRequest);
        if ((RedirectLocator)(Object)loc instanceof RedirectLocator) {
            response.sendRedirect(((RedirectLocator)(RedirectLocator)(Object) loc).getPage());
        } else {
            ((AbstractLiwenxRequest)(AbstractLiwenxRequest)(Object) lRequest).setRequestedLocator(loc);
            try {
                MyHelperClass maxRedirections = new MyHelperClass();
                LiwenxResponse resp =(LiwenxResponse)(Object) processPage(lRequest, lRequest.getRequestedLocator(), maxRedirections);
                processHeaders(resp, response);
                processCookies(resp, response);
                if ((ExternalRedirectionResponse)(Object)resp instanceof ExternalRedirectionResponse) {
                    response.sendRedirect(((ExternalRedirectionResponse)(ExternalRedirectionResponse)(Object) resp).getRedirectTo());
                } else if ((BinaryResponse)(Object)resp instanceof BinaryResponse) {
                    BinaryResponse bResp = (BinaryResponse)(BinaryResponse)(Object) resp;
                    response.setContentType(bResp.getMimeType().toString());
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(bResp.getInputStream(), response.getOutputStream());
                } else if ((XmlResponse)(Object)resp instanceof XmlResponse) {
                    final Element root =(Element)(Object) ((XmlResponse)(XmlResponse)(Object) resp).getXml();
                    Document doc =(Document)(Object) root.getDocument();
                    if (doc == null) {
                        doc = new Document(root);
                    }
                    final Locator l =(Locator)(Object) lRequest.getCurrentLocator();
                    final Device device =(Device)(Object) l.getDevice();
                    response.setContentType(calculateContentType(device));
                    MyHelperClass encoding = new MyHelperClass();
                    response.setCharacterEncoding(encoding);
                    MyHelperClass Device = new MyHelperClass();
                    if (device == (Device)(Object)Device.HTML) {
                        MyHelperClass view = new MyHelperClass();
                        view.processView(doc, l.getLocale(), userAgentGroup, response.getWriter());
                    } else {
//                        MyHelperClass encoding = new MyHelperClass();
                        Serializer s = new Serializer(response.getOutputStream(), encoding);
                        s.write(doc);
                    }
                }
            } catch (UncheckedIOException e) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
            } catch (ArithmeticException e) {
                throw e;
            } catch (Exception e) {
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTML;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass processView(Document o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass route(LiwenxRequest o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }
	public MyHelperClass sendRedirect(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setCharacterEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class LiwenxRequest {

public MyHelperClass getCurrentLocator(){ return null; }
	public MyHelperClass getRequestedLocator(){ return null; }}

class LiwenxRequestImpl {

LiwenxRequestImpl(){}
	LiwenxRequestImpl(HttpServletRequest o0, HttpServletResponse o1, MyHelperClass o2, String o3){}}

class Locator {

public MyHelperClass getLocale(){ return null; }
	public MyHelperClass getDevice(){ return null; }}

class RedirectLocator {

public MyHelperClass getPage(){ return null; }}

class AbstractLiwenxRequest {

public MyHelperClass setRequestedLocator(Locator o0){ return null; }}

class LiwenxResponse {

}

class ExternalRedirectionResponse {

public MyHelperClass getRedirectTo(){ return null; }}

class BinaryResponse {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getMimeType(){ return null; }}

class XmlResponse {

public MyHelperClass getXml(){ return null; }}

class Element {

public MyHelperClass getDocument(){ return null; }}

class Document {

Document(Element o0){}
	Document(){}}

class Device {

}

class Serializer {

Serializer(){}
	Serializer(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass write(Document o0){ return null; }}

class PageNotFoundException extends Exception{
	public PageNotFoundException(String errorMessage) { super(errorMessage); }
}

class TooManyRedirectionsException extends Exception{
	public TooManyRedirectionsException(String errorMessage) { super(errorMessage); }
}
