


class c10242903 {
public MyHelperClass URIFactory;

    private List getFeatures(String source, EntryPoint e) throws MalformedURLException, SAXException, IOException, ParserConfigurationException, URISyntaxException {
        MyHelperClass SAXParserFactory = new MyHelperClass();
        SAXParser parser =(SAXParser)(Object) SAXParserFactory.newInstance().newSAXParser();
        FeatureParser featp = new FeatureParser();
        MyHelperClass serverPrefix = new MyHelperClass();
        parser.parse(URIFactory.url(serverPrefix + "/das/" + source + "/features?segment=" + e.id + ":" + e.start + "," + e.stop).openStream(), featp);
        return(List)(Object) featp.list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass url(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newSAXParser(){ return null; }}

class EntryPoint {
public MyHelperClass start;
	public MyHelperClass stop;
	public MyHelperClass id;
}

class List {

}

class Feature {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class SAXParser {

public MyHelperClass parse(MyHelperClass o0, FeatureParser o1){ return null; }}

class FeatureParser {
public MyHelperClass list;
}
