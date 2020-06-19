
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17197657 {
public MyHelperClass url;

    private void parseXmlFile() throws IOException {
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            MyHelperClass file = new MyHelperClass();
            if (file != null) {
                MyHelperClass dom = new MyHelperClass();
                dom = db.parse(file);
            } else {
                MyHelperClass dom = new MyHelperClass();
                dom = db.parse(url.openStream());
            }
        } catch (UncheckedIOException pce) {
            pce.printStackTrace();
        } catch (ArithmeticException se) {
            se.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(MyHelperClass o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
