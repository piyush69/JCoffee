import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11034629 {
public MyHelperClass cities;

    private List _getWeathersFromYahoo(String city)  throws Throwable {
        System.out.println("== get weather information of " + city + " from yahoo ==");
        try {
            MyHelperClass URL = new MyHelperClass();
            URL url = new URL(URL + cities.get(city).toString());
            InputStream input = url.openStream();
            MyHelperClass SAXParserFactory = new MyHelperClass();
            SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            factory.setNamespaceAware(false);
            SAXParser parser =(SAXParser)(Object) factory.newSAXParser();
            YahooHandler yh = new YahooHandler();
            yh.setCity(city);
            parser.parse(input, yh);
            return(List)(Object) yh.getWeathers();
        } catch (MalformedURLException e) {
            throw new WeatherException("MalformedURLException");
        } catch (IOException e) {
            throw new WeatherException("无法读取数据。");
        } catch (UncheckedIOException e) {
            throw new WeatherException("ParserConfigurationException");
        } catch (ArithmeticException e) {
            throw new WeatherException("数据格式错误，无法解析。");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass setNamespaceAware(boolean o0){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, YahooHandler o1){ return null; }}

class YahooHandler {

public MyHelperClass setCity(String o0){ return null; }
	public MyHelperClass getWeathers(){ return null; }}

class WeatherException extends Exception{
	public WeatherException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
