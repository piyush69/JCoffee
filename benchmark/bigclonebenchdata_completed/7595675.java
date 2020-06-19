


class c7595675 {

    private String getStreamUrl(String adress) throws MalformedURLException, IOException, ParserConfigurationException, SAXException {
        URL url = new URL(adress);
        InputStream is =(InputStream)(Object) url.openStream();
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilder builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
        org.w3c.dom.Document doc =(org.w3c.dom.Document)(Object)(Document)(Object) builder.parse(is);
        MyHelperClass LINK_TAG_NAME = new MyHelperClass();
        Node linkTag =(Node)(Object) doc.getElementsByTagName((String)(Object)LINK_TAG_NAME).item(0);
        MyHelperClass LINK_ATTR_NAME = new MyHelperClass();
        String StreamUrl =(String)(Object) linkTag.getAttributes().getNamedItem(LINK_ATTR_NAME).getNodeValue();
        return StreamUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass getNamedItem(MyHelperClass o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

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

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Node {

public MyHelperClass getAttributes(){ return null; }}

class Document {

}
