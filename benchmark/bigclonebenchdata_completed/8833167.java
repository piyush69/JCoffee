import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8833167 {

    @SuppressWarnings("unchecked")
    private final D loadMeta(URL url) throws Throwable, IOException {
        SAXParser saxParser;
        try {
            MyHelperClass SAX_PARSER_FACTORY = new MyHelperClass();
            saxParser =(SAXParser)(Object) SAX_PARSER_FACTORY.newSAXParser();
        } catch (UncheckedIOException e) {
            throw new Error(e);
        } catch (ArithmeticException e) {
            throw new Error(e);
        }
        try {
            saxParser.setProperty("http://xml.org/sax/features/validation", false);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        MetaParser handler = new MetaParser();
        try {
            saxParser.parse(url.openStream(), handler);
        } catch (UncheckedIOException e) {
            throw new ParsingException((String)(Object)e);
        }
        return ((D)(D)(Object) handler.getMetaData());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newSAXParser(){ return null; }}

class D {

}

class SAXParser {

public MyHelperClass setProperty(String o0, boolean o1){ return null; }
	public MyHelperClass parse(InputStream o0, MetaParser o1){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class SAXNotRecognizedException extends Exception{
	public SAXNotRecognizedException(String errorMessage) { super(errorMessage); }
}

class SAXNotSupportedException extends Exception{
	public SAXNotSupportedException(String errorMessage) { super(errorMessage); }
}

class MetaParser {

public MyHelperClass getMetaData(){ return null; }}

class ParsingException extends Exception{
	public ParsingException(String errorMessage) { super(errorMessage); }
}
