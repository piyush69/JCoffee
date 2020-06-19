import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c1416475 {

    public DocumentSummary parseDocument(URL url) throws IOException, DocumentHandlerException {
        try {
            DocumentSummary documentSummary = new DocumentSummary();
            SaxTextContentParser saxParser = new SaxTextContentParser();
            InputSource inputSource = new InputSource(url.openStream());
            documentSummary.contentReader =(MyHelperClass)(Object) new StringReader((String)(Object)saxParser.parse(inputSource));
            return documentSummary;
        } catch (UncheckedIOException e) {
            MyHelperClass GuiMessages = new MyHelperClass();
            throw new DocumentHandlerException(GuiMessages.getString("XmlDocumentHandler.xmlParsingErrorMessage.header") + e.getMessage(),(ParserConfigurationException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass GuiMessages = new MyHelperClass();
            throw new DocumentHandlerException(GuiMessages.getString("XmlDocumentHandler.xmlParsingErrorMessage.header") + e.getMessage(),(ParserConfigurationException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class DocumentSummary {
public MyHelperClass contentReader;
}

class DocumentHandlerException extends Exception{
	public DocumentHandlerException(String errorMessage) { super(errorMessage); }
	DocumentHandlerException(String o0, ParserConfigurationException o1){}
	DocumentHandlerException(){}
	DocumentHandlerException(String o0, SAXException o1){}
}

class SaxTextContentParser {

public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
