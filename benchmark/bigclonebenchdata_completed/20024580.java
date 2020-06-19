import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20024580 {
public MyHelperClass FeaturedThemesProgressHandler;
	public MyHelperClass Log;

    public void run() {
        URL url;
        InputSource i;
        Message m =(Message)(Object) FeaturedThemesProgressHandler.obtainMessage();
        try {
            MyHelperClass mUrl = new MyHelperClass();
            url = new URL((String)(Object)mUrl);
            i = new InputSource(url.openStream());
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            SAXParser sp =(SAXParser)(Object) spf.newSAXParser();
            XMLReader xr =(XMLReader)(Object) sp.getXMLReader();
            FeaturedThemesHandler fth = new FeaturedThemesHandler();
            xr.setContentHandler(fth);
            xr.parse(i);
            m.obj = fth.getParsedData();
        } catch (MalformedURLException e) {
            m.obj =(MyHelperClass)(Object) e.toString();
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "Malformed URL!", e);
        } catch (IOException e) {
            m.obj =(MyHelperClass)(Object) e.toString();
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "Exception on opening Input Stream", e);
        } catch (UncheckedIOException e) {
            m.obj =(MyHelperClass)(Object) e.toString();
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "Exception on parsing XML File",(SAXException)(Object) e);
        } catch (ArithmeticException e) {
            m.obj =(MyHelperClass)(Object) e.toString();
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "Exception while creating SAXParser",(SAXException)(Object) e);
        }
        FeaturedThemesProgressHandler.sendMessage(m);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, String o1, SAXException o2){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, ParserConfigurationException o2){ return null; }
	public MyHelperClass obtainMessage(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, MalformedURLException o2){ return null; }
	public MyHelperClass sendMessage(Message o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class Message {
public MyHelperClass obj;
}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(FeaturedThemesHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class FeaturedThemesHandler {

public MyHelperClass getParsedData(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
