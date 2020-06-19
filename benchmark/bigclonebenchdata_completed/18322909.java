import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18322909 {

//    @Override
    public void run() {
        YouTubeFeedParserHandler parserHandler = new YouTubeFeedParserHandler();
        MyHelperClass SAXParserFactory = new MyHelperClass();
        SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
        try {
            MyHelperClass m_YouTubeFeedUrl = new MyHelperClass();
            URL url = new URL((String)(Object)m_YouTubeFeedUrl);
            SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
            XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
            xr.setContentHandler(parserHandler);
            InputStream is = url.openStream();
            InputSource input = new InputSource(is);
            xr.parse(input);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class YouTubeFeedParserHandler {

}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(YouTubeFeedParserHandler o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
