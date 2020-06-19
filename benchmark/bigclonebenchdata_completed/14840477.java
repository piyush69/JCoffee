import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14840477 {
public static MyHelperClass XML_FILE;
	public static MyHelperClass XMLReaderFactory;
//public MyHelperClass XML_FILE;
//	public MyHelperClass XMLReaderFactory;

    private static synchronized void find(String name) throws Throwable, SAXException, IOException {
        MyHelperClass c_cache = new MyHelperClass();
        if ((boolean)(Object)c_cache.containsKey(name)) return;
        CustomHandler handler = null;
        URL url = null;
        MyHelperClass Config = new MyHelperClass();
        String validatorFiles = (String)(String)(Object) Config.getProperty(Config.PROP_RULES_ENGINE_VALIDATORS_URL_LIST, XML_FILE);
        for (StringTokenizer strtknzr = new StringTokenizer(validatorFiles, ","); strtknzr.hasMoreTokens(); ) {
            String validatorFile = strtknzr.nextToken();
            try {
                MyHelperClass URLHelper = new MyHelperClass();
                url =(URL)(Object) URLHelper.newExtendedURL(validatorFile);
            } catch (MalformedURLException e) {
                url = null;
            }
            if (url == null) throw new FileNotFoundException("File not found - " + validatorFile);
            try {
                handler = new CustomHandler(name);
                MyHelperClass PARSER_NAME = new MyHelperClass();
                XMLReader reader =(XMLReader)(Object) XMLReaderFactory.createXMLReader(PARSER_NAME);
                reader.setContentHandler(handler);
                reader.setEntityResolver(new DefaultEntityResolver());
                reader.setErrorHandler(new DefaultErrorHandler());
                reader.parse(new InputSource(url.openStream()));
            } catch (SAXException e) {
                MyHelperClass SUCCESS_MESSAGE = new MyHelperClass();
                if (SUCCESS_MESSAGE.equals(e.getMessage()) && handler != null) break; else throw e;
            } catch (IOException e) {
                throw e;
            }
            if (handler.getFieldValidatorMetaData() != null) break;
        }
//        MyHelperClass c_cache = new MyHelperClass();
        c_cache.put(name, handler != null ? handler.getFieldValidatorMetaData() : null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROP_RULES_ENGINE_VALIDATORS_URL_LIST;
public MyHelperClass newExtendedURL(String o0){ return null; }
	public MyHelperClass createXMLReader(MyHelperClass o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0, MyHelperClass o1){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class CustomHandler {

CustomHandler(String o0){}
	CustomHandler(){}
	public MyHelperClass getFieldValidatorMetaData(){ return null; }}

class XMLReader {

public MyHelperClass setErrorHandler(DefaultErrorHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setContentHandler(CustomHandler o0){ return null; }
	public MyHelperClass setEntityResolver(DefaultEntityResolver o0){ return null; }}

class DefaultEntityResolver {

}

class DefaultErrorHandler {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}
