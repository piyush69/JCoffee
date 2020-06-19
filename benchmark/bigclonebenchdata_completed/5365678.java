import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5365678 {
public MyHelperClass NULL;
public MyHelperClass htmlPanel;
	public MyHelperClass constructFileUrlString(Files o0, boolean o1){ return null; }

    public void buildDocument(Files page) {
        String uri =(String)(Object) constructFileUrlString(page, true);
        URL url;
        try {
            url = new URL(uri);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            InputStream in =(InputStream)(Object) connection.getInputStream();
            Reader reader = new InputStreamReader(in, "UTF8");
            InputSourceImpl xsltInputSource =(InputSourceImpl)(Object) NULL; //new InputSourceImpl();
            xsltInputSource = new InputSourceImpl(reader, uri);
//            MyHelperClass xsltInputSource = new MyHelperClass();
            xsltInputSource.setEncoding("utf-8");
            UserAgentContext ucontext =(UserAgentContext)(Object) new LocalUserAgentContext();
            HtmlRendererContext rendererContext =(HtmlRendererContext)(Object) new LocalHtmlRendererContext(htmlPanel, ucontext);
            DocumentBuilderImpl builder = new DocumentBuilderImpl(rendererContext.getUserAgentContext(), rendererContext);
            InputSourceImpl xsltDocument =(InputSourceImpl)(Object) NULL; //new InputSourceImpl();
            xsltDocument =(InputSourceImpl)(Object) builder.parse((MyHelperClass)(Object)xsltInputSource);
//            MyHelperClass xsltDocument = new MyHelperClass();
            htmlPanel.setDocument((MyHelperClass)(Object)xsltDocument, rendererContext);
            String documentHolder =(String)(Object) NULL; //new String();
            documentHolder = xsltDocument.toString();
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDocument(MyHelperClass o0, HtmlRendererContext o1){ return null; }
	public MyHelperClass setEncoding(String o0){ return null; }}

class Files {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class UserAgentContext {

}

class HtmlRendererContext {

public MyHelperClass getUserAgentContext(){ return null; }}

class DocumentBuilderImpl {

DocumentBuilderImpl(MyHelperClass o0, HtmlRendererContext o1){}
	DocumentBuilderImpl(){}
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class InputSourceImpl {

InputSourceImpl(){}
	InputSourceImpl(Reader o0, String o1){}
	public MyHelperClass setEncoding(String o0){ return null; }}

class LocalUserAgentContext {

}

class LocalHtmlRendererContext {

LocalHtmlRendererContext(){}
	LocalHtmlRendererContext(MyHelperClass o0, UserAgentContext o1){}}
