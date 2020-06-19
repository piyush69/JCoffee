
import java.io.UncheckedIOException;


class c17835466 {
public MyHelperClass TYPE_HELM;
	public MyHelperClass TYPE_VOTABLE;
	public MyHelperClass TYPE_SPASE;

    private void readXML() throws IOException, SAXException {
        DocumentBuilder builder = null;
        try {
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
        }
        MyHelperClass url = new MyHelperClass();
        InputSource source = new InputSource(url.openStream());
        MyHelperClass document = new MyHelperClass();
        document = builder.parse(source);
//        MyHelperClass document = new MyHelperClass();
        Node n =(Node)(Object) document.getDocumentElement();
        String localName =(String)(Object) n.getNodeName();
        int i = localName.indexOf(":");
        if (i > -1) {
            localName = localName.substring(i + 1);
        }
        if (localName.equals("Spase")) {
            MyHelperClass type = new MyHelperClass();
            type = TYPE_SPASE;
        } else if (localName.equals("Eventlist")) {
            MyHelperClass type = new MyHelperClass();
            type = TYPE_HELM;
        } else if (localName.equals("VOTABLE")) {
            MyHelperClass type = new MyHelperClass();
            type = TYPE_VOTABLE;
        } else {
            throw new IllegalArgumentException("Unsupported XML type, root node should be Spase or Eventlist");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getDocumentElement(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}}

class Node {

public MyHelperClass getNodeName(){ return null; }}
