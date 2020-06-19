


class c14883984 {

    private Document parseResponse(String url) throws IOException, MalformedURLException, ParserConfigurationException, SAXException {
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilder db =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputStream stream = null;
        try {
            stream =(InputStream)(Object) (new URL(url).openStream());
            return(Document)(Object) db.parse(stream);
        } finally {
            if (stream != null) stream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }}

class Document {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
