
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c613085 {

    private Document getDocument(URL url) throws SAXException, IOException {
        InputStream is;
        try {
            is =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException io) {
            System.out.println("parameter error : The specified reading data is mistaken.");
            MyHelperClass sourceUri = new MyHelperClass();
            System.out.println(" Request URL is " + sourceUri);
            throw new IOException("\t" + io.toString());
        }
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
        } catch (UncheckedIOException pce) {
            System.out.println("error : The error of DocumentBuilder instance generation");
            throw new RuntimeException(pce.toString());
        }
        Document doc;
        try {
            doc =(Document)(Object) builder.parse(is);
        } catch (Exception e) {
            System.out.println("error : parse of reading data went wrong.");
            MyHelperClass sourceUri = new MyHelperClass();
            System.out.println(" Request URL is " + sourceUri);
            throw new RuntimeException(e.toString());
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Document {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
