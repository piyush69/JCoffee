


class c19602723 {

    public static String getCoordinates(String city) throws MalformedURLException, IOException, ParserConfigurationException, SAXException {
        String url = "http://ws.geonames.org/search?q=" + city + "&maxRows=1&lang=it&username=lorenzo.abram";
        URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
        InputStream response =(InputStream)(Object) conn.getInputStream();
        GeonamesHandler handler = new GeonamesHandler();
        MyHelperClass SAXParserFactory = new MyHelperClass();
        SAXParserFactory factory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
        SAXParser parser =(SAXParser)(Object) factory.newSAXParser();
        parser.parse(response, handler);
        return(String)(Object) handler.getCoord();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class GeonamesHandler {

public MyHelperClass getCoord(){ return null; }}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass parse(InputStream o0, GeonamesHandler o1){ return null; }}
